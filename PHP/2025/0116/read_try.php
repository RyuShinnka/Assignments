<?php
try {
    if (!file_exists("write2.txt")) {
        throw new Exception("ファイル見つかりません");
    }
    $fp = @fopen("write2.txt", "r");
    while (!feof($fp)) {
        print fgets($fp) . "<br>";
    }
    fclose($fp);
} catch (Exception $e) {
    print "キャッチされた例外: (" . $e->getMessage() . ")<br>";
} finally {
    echo "プログラムは終了しました。<br>";
}
?>
