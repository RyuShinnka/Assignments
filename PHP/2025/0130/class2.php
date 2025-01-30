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
}

$ruby = new Dress;
$opal = new Dress;
$topaz = new Dress;

$ruby->name = "ルビー";
$ruby->material = "レイヨン";

$opal->name = "オパール";
$opal->material = "ウール";

$topaz->name = "トパーズ";
$topaz->material = "シルク";

$ruby->printdata();
?>

</body>
</html>