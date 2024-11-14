<?php
// セッションを開始する
session_start();
?>
<html>
<head>
    <meta charset="UTF-8">
    <title>セッション</title>
</head>
<body>
<?php
    $b = $_SESSION['bridge'];
    print "ページ2の値は $b です。\n";
?>
<p><a href="session_1.php">ページ１へ</a></p>
</body>
</html>
