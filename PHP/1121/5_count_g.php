<?php

$count_file = "count.txt";

$count = 0;

// カウントファイルが存在するかチェック
if (file_exists($count_file)) {
    // カウントファイルを読み取りモードで開く
    $fp = fopen($count_file, "r");
    $count = (int)fread($fp, filesize($count_file));
    fclose($fp);
    $count++;
}

// カウントファイルを新規書き込みモードで開く
$fp = fopen($count_file, "w");
fwrite($fp, $count);
fclose($fp);

$newNum = sprintf("%05d", $count);

echo '<p>アクセスカウンター</p>';
// カウント結果を画面に表示
for($i =0; $i <strlen($newNum); $i++){
    $suu = substr($newNum, $i, 1);
    echo "<img src='counter/$suu.png' alt='$suu'>";
}
echo "<br>人目の訪問者です。";
?>
