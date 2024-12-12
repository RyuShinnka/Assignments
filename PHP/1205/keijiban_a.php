<?php
date_default_timezone_set('Asia/Tokyo');//tokyo 時間にする
if(file_exists('keijiban_a.txt')){ //keijiban_a.txt が存在するなら
    $f = file('keijiban_a.txt'); //配列$f に読み込み
    $ln = explode(",", $f[0]); //データを,で分割し、最初のデータ(No)を$ln に代入
    $no = sprintf("%03d", $ln[0]+1); //No に1を足し3桁に成型する
}else{ // keijiban.txt が存在しないなら
    $f = array(); //データ配列だけつくる
    $no = "001"; //NO は 001 から始める
}
if($_SERVER["REQUEST_METHOD"]=="POST"){ //ボタンが押されたとき
if(!$_POST['name']){ //名前未入力ならば
$errMsg = '名前を入力してください<BR>'; // エラーメッセージを設定
}
elseif(!$_POST['free']){ //記事未入力ならば
$errMsg = '記事を入力してください'; // エラーメッセージを設定
}
if(!$errMsg){ //エラーメッセージが設定されなかったら新規データを追加
$free = preg_replace("/\n/","<BR>",$_POST['free']); //改行コードを<br>に置き換え
$time = date("Y-m-d H:i:s"); //現在の時分秒を変数に入れる
$data= array($no, $_POST['name'],$_POST['mail'], $free, $time);//4つのデータ No 名前 メッセージ 時間を配列へ
$datag=implode(",", $data); //$data の内容を,で結合
array_unshift($f,$datag."\n");//\n を付けて配列$f の先頭へ$datag を入れる
$fp = fopen('keijiban_a.txt', 'w'); //書き込み用でファイルを開く
foreach($f as $line)
    fputs($fp,$line); //ファイルに書き込み
fclose($fp); //閉じる
header("Location:keijiban_a.php");//リロード時の再投稿を防ぐ。指定ファイルにリダイレクト
exit;//終了
}
}
?>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head><title>掲示板</title></head>
<body>
<form method="post" action="keijiban_a.php">
<h1>掲示板</h1>
<?php

if(@$errMsg){ //エラーメッセージが設定されたとき(@をつけておくとエラーをはかない)
echo "<span style=color:red>".@$errMsg."</span>";
}
?>
<table border = "1">
<tr><td>名前:
<input type="text" name="name" size="25">
メール<input type="text" name="mail" size="25"><br>
<textarea name="free" cols="60" rows="8"></textarea><br><br>
<input type="submit" name="submit" value="書き込む">
<input type="reset" value="取り消す">
</td></tr>
</table><br><hr><br>
<?php
foreach ($f as $line) { //ファイルから一行ずつ読み込み
    list($no, $name, $mail, $free, $time) = explode(",", $line); // ,(カンマ)で分割し、4つの変数に代入
    print "<table border=1 width=500><tr>";
    echo "<th>[No." . $no . "] 名前: " . $name . "</th>"; //No と名前を表示
    echo "<th>書込み日付: " . $time . "</th>"; //日時表示
    echo "<th>メール: " . $mail . "</th>"; //日時表示
    echo "</tr><tr>";
    echo "<td align='left' colspan='3'>" . $free . "</td>"; //記事表示
    echo "</tr></table><br>";
}
?>
</form></body></html>