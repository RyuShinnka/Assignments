<!DOCTYPE html>
<html lang="ja">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ren_02</title>
    <style>
        body {
            background-color: #f5f5f5;
            width: 1000px;
            margin: 0 auto;
        }

        fieldset {
            margin: 0 auto;
            border: 3px solid #ccc;
            padding: 10px;
            margin-top: 20px;
            width: 33%;
        }
    </style>
</head>

<body>
    <fieldset>
        <b>
            <?php
            print ("①<br>");
            $tarou = array("eigo" => 90, "kokugo" => 85, "sugaku" => 70);
            echo "太郎さんの英語の点数は" . $tarou["eigo"] . "点です。<br>";
            echo "太郎さんの国語の点数は" . $tarou["kokugo"] . "点です。<br>";
            echo "太郎さんの数学の点数は" . $tarou["sugaku"] . "点です。<br>";
            echo "<br><br>";


            print ("②<br>");
            $kamoku = array("eigo", "kokugo", "sugaku");
            echo "太郎さんの英語の点数は" . $tarou[$kamoku[0]] . "点です。<br>";
            echo "太郎さんの国語の点数は" . $tarou[$kamoku[1]] . "点です。<br>";
            echo "太郎さんの数学の点数は" . $tarou[$kamoku[2]] . "点です。<br>";
            echo "<br><br>";


            print ("③<br>");
            $kuni = array("日本", "中国", "イギリス", "アメリカ合衆国", "カナダ");
            $syuto = array("東京", "北京", "ロンドン", "ワシントン", "オタワ");
            $world = array($kuni, $syuto);
            echo $world[0][0] . "の首都は" . $world[1][0] . "です。<br>";
            echo $world[0][1] . "の首都は" . $world[1][1] . "です。<br>";
            echo $world[0][2] . "の首都は" . $world[1][2] . "です。<br>";
            echo $world[0][3] . "の首都は" . $world[1][3] . "です。<br>";
            echo $world[0][4] . "の首都は" . $world[1][4] . "です。<br>";
            ?>
        </b>
    </fieldset>
</body>

</html>