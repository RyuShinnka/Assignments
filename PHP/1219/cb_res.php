<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>受信ページ</h1>
    <h3>好きな色</h3>
    <p>あなたの好きな色は</p>
    <ul>
    <?php
    $colors = $_POST["colors"];
    foreach ($colors as $color) {
        echo "<li>$color</li>";
    }
    ?>
    </ul>
    <?php
    $mes = "";
    if (isset($_POST['midori'])) {
        $mes .= "緑、";
    }
    if (isset($_POST['murasaki'])) {
        $mes .= "紫、";
    }
    if (isset($_POST['siro'])) {
        $mes .= "白";
    }
    echo "さらに「{$mes}」です";
    ?>
</body>
</html>

