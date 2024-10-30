<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>受付確認画面</title>
</head>
<body>
    <?php
    $name = $_POST['name'];
    $address = $_POST['address'];
    $gender = $_POST['gender'];
    $payment = $_POST['payment'];
    $age = $_POST['age'];
    $code = $_POST['code'];
    $code_array = array("正会員","期間会員","一時会員");

    ?>
    <h1>受付確認画面</h1>
    <p>会員類別：<?php echo $code_array[$code];?></p>
    <p>お名前：<?php echo $name;?></p>
    <p>商品のお送り先：<?php echo $address;?></p>
    <p>性別：<?php echo $gender;?></p>
    <p>ご請求方法：<?php echo $payment;?></p>
    <p>以上の内容で商品を受け付けました。<br>ありがとうございました。</p>
    <p>ひみつに年齢をまらいました<?php echo $age;?>歳ですね。</p>
</body>
</html>