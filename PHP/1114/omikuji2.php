<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>おみくじ内容</title>
</head>
<body>
    <h1>おみくじ内容は</h1>
    <?php
    $uranai = $_POST["choice"];
    
    if ($uranai === "kenkou") {
        print "超健康体！、結構健康！、要注意、血圧注意、心臓やばい、全身病気 <br>この中で今日の健康は・・・";
        $kuji = mt_rand(1, 6); // 乱数1から6まで
        switch ($kuji) {
            case 1:
                print "超健康体！";
                break;
            case 2:
                print "結構健康！";
                break;
            case 3:
                print "要注意";
                break;
            case 4:
                print "血圧注意";
                break;
            case 5:
                print "心臓やばい";
                break;
            default:
                print "全身病気";
                break;
        }
    } else {
        print "ラブラブ！、出会いあり！、待ち人あり、特に何も起こらない、まだまだ先だね、悪い出会いあり<br>この中で今日の恋愛運は・・・";
        $kuji = mt_rand(1, 6); // 乱数1から6まで
        switch ($kuji) {
            case 1:
                print "ラブラブ！";
                break;
            case 2:
                print "出会いあり！";
                break;
            case 3:
                print "待ち人あり";
                break;
            case 4:
                print "特に何も起こらない";
                break;
            case 5:
                print "まだまだ先だね";
                break;
            default:
                print "悪い出会いあり";
                break;
        }
    }
    ?>
</body>
</html>
