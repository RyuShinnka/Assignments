<?php

//データベース接続情報を格納
include("config.php");

//変数初期宣言
$txt_title = "";
$txt_article = "";
$txt_category_no = "";
$rad_display_type = "0";
$rad_delete_type = "0";

$dbh = new PDO($dsn, $user, $password);
$dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

//学科選択用のセレクトボックスを生成する1⃣
try{
    $dbh = new PDO($dsn, $user, $password);
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

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
    $txt_title = $_POST['txt_title'];
    $txt_article = $_POST['txt_article'];
    $sel_category_no = $_POST['sel_category_no'];
    $rad_display_type = $_POST['rad_display_type'];

    $err = "";

    if($txt_title == ""){
        $err .= "【タイトル】";
    }

    if($err == ""){

        $sql = "insert into news_v1_tbl("
                ."title"
                .",article"
                .",category_no"
                .",display_type"
                .",delete_type"
                .",insert_at"
                .",update_at"
                .") values ("
                .":title"
                .",:article"
                .",:category_no"
                .",:display_type"
                .",:delete_type"
                .",now()"
                .",now()"
                .");";

        try{
            $stmt = $dbh->prepare($sql);
            $stmt->bindValue(':title', $txt_title, PDO::PARAM_STR);
            $stmt->bindValue(':article', $txt_article, PDO::PARAM_STR);
            $stmt->bindValue(':category_no', $sel_category_no, PDO::PARAM_STR);
            $stmt->bindValue(':display_type', $rad_display_type, PDO::PARAM_STR);
            $stmt->bindValue(':delete_type', '0', PDO::PARAM_STR);
            $stmt->execute();

            header("Location:dataList.php");
        } catch(Exception $e){
            echo "データの書き込みに失敗しました。". $e->getMessage();
        }
    }else{
        echo $err."を修正してください。";
    }
}
?>

<html>
<body>

<div style="text-align: center;margin-top:20px;margin-bottom:20px;">データ登録</div>
<div style="margin-top:10px;margin-bottom:10px;"><a href="dataList.php">一覧へ戻る</a></div>
    
<form action="" method="POST">
    タイトル<br>
    <input type="text" name="txt_title" value="<?php echo $txt_title; ?>" /><br>
    内容<br>
    <textarea name="txt_article"></textarea><br>
    カテゴリー<br>
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
    <input type="submit" value="登録">
</form>
</body>
</html>