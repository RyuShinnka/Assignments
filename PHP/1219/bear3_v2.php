<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>bear3_v2</title>
</head>
<body>
    <p>ご購入ありがとうございました</p>
    <p>ご購入された内容を確認されたい場合は</p>
    <p>確認をクリックしてください。
    <?php
        $memberNo = $_POST['memberNo'];
        $name = $_POST['name'];
        $address = $_POST['address'];
        $region = $_POST['region']; 
        $qua = $_POST['qua'];
        $price = $_POST['price'];
        $giftbox = $_POST['giftbox'];
        $ribon = $_POST['ribon'];
        $regionArray = [
            "関東・東北、800円",
            "中部・北陸、1000円",
            "関西・北海道、1500円",
            "中国・四国・九州、2000円"];
        $data= array($memberNo, $name, $address, $regionArray[$region], $qua, $price, $giftbox, $ribon);
        $datag=implode(",", $data);
        $fname = "bear_v2.txt";
        if(file_exists($fname)){
            $fh = fopen($fname, 'a');
            fputs($fh, $datag."\n");
            fclose($fh);
        }else{
            $fh = fopen($fname, 'w');
            fputs($fh, $datag."\n");
            fclose($fh);
        }
        print "<a href=bear4_v2.php?memberNo=$memberNo>確認</a></p>";
    ?>
</body>
</html>