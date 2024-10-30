<?php
$s = 65;
print "あなたの得点は $s 点です<br>";

if ($s < 70) {
    print "平均まであと " . (70 - $s) . " 点です<br>";
    print "がんばりましょう<br>";
} else {
    print "よくできました<br>";
}
?>