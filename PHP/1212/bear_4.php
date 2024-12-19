<?php
    $memberNo = $_GET["memberNo"];
    $fee = 10000;
    $f = file("bear.txt");
    foreach ($f as $line) { //ファイルから一行ずつ読み込み
        list($FMemberNo, $name, $address, $qua, $region) = explode(",", $line); 
        $deliveryFee = 0;
        if ($FMemberNo == $memberNo) { //会員番号が一致したら
            if($region == "関東・東北、800円\n"){
                $deliveryFee = 800;
            }elseif($region == "中部・北陸、1000円\n"){
                $deliveryFee = 1000;
            }elseif($region == "関西・北海道、1500円\n"){
                $deliveryFee = 1500;
            }elseif($region == "中国・四国・九州、2000円\n"){
                $deliveryFee = 2000;
            }
            $total = $fee * $qua + $deliveryFee; //合計金額を計算
            break; //ループを抜ける
        }
    }
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<fieldset>

    <table border="1">
            <?php
                echo "<tr><td>会員No</td><td>$memberNo</td></tr>";
                echo "<tr><td>おなまえ</td><td>$name</td></tr>";
                echo "<tr><td>住所</td><td>$address</td></tr>";
                echo "<tr><td>地域</td><td>$region</td></tr>";
                echo "<tr><td>単価</td><td>$fee</td></tr>";
                echo "<tr><td>個数</td><td>$qua</td></tr>";
                echo "<tr><td>合計</td><td>$total</td></tr>";
            ?>
    </table>
    <p>ご利用ありがとうございました</p>

</fieldset>  
</body>
</html>
