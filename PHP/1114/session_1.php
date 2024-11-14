<?php
// セッションを開始する
session_start();
?>
<html>
<head>
    <meta charset="UTF-8">
    <title>セッション管理</title>
</head>
<body>
    <?php
        $_SESSION['bridge'] = 100;
        $b = $_SESSION['bridge'];
        print "ページ１の値は $b です。\n";
    ?>
    <p><a href="session_2.php">ページ２へ</a></p>
</body>
</html>
