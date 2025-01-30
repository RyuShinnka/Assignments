<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
class pokemon {
    public $name;
    public $evoTo;

    public function printEvo() {
        print "おめでとう ".$this->name."は ".$this->evoTo."に進化した<br>";
    }
    public function __construct($name, $evoTo) {
        $this->name = $name;
        $this->evoTo = $evoTo;
    }
    
}

class pokemons extends pokemon {
    public $type;
    
    public function printEvoText() {
        print "おめでとう".$this->type."タイプの ".$this->name."は ".$this->evoTo."に進化した<br>";
    }
    public function __construct($name, $evoTo, $type) {
        $this->name = $name;
        $this->evoTo = $evoTo;
        $this->type = $type;
    }
}

$pikachu = new pokemons("ピカチュウ", "ライチュウ", "電気");
$fushigidane = new pokemons("フシギダネ","フシギバナ", "草、毒");
$zenigame = new pokemons("ゼニガメ", "カメックス", "水");

$pikachu->printEvoText();
$fushigidane->printEvoText();
$zenigame->printEvoText();
?>
</body>
</html>