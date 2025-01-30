<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<?php
$db=new SQLite3("db_ank");
$query="CREATE TABLE tbl_anketo(ans1 INTEGER, ans2 INTEGER)";
$re=$db->exec($query);
print("[db_ank]を作成しました");
$db->close();
?>
</body>
</html>