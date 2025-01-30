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
    $db = new SQLite3("db_ehon");

    $query = "UPDATE tbl_ehon SET title='PHPの絵本' WHERE id=4";
    $re = $db->query($query);

    // 全て表示
    $query2 = "SELECT * FROM tbl_ehon";
    $res2 = $db->query($query2);

    while ($info = $res2->fetchArray(SQLITE3_ASSOC)) {
        print "id={$info['id']}, ";
        print "title={$info['title']}, ";
        print "price={$info['price']}, ";
        print "<br>\n";
    }

    $db->close();
?>

</body>
</html>