<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
</head>
<body>
<?php
    class Dress
    {
        public $name;
        public $material;
    }

    $ruby = new Dress;
    $opal = new Dress;
    $topaz = new Dress;

    $ruby->name = "ルビー";
    $ruby->material = "レイヨン";

    $opal->name = "オパール";
    $opal->material = "ポリエステル";

    $topaz->name = "トパーズ";
    $topaz->material = "シルク";

    print $ruby->name;
    print $ruby->material;
    print "<br>";

    print $opal->name;
    print $opal->material;
    print "<br>";

    print $topaz->name;
    print $topaz->material;
    print "<br>";
?>
</body>
</html>
