<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>受付確認画面</title>
</head>
<body>
    <h1>受付確認画面</h1>
    <p>お名前：<?php echo $_POST['name'];?></p>
    <p>商品のお送り先：<?php echo $_POST['address'];?></p>
    <p>性別：<?php echo $_POST['gender'];?></p>
    <p>ご請求方法：<?php echo $_POST['payment'];?></p>
    <p>以上の内容で商品を受け付けました。<br>ありがとうございました。</p>
    <p>
        ひみつに年齢をまらいました<?php echo $_POST['age'];?>歳ですね。
    </p>
</body>
</html>