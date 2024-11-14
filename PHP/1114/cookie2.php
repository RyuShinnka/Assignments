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
    $getval = isset($_COOKIE['val']) ? $_COOKIE['val'] : "(なし)";
    print "ページ２の値は $getval です。\n"

?>
<p><a href="cookie1.php">ページ1へ</a></p>
</body>
</html>
