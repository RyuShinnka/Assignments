<?php
$num = 1000;
print "$num は";

if (0 <= $num && $num <= 9) {
    print "1桁の数です<br>";
} elseif (10 <= $num && $num <= 99) {
    print "2桁の数です<br>";
} elseif (100 <= $num && $num <= 999) {
    print "3桁の数です<br>";
} else {
    print "4桁の数です<br>";
}
?>
