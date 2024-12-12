<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<fieldset>
    <p>内容を確認して<br>
        ご購入の際は「お買い物が決定します」ボタンをクリックしてください</p>
    <form action="bear_3.php" method="post">
        <table border="1">
        <?php
            $memberNo = $_POST['member_no'];
            $name = $_POST['name'];
            $address = $_POST['address'];
            $region = $_POST['region'];
            $feeArray = [800, 1000, 1500, 2000];
            $regionArray = [
                "関東・東北、800円",
                "中部・北陸、1000円",
                "関西・北海道、1500円",
                "中国・四国・九州、2000円"];
            $qua = $_POST['qua'];
            echo "<tr><td>会員No</td><td>$memberNo</td></tr>";
            echo "<tr><td>おなまえ</td><td>$name</td></tr>";
            echo "<tr><td>住所</td><td>$address</td></tr>";
            echo "<tr><td>地域</td><td>$regionArray[$region]</td></tr>";
            echo "<tr><td>個数</td><td>$qua</td></tr>";

            echo "<input type='hidden' name='memberNo' value='$memberNo'>";
            echo "<input type='hidden' name='name' value='$name'>";
            echo "<input type='hidden' name='address' value='$address'>";
            echo "<input type='hidden' name='region' value='$region'>";
            echo "<input type='hidden' name='qua' value='$qua'>";
        ?>
        </table>
        <p><input type="submit" value="お買い物が決定します"></p>
    </form>
</fieldset>  
</body>
</html>
