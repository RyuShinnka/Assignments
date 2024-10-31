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
            print("①<br>");
            $tarou = array("英語" => 90, "国語" => 85, "数学" => 70);
            foreach ($tarou as $key => $value) {
                echo "太郎の" . $key . "の点数は" . $value . "点です。<br>";
            }
            echo "<br><br>";

            print("②<br>");
            $kamoku = array("英語", "国語", "数学");
            foreach ($kamoku as $key => $value) {
                echo "太郎の" . $value . "の点数は" . $tarou[$value] . "点です。<br>";
            }
            echo "<br><br>"; 

            print("③<br>");
            $kuni = array("日本", "中国", "イギリス", "アメリカ合衆国", "カナダ");
            $syuto = array("東京", "北京", "ロンドン", "ワシントン", "オタワ");
            $world = array($kuni, $syuto);
            // count()はjavaの.lengthと同じ使い方
            for ($i = 0; $i < count($kuni); $i++) {
                echo $world[0][$i] . "の首都は" . $world[1][$i] . "です<br>";
            }
            ?>
        </b>
    </fieldset>
</body>

</html>
