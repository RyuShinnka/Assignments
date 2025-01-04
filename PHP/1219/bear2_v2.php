<?php

    $memberNo = $_POST['memberNo'];
    $name = $_POST['name'];
    $address = $_POST['address'];
    $region = $_POST['region'];
    $qua = $_POST['qua'];
    $price = $_POST['price'];
    $giftbox = $_POST['giftbox'];
    if($giftbox == 1){
        $giftboxTxt = "あり";
    }else{
        $giftboxTxt = "なし";
    }
    $ribon = $_POST['ribon'];
    if($ribon == 1){
        $ribonTxt = "あり";
    }else{
        $ribonTxt = "なし";
    }
    $regionArray = [
        "関東・東北、800円",
        "中部・北陸、1000円",
        "関西・北海道、1500円",
        "中国・四国・九州、2000円"
    ];
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>bear2_v2</title>
</head>
<body>
<fieldset>
    <p>内容を確認して<br>
        ご購入の際は「お買い物が決定します」ボタンをクリックしてください</p>
    <form action="bear3_v2.php" method="post">
    <table border="1">
            <?php
                echo "<tr><td>会員No</td><td>$memberNo</td></tr>";
                echo "<tr><td>おなまえ</td><td>$name</td></tr>";
                echo "<tr><td>住所</td><td>$address</td></tr>";
                echo "<tr><td>地域</td><td>$regionArray[$region]</td></tr>";
                echo "<tr><td>単価</td><td>$price</td></tr>";
                echo "<tr><td>個数</td><td>$qua</td></tr>";
                echo "<tr><td>ギフトボックス</td><td>$giftboxTxt</td></tr>";
                echo "<tr><td>リボン</td><td>$ribonTxt</td></tr>";
            ?>
    </table>
        
        <input type="hidden" name="memberNo" value="<?php echo $memberNo; ?>">
        <input type="hidden" name="name" value="<?php echo $name; ?>">
        <input type="hidden" name="address" value="<?php echo $address; ?>">
        <input type="hidden" name="region" value="<?php echo $region; ?>">
        <input type="hidden" name="qua" value="<?php echo $qua; ?>">
        <input type="hidden" name="price" value="<?php echo $price; ?>">
        <input type="hidden" name="giftbox" value="<?php echo $giftbox; ?>">
        <input type="hidden" name="ribon" value="<?php echo $ribon; ?>">
        <p><input type="submit" value="お買い物が決定します"></p>
    </form>
</fieldset>  
</body>
</html>
