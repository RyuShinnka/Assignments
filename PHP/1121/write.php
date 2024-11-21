<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<form method="post" action="read.php">
    <textarea name="mojiretu" cols="10" rows="5"></textarea>
    <input type="submit" value="送信">
</form>

<?php
$moji = isset($_POST['mojiretu']) ? $_POST['mojiretu'] : "";

if ($moji != "") {
    $fh = @fopen("write.txt", "w") or die("Error\n");
    flock($fh, LOCK_EX); 
    fputs($fh, $moji);   
    flock($fh, LOCK_UN); 
    fclose($fh);
    print "ok write";
}
?>
</body>
</html>
