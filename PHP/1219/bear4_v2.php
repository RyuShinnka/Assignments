<?php
    $memberNo = $_GET["memberNo"];
    $f = file("bear_v2.txt");
    foreach ($f as $line) { //ファイルから一行ずつ読み込み
        list($FMemberNo, $name, $address, $region, $qua, $price, $giftbox, $ribon) = explode(",", $line); 
        $deliveryFee = 0;
        $giftboxFee = 0;
        $ribonFee = 0;
        if ($FMemberNo == $memberNo) { //会員番号が一致したら
            if($region == "関東・東北、800円"){
                $deliveryFee = 800;
            }elseif($region == "中部・北陸、1000円"){
                $deliveryFee = 1000;
            }elseif($region == "関西・北海道、1500円"){
                $deliveryFee = 1500;
            }elseif($region == "中国・四国・九州、2000円"){
                $deliveryFee = 2000;
            }
            if($giftbox == "1"){
                $giftboxFee = 50;
            }
            if($ribon == "1" || $ribon == "1\n"){
                $ribonFee = 50;
            }
            $total = $price * $qua + $deliveryFee + $giftboxFee + $ribonFee ; //合計金額を計算
            break; //ループを抜ける
        }
    }
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>bear4_v2</title>
</head>
<body>
<fieldset>

    <table border="1">
            <?php
                echo "<tr><td>会員No</td><td>$memberNo</td></tr>";
                echo "<tr><td>おなまえ</td><td>$name</td></tr>";
                echo "<tr><td>住所</td><td>$address</td></tr>";
                echo "<tr><td>地域</td><td>$region</td></tr>";
                echo "<tr><td>単価</td><td>$price 円</td></tr>";
                echo "<tr><td>個数</td><td>$qua 個</td></tr>";
                echo "<tr><td>ギフトボックス50円</td><td>$giftbox 個</td></tr>";
                echo "<tr><td>リボン50円</td><td>$ribon 個</td></tr>";
                echo "<tr><td>合計</td><td>$total 円</td></tr>";
            ?>
    </table>
    <p>ご利用ありがとうございました</p>

</fieldset>  
</body>
</html>
