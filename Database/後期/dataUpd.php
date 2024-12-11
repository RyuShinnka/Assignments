<?php

//データベース接続情報を格納
include("config.php");

//変数初期宣言
$txt_title = "";
$txt_article = "";
$txt_category_no = "";
$rad_display_type = "0";
$rad_delete_type = "0";

if($_SERVER['REQUEST_METHOD'] === 'GET'){

    //GETデータの取得
    $req_news_no = $_GET['news_no'];

    if($req_news_no == ""){
        header('Location: dataList.php');
        exit();
    }
}

$dbh = new PDO($dsn, $user, $password);
$dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

//学科選択用のセレクトボックスを生成する1⃣
try{  
    //一覧取得
    $sql = "select"
            ." ncm.category_no"
            .",ncm.category_name"
            ." from news_category_v1_mst ncm"
            ." where ncm.delete_type = '0'" //削除されていないデータのみ表示
            ." order by ncm.category_no asc;";
    $stmt = $dbh->prepare($sql);
    $stmt->execute();

    while($row = $stmt->fetch(PDO::FETCH_ASSOC)){
        $dataGakka[] = $row;
    }
}catch (PDOException $e){
    echo($e->getMessage());
    die();
}

if($_SERVER['REQUEST_METHOD'] === 'POST'){

    //POSTデータの取得
    $req_news_no = $_POST['hid_news_no'];
    $txt_title = $_POST['txt_title'];
    $txt_article = $_POST['txt_article'];
    $sel_category_no = $_POST['sel_category_no'];
    $rad_display_type = $_POST['rad_display_type'];

    $err = "";

    if($txt_title == ""){
        $err .= "【タイトル】";
    }

    if($err == ""){

        $sql = "update news_v1_tbl set "
                ." title = :title"
                .",article = :article"
                .",category_no = :category_no"
                .",display_type = :display_type"
                .",update_at = now()"
                ." where news_no = :news_no;";

        try{
            $stmt = $dbh->prepare($sql);
            $stmt->bindValue(':news_no', $req_news_no , PDO::PARAM_INT);
            $stmt->bindValue(':title', $txt_title, PDO::PARAM_STR);
            $stmt->bindValue(':article', $txt_article, PDO::PARAM_STR);
            $stmt->bindValue(':category_no', $sel_category_no, PDO::PARAM_INT);
            $stmt->bindValue(':display_type', $rad_display_type, PDO::PARAM_STR);
            $stmt->execute();
            header("Location:dataList.php");
            exit();
        } catch(Exception $e){
            echo($e->getMessage());
            die();
        }
    }else{
        echo $err."を修正してください。";
    }
} else {

    try{
    
        $sql = "select"
                ." nt.news_no"
                .",nt.title"
                .",nt.article"
                .",nt.category_no"
                .",nt.display_type"
                ." from news_v1_tbl nt"
                ." where nt.news_no = :news_no";
        $stmt = $dbh->prepare($sql);
        $stmt->bindValue(':news_no', $req_news_no , PDO::PARAM_INT);
        $stmt->execute();
        $result = $stmt->fetch();

        //POSTデータの取得
        $txt_title = $result["title"];
        $txt_article = $result["article"];
        $sel_category_no = $result["category_no"];
        $rad_display_type = $result["display_type"];
        
    }catch (PDOException $e){
        echo($e->getMessage());
        die();
    }
}


?>

<html>
<body>

<div style="text-align: center;margin-top:20px;margin-bottom:20px;">データ更新</div>
<div style="margin-top:10px;margin-bottom:10px;"><a href="dataList.php">一覧へ戻る</a></div>
    
<form action="" method="POST">
    <input type="hidden" name="hid_news_no" value="<?php echo $req_news_no; ?>" />
    ニュースNO<br>
    <input type="text" name="txt_title" value="<?php echo $txt_title; ?>" /><br>
    タイトル<br>
    <input type="text" name="txt_article" value="<?php echo $txt_article; ?>" /><br>
    内容<br>
    <select name="sel_category_no">
        <?php
        foreach($dataGakka as $row):
            $strSelected = "";
            if($sel_category_no == $row['category_no']){$strSelected = " selected";}
            echo "<option value=".$row['category_no'].$strSelected.">".$row['category_name']."</option>";
        endforeach;
        ?>
    </select>
    <br>
    表示区分<br>
    <input type="radio" name="rad_display_type" value="0" <?php if($rad_display_type == "0"){echo "checked";} ?>/>表示
    <input type="radio" name="rad_display_type" value="1" <?php if($rad_display_type == "1"){echo "checked";} ?>/>非表示<br>
    <input type="submit" value="更新">
</form>
</body>
</html>