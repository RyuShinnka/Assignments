<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>カレンダー</title>
</head>
<body>
<?php
// 今日の日付を取得
$y = date("Y");
$m = date("m");

// 今月最初の日と曜日を取得
$firstday_w = date("w", mktime(0, 0, 0, $m, 1, $y));

// 今月の最終日を取得
$lastday = date("t", mktime(0, 0, 0, $m, 1, $y));
$lastday_w = date("w", mktime(0, 0, 0, $m, $lastday, $y));

// カレンダーのタイトル
echo "<b>" . $y . "年" . $m . "月</b><br>";

// 曜日を出力
echo "<table border=\"1\">\n";
echo "<tr>\n";
echo "<td>日</td>\n";
echo "<td>月</td>\n";
echo "<td>火</td>\n";
echo "<td>水</td>\n";
echo "<td>木</td>\n";
echo "<td>金</td>\n";
echo "<td>土</td>\n";
echo "</tr>\n";

// カレンダーの日付を出力
echo "<tr>\n";
// 1日までの空白を埋める
for ($i = 0; $i < $firstday_w; $i++) {
    echo "<td></td>\n";
}
// 日付を埋める
for ($day = 1; $day <= $lastday; $day++) {
    echo "<td>" . $day . "</td>\n";
    if (($day + $firstday_w) % 7 == 0) { // 土曜日の次に改行
        echo "</tr>\n<tr>\n";
    }
}
// 最後の日以降の空白を埋める
if ($lastday_w != 6) { // 最後の日が土曜日以外なら
    for ($i = $lastday_w + 1; $i <= 6; $i++) { // 空白セルで埋める
        echo "<td></td>\n";
    }
}
echo "</tr>\n";
echo "</table>\n"; // テーブル終了
?>
</body>
</html>
