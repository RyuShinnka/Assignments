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

    $query = "SELECT * FROM tbl_ehon";
    $re = $db->query($query);

    while ($info = $re->fetchArray(SQLITE3_ASSOC)) {
        print "id={$info['id']}, ";
        print "title={$info['title']}, ";
        print "price={$info['price']}, ";
        print "<br>\n";
    }

    $db->close();
?>

</body>
</html>