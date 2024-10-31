<?php
$b = 1;
for ($a = 0; $a < 4; $a++) {
    if ($a + $b == 2) {
        continue;
    }
    print "$a + $b = " . ($a + $b) . "<br>";
}
?>
