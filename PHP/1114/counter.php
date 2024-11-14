<?php
// クッキー情報を格納する
$counter = isset($_COOKIE['visittimes']) ? $_COOKIE['visittimes'] : '';

// もし変数 $counter があり値に 1 増やし、なければ 1 を代入する
if (isset($counter)) { // isset() 関数で変数があるか調べる
    $counter++;
} else {
    $counter = 1;
}

// もし変数 $counter の値が 3 より大きければクッキーを削除する
if ($counter > 3) {
    setcookie('visittimes', $counter, time() - 60);
} else {
    setcookie('visittimes', $counter);
}
?>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>訪問回数カウンタ</title>
</head>
<body>
<?php
if ($counter == 1) {
    // 初めてのアクセス
    print "はじめまして！<br>\n";
} elseif ($counter == 2) {
    // 2 回目のアクセス
    print "$counter 回目のご訪問ですね。<br>\n";
} elseif ($counter == 3) {
    // 3 回目にアクセスしたときはブラウザの種類を表示する
    print "$counter 回目のご訪問ですね。<br>\n";
    print "あなたのブラウザは \"" . $_SERVER['HTTP_USER_AGENT'] . "\" ですね。<br>\n";
} else {
    // 4 回目以降にアクセスしたとき
    print "$counter 回目のご訪問ですね。<br>\n";
    print "次回訪問時に訪問回数がリセットされます。<br>\n";
}
?>
</body>
</html>
