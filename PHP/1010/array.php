<?php   
$a = array("a","b","c");
echo $a[0],$a[1],$a[2];
unset($a[1]);
print("<br>a[1]を削除しました。");
echo $a[0],$a[1],$a[2],"<br>";

$a = array(1,2,3);
$b = array(1,3,4);
$c = array_diff($a,$b);
echo $c[1],"<br>";

array_push($a,4,5);
array_unshift($a,4,5);
echo $a[0],$a[1],$a[2],$a[3],$a[4],$a[5],$a[6],"<br>";

?>
