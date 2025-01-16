<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>例外</title>
</head>
<body>
<?php
function divnum($a, $b) {
    try {
        if ($b == 0) {
            throw new Exception("計算エラー");
        }
        $c = $a / $b;
        return $c;
    } catch (Exception $e) {
        print "エラー：" . $e->getMessage() . "<br>";
    }
}

$x = $_POST['left'];
$y = $_POST['right'];
$z = divnum($x, $y);
print "$x ÷ $y = $z";
?>
<p><a href="reigai.html">戻る</a></p>
</body>
</html>
