<?php
$uru = (int)$_POST['year'];

// うるう年のカウント
$count = 0;

// 1年から指定された年までループ
for ($year = 1; $year <= 10000; $year++) {
    // 入力された年を超えたらループ終了
    if ($year > $uru) {
        break;
    }

    // うるう年の判定
    if ($year % 400 == 0 || ($year % 4 == 0 && $year % 100 != 0)) {
        $count++;

        // 400で割り切れる年は赤、それ以外は黒で表示
        if ($year % 400 == 0) {
            print "<span style='color: red;'>$year</span> ,";
        } else {
            print "<span style='color: black;'>$year</span> ,";
        }
        // 20年ごとに改行
        if ($count % 20 == 0) {
            print "<br>";
        }
    }
}

// 出力表示
echo "<span>うるう年は: $count 回です</span>";
?>
