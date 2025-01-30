<?php
$ans1 = $_POST["ans1"];
$ans2 = $_POST["ans2"];

$db = new SQLite3('db_ank');


$query = "INSERT INTO tbl_anketo (ans1, ans2) VALUES ('$ans1', '$ans2')";
$re=$db->exec($query);


$query="SELECT * FROM tbl_anketo";
$re=$db->query($query);


print "<h2>アンケート結果</h2>";
print "問1 見学理由 (0有名だから, 1家から近いから, 2興味があったらから, 3尊敬する人がいるから, 4その他)";
print "<br>問2 性別 (0男性, 1女性, 3その他)";
print "<table>";
print "<tr><th>問1</th><th>問2</th></tr>";


while ($row = $re->fetchArray(SQLITE3_ASSOC)) {
  print "<tr>";
  print "<td>" . $row['ans1'] . "</td>";
  print "<td>" . $row['ans2'] . "</td>";
  print "</tr>";
}

print "</table>";

?>
