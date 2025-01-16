<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    foreach ($_SERVER as $key => $value) {
        echo "<b>$key:</b> $value<br>";
    }
}
?>
<html>
<head>
    <title>server</title>
</head>
<body>
    確認ボタンを押して $_SERVER の内容を表示してみましょう<br>
    <form action="
    <?php
        echo $_SERVER["PHP_SELF"]; 
    ?>" method="POST" name="form1">
        <input type="submit" name="sub1" value="確認">
    </form>
</body>
</html>
