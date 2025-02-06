<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  

<?php
$ans1 = $_POST["ans1"];
$ans2 = $_POST["ans2"];

$db = new SQLite3('db_ank');


$query = "INSERT INTO tbl_anketo (ans1, ans2) VALUES ('$ans1', '$ans2')";
$re=$db->exec($query);


$query="SELECT * FROM tbl_anketo";
$re=$db->query($query);

// カウント変数を初期化
$ans1no1 = 0;
$ans1no2 = 0;
$ans1no3 = 0;
$ans1no4 = 0;
$ans1no5 = 0;

$ans2no1 = 0;
$ans2no2 = 0;
$ans2no3 = 0;



print "<h2>アンケート結果</h2>";
print "問1 見学理由 (0有名だから, 1家から近いから, 2興味があったらから, 3尊敬する人がいるから, 4その他)";
print "<br>問2 性別 (0男性, 1女性, 3その他)";
print "<table>";
print "<tr><th>問1</th><th>問2</th></tr>";


while ($row = $re->fetchArray(SQLITE3_ASSOC)) {
  print "<tr>";
  print "<td>";  
  if($row['ans1'] == 0){
    print "有名だから";
    $ans1no1++;
  }elseif($row['ans1'] == 1){
    print "家から近いから";
    $ans1no2++;
  }elseif($row['ans1'] == 2){
    print "興味があったらから";
    $ans1no3++; 
  }elseif($row['ans1'] == 3){
    print "尊敬する人がいるから";
    $ans1no4++;
  }elseif($row['ans1'] == 4){
    print "その他";
    $ans1no5++;
  }
  print "</td>";
  print "<td>";
  if($row['ans2'] == 0){
    print "男性";
    $ans2no1++;
  }elseif($row['ans2'] == 1){
    print "女性";
    $ans2no2++;
  }elseif($row['ans2'] == 2){
    print "その他";
    $ans2no3++;
  }
  print"</td>";
  print "</tr>";
}

print "</table>";
?>
<br><br>＜集計＞見学理由<br>
        有名だから ＝　<?php print $ans1no1;?>，<br>
        家から近いから ＝　<?php print $ans1no2;?>，<br>
        興味があったらから ＝　<?php print $ans1no3;?>，<br>
        尊敬する人がいるから ＝　<?php print $ans1no4;?>，<br>
        その他 ＝　<?php print $ans1no5;?>。<br>
<br>＜性別＞見学理由<br>
        男性 ＝　<?php print $ans2no1;?>，<br>
        女性 ＝　<?php print $ans2no2;?>，<br>
        その他 ＝　<?php print $ans2no3;?>。


</body>
</html>