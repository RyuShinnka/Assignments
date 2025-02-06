<?php


// カウントファイルが存在するかチェック
if (file_exists("count.txt")) {
    // カウントファイルを読み取りモードで開く
    $fp = @fopen("count.txt", "r") or die("file Error");
    
    $count = fgets($fp);
    // カウント結果を画面に表示
    print "あなたは・・・" . $count . "番目の訪問者です。";
    fclose($fp);// ファイルを閉じる
    
}
$count++; // カウントを1増やす

// カウントファイルを新規書き込みモードで開く

$fh = @fopen("count.txt", "w") or die("Error\n");
fputs($fh, $count);   # ファイルに書き込み
fclose($fh); # ファイルを閉じる


?>
