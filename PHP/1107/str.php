<?php
$num = $_GET['num'];
$suu = $_GET['suu'];

$newNum = sprintf("%0{$suu}d", $num);

for ($i = 0; $i < strlen($newNum); $i++) {
    $suu = substr($newNum, $i, 1);
    echo "<img src='Counter/$suu.png' alt='$suu'>";
}
?>
