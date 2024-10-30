<?php
define("DEF_G", "Hello");
define("DEF_G", "goodbye");
echo DEF_G, "<br>";

const DEF_C = "goodbye";
echo DEF_C, "<br>";

$line = __LINE__;
print "$line<br>";

$file = __FILE__;
print "$file<br>";
?>