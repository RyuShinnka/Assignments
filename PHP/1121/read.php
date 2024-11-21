<?php
if (file_exists("write.txt")) {
    // ファイルを読み取り専用モードで開く
    $fp = @fopen("write.txt", "r") or die("ファイルエラー");
    while (!feof($fp)) { // ファイルの終端まで繰り返し
        print fgets($fp) . "<br>"; // 各行を読み取り表示
    }
    fclose($fp); // ファイルを閉じる
}

// file() 関数を使ってファイルを配列として読み込む
print "file関数<br>";
$f = file("write.txt"); // ファイルを配列として読み込む
foreach ($f as $value) { // 配列の各行をループ
    print "<br>" . $value; // 各行を表示
}
?>
