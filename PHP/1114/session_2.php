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
echo "私が好きなのは " . $_SESSION["suki"] . " です♪<br>";
?>
<a href="session_1.php">戻る</a>
</body>
</html>
