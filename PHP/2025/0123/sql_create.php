<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        // db作成
        $db = new SQLite3("db_ehon");#dbファイル名
        $query = "CREATE TABLE tbl_ehon(id INTEGER, title VARCHAR(10), price INTEGER)";#テーブル作成クエリ
        $re = $db->exec($query);#実行
        print("[db_ehon1]を作成しました");
        $db->close();#dbクローズ
    ?>
</body>
</html>