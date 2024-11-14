<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>match</title>
</head>
<body>
<?php
// p126 大文字アルファベット3文字抜き出す
preg_match("/[A-Z]{3}/", "Let's study PHP!", $s);
foreach ($s as $i) {
    print "$i";
}

print "<br>";

// p126 小文字アルファベット1文字抜き出す
preg_match("/[a-z]{1}/i", "Let's study PHP!", $s);
foreach ($s as $i) {
    print "$i";
}

print "<br>";

// p127 郵便番号を調べる
$strs = "171-0022";
if (preg_match("/([0-9]{3})-([0-9]{4})/", $strs)) {
    print "正しい郵便番号です";
} else {
    print "正しい郵便番号ではありません";
}

print "<br>";

// p128 'pen' を 'pencil' に置換
$str = "There is no pen. I want a pencil.";
$str2 = preg_replace("/pen/", "pencil", $str);
print "$str2<br>";

// / 'pen' に続けて 'cil' が来るものを 'pencil' に置換
$str2 = preg_replace("/pen(cil)?/", "pencil", $str);
print "$str2";
?>
</body>
</html>
