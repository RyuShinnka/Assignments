<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ファイル送信</title>
</head>
<body>
<h1>ファイル送信</h1>
<?php
if (move_uploaded_file($_FILES['upfile']['tmp_name'], "./" . $_FILES['upfile']['name']) == false) {
    print "アップロードに失敗";
} else {
    print $_FILES['upfile']['name'];
    print "をアップロード成功";
}
?>
</body>
</html>
