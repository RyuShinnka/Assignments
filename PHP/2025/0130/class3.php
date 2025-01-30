<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
class Dress
{
    public $name;
    public $material;

    public function printdata()
    {
        print $this->name . "の素材は" . $this->material . "です<br>";
    }

    public function __construct($n, $m)
    {
        $this->name = $n;
        $this->material = $m;
    }
}

$ruby = new Dress("ルビー", "レイヨン");
$opal = new Dress("オパール", "ウール");
$topaz = new Dress("トパーズ", "シルク");

$ruby->printdata();
$opal->printdata();
$topaz->printdata();
?>

</body>
</html>