<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<body>
    <p>好きな色を選択してください（複数選択可）</p>
    <form action="cb_res.php" method="POST">
        <p>
            <input type="checkbox" name="colors[]" value="青">青
            <input type="checkbox" name="colors[]" value="赤">赤
            <input type="checkbox" name="colors[]" value="黄">黄
        </p>
        <p>
            <input type="checkbox" name="colors[]" value="緑">緑
            <input type="checkbox" name="colors[]" value="紫">紫
            <input type="checkbox" name="colors[]" value="白">白
        </p>
        <input type="submit" value="送信">
    </form>
</body>
</body>
</html>