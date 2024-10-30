<?php
// 三項演算子
$x = 1;
$a = ($x < 15) ? 10 : 20;
print "\$a=".$a;

// 文字の連結
$str = "<br>Hello" . "." . "World";
print $str;

// エラー演算子
$a = 100;
$b = 0;
@print ($a / $b);
print "<br>---<br>";
print ($a / $b);
?>