<?php
if (file_exists("write.txt")) {
    $fp = @fopen("write.txt", "r") or die("file Error");
    while (!feof($fp)) {
        print fgets($fp) . "<br>";
    }
    fclose($fp);
}

// file() 関数を使ってファイルを配列として読み込む
print "file関数<br>";
$f = file("write.txt");
foreach ($f as $value) {
    print "<br>" . $value;
}
?>
