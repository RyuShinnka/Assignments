<?php
$shiki1 = array("春", "夏", "秋", "冬");
echo "配列をforeach文を使って出力します！<br>";
foreach ($shiki1 as $b) {
    echo "$b<br>";
}

// 連想配列で宣言して表示
echo "連想配列をforeach文を使って出力します！<br>";
$shiki = array("spr" => "春", "sum" => "夏", "aut" => "秋", "win" => "冬");
foreach ($shiki as $key => $a) {
    echo "{$key}は{$a}<br>";
}
?>
