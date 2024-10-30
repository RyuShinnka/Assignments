<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>おつり計算</title>
</head>
<body>
    <?php
        $m = isset($_POST['money']) ? (int)$_POST['money'] : 0; 
        
        $price = 120;
        $r = $m - $price;
        $kouka = array(500, 100, 50, 10, 5, 1, 0);
        
        if($r < 0){
            print "<p>お金が足りません。</p>\n";
        } elseif ($m > 1000) {
            print "<p>1000円以内のお金を入れてください。</p>\n";
        } elseif ($r == 0) {
            print "<p>ありがとうございました！おつりはありません。</p>\n";
        } else {
            print "<p>ありがとうございました。おつりは $r 円です。</p>\n";
            print "<p>硬貨の枚数は次のとおりです。<br>\n";
            
            $n = 0;
            while ($kouka[$n] > 0) {
                print $kouka[$n]. "円玉".(int)($r / $kouka[$n])."枚<br>";
                $r = $r % $kouka[$n];
                $n++;
            }
            print "</p>";
        }
    ?>
    <p><a href="konyu.html">もう一度購入する</a></p>
</body>
</html>
