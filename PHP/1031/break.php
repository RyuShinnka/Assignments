<?php
$b = 2;
for ($a = 0; $a < 5; $a++) {
    if ($b - $a == 0) {
        break;
    }
    print "$b - $a = " . ($b - $a) . "<br>";
}
?>
