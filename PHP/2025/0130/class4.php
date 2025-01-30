<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
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

class colorDress extends Dress
{
    public $color;

    public function printmaterial()
    {
        print $this->name . "の素材は" . $this->material . "で色は" . $this->color . "です<br>";
    }

    public function __construct($n, $m, $c)
    {
        $this->name = $n;
        $this->material = $m;
        $this->color = $c;
    }
}

$ruby = new colorDress("ルビー", "レイヨン", "ワイン");
$opal = new colorDress("オパール", "ウール", "むらさき");
$topaz = new colorDress("トパーズ", "シルク", "ピンク");

$ruby->printmaterial();
$opal->printmaterial();
$topaz->printmaterial();
?>
</body>
</html>

</body>
</html>