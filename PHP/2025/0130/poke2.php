<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ポケモン進化</title>
</head>
<body>
    <form method="post">
        <p>どのポケモンを進化させたいですか？</p>
        <label><input type="radio" name="pokemon" value="pikachu"> ピカチュウ </label>
        <label><input type="radio" name="pokemon" value="fushigidane"> フシギダネ </label>
        <label><input type="radio" name="pokemon" value="zenigame"> ゼニガメ </label>
        <p><input type="submit" value="進化"></p>
    </form>

<?php
class pokemon{
    public $name;
    public $evoTo;
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
class pokemons extends pokemon {
    public $level;
    public $evoLevel;

    public function __construct($name, $evoTo, $type, $level, $evoLevel) {
        $this->name = $name;
        $this->evoTo = $evoTo;
        $this->type = $type;
        $this->level = $level;
        $this->evoLevel = $evoLevel;
    }

    public function checkEvolution() {
        if ($this->level >= $this->evoLevel) {
            print $this->name . " のレベルは " . $this->level . " です。<br>";
            print $this->name . "が進化できます";
            print "おめでとう！".$this->type."タイプの ".$this->name." は ".$this->evoTo." に進化した！<br>";
        } else {
            print $this->name . " のレベルは " . $this->level . " です。<br>";
            print "進化のレベルが足りません<br>";
        }
    }
}

// レベルファイルを読み込み
function readLevel($filename) {
    $level = 0;
    if (file_exists($filename)) {
        $fp = @fopen($filename, "r");
        if ($fp) {
            $level = (int)fgets($fp); // ファイルから1行読み取る
            fclose($fp);
        }
    }
    return $level;
}

// 各ポケモンのレベルをファイルから取得
$pikachu_level = readLevel("plevel.txt");
$fushigidane_level = readLevel("flevel.txt");
$zenigame_level = readLevel("zlevel.txt");

// 各ポケモンのインスタンスを作成
$pikachu = new pokemons("ピカチュウ", "ライチュウ", "電気", $pikachu_level, 15);
$fushigidane = new pokemons("フシギダネ", "フシギバナ", "草・毒", $fushigidane_level, 10);
$zenigame = new pokemons("ゼニガメ", "カメックス", "水", $zenigame_level, 5);

// 進化チェック処理
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $selected = $_POST["pokemon"];
    if ($selected == "pikachu") {
        $pikachu->checkEvolution();
    } elseif ($selected == "fushigidane") {
        $fushigidane->checkEvolution();
    } elseif ($selected == "zenigame") {
        $zenigame->checkEvolution();
    }
}
?>

</body>
</html>
