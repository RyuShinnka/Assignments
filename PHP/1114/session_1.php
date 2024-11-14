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
// セッションの利用
$_SESSION["suki"] = "プリン";
?>
<a href="session_2.php">セッションが渡っているか確認するページにジャンプ</a><br>
</body>
</html>
