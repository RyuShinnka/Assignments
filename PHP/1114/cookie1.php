<?php
setcookie('val', 100);
?>
<html>
<head>
    <meta charset="UTF-8">
    <title>クッキーの利用</title>
</head>
<body>
<?php
// クッキーを取得
$getval = isset($_COOKIE['val']) ? $_COOKIE['val'] : "(なし)";
print "ページ1の値は $getval です<br>";
?>
<p><a href="cookie2.php">ページ２へ</a></p>
</body>
</html>
