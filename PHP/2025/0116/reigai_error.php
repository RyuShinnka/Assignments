<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>例外</title>
</head>
<body>
<?php
    function divnum($a, $b){
        $c = $a / $b;
        return $c;
    }

    function myErrorProc($errcode, $msg, $file, $line){
        print "エラーコード：" . $errcode;
        print "<br>メッセージ：" . $msg;
        print "<br>ファイル名：" . $file;
        print "<br>行数：" . $line;
        die();
    }

    set_error_handler("myErrorProc");

    $x = $_POST['left'];
    $y = $_POST['right'];
    $z = divnum($x, $y);
    print "$x ÷ $y = $z";
    ?>
    <p><a href="reigai_error.html">戻る</a></p>

</body>
</html>