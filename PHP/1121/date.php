<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>日付を扱う</title>
</head>
<body>
<?php
// Tokyo時間にする
date_default_timezone_set('Asia/Tokyo');

// 曜日用配列
$youbi = array("日", "月", "火", "水", "木", "金", "土");

// 今日の年月日と時刻を表示
echo date("Y/m/d H:i:s <br>");
echo "<br>";

// 年月日それぞれを取得
$y = date("Y");
$m = date("m");
$d = date("d");
$w = date("w");

// 5日後の日付を設定
$after_5day = mktime(0, 0, 0, $m, $d + 5, $y);
echo date("Y年m月d日", $after_5day);
echo "<br>";

// 今日の曜日
echo date("Y年m月d日", mktime(0, 0, 0, $m, 0, $y));
echo "<br>本日: " . $youbi[$w] . "曜日 <br>";
?>
</body>
</html>
