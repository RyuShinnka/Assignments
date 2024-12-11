
<?php

//データベース接続情報を格納
include("config.php");

$dbh = new PDO($dsn, $user, $password);
$dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

if($_SERVER['REQUEST_METHOD'] === 'POST'){

    //POSTデータの取得
    $hid_seq_no = $_POST['hid_news_no']; //削除される対象のseq_no

    if($hid_news_no !== ""){

        //UPDATE文（更新）
        $sql = "update news_v1_tbl set"
        ." delete_type = '1'"
        ." where news_no = :news_no;";

        try{
            $stmt = $dbh->prepare($sql);
            $stmt->bindValue(':news_no', $hid_seq_no, PDO::PARAM_INT);
            $stmt->execute();
        }catch (PDOException $e){
            echo($e->getMessage());
            die();
        }
    }
}

try{
    
    $sql = "select"
            ." nt.news_no"
            .",nt.title"
            .",nt.article"
            .",nt.category_no"
            .",ncm.category_name"
            .",nt.display_type"
            .",nt.update_at"
            ." from news_v1_tbl nt"
            ." inner join news_category_v1_mst ncm"
            ." on nt.category_no = ncm.category_no"
            ." where nt.delete_type = '0'"
            ." and ncm.delete_type = '0'"
            ." order by nt.update_at desc;";
    $stmt = $dbh->prepare($sql);
    $stmt->execute();

    $count = $stmt->rowCount();
    while($row = $stmt->fetch(PDO::FETCH_ASSOC)){
        $data[] = $row;
    }

}catch (PDOException $e){
    echo($e->getMessage());
    die();
}


?>
<html>
    <haed>
        <script type="text/javascript">

        document.getElementById('hid_news_no').value = "";

        function MJ_UPD(argSEQ_NO){
            document.location.href="dataUpd.php?news_no="+argSEQ_NO;
        }
        function MJ_DEL(argSEQ_NO){
            document.getElementById('hid_news_no').value = argSEQ_NO;
            document.fr01.submit();
        }
        </script>
    </head>
<body>
    <div style="text-align: center;margin-top:20px;margin-bottom:20px;">データ管理</div>
    <div style="margin-top:10px;margin-bottom:10px;">
        <a href="dataAdd.php">新規登録</a>
    </div>
    <form name="fr01" action="" method="POST">
        <input type="hidden" id="hid_news_no" name="hid_news_no" value="">
        <table border="1" style="font-size:11px;" width="100%">
            <tr>
                <th>ニュースNO</th>
                <th>タイトル</th>
                <th>カテゴリー名</th>
                <th>表示区分</th>
                <th>日付</th>
                <th>機能</th>
            </tr>
            <?php foreach($data as $row): ?>
                <tr>
                <td><?php echo $row['news_no'];?></td>
                <td><?php echo $row['title'];?></td>
                <td><?php echo $row['category_name'];?></td>
                <td><?php echo $row['display_type'];?></td>
                <td><?php echo $row['update_at'];?></td>
                <td>＜<a href="javascript:" onclick="MJ_UPD(<?php echo $row['news_no']; ?>);">更新</a>＞｜＜<a href="javascript:" onclick="MJ_DEL(<?php echo $row['news_no']; ?>);">削除</a>＞</td>
                </tr>
            <?php endforeach; ?>
        </table>
    </form>
</body>
</html>