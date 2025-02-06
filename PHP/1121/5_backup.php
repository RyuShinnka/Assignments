<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <p>バックアップしたいファイルを拡張子を付けて入力し、ボタンをクリックしてください</p>
    <form action="5_backup.php" method="post"> 
        <input type="text" name="filename">
        <input type="submit" value="バックアップ">
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {#POST送信時の処理
        $filename = $_POST["filename"]; #ファイル名を取得
        $part = explode(".", $filename); #ファイル名を分割
        $name_part = $part[0]; #拡張子を除いたファイル名を取得
        $backup_filename = $name_part . ".bak"; #バックアップファイル名を生成

        if (file_exists($filename)) { #ファイルが存在するか確認
            $content = file($filename); #ファイルの内容を取得

            $fh = @fopen($backup_filename, "w") or die("Error\n"); #バックアップファイルを開く
            flock($fh, LOCK_EX); #ファイルロック
            foreach ($content as $line) { #ファイルの内容を書き込み
                fputs($fh, $line); #ファイルに書き込み
            }
            flock($fh, LOCK_UN); #ファイルアンロック
            fclose($fh); #ファイルを閉じる

            print $backup_filename . " でバックアップしました"; #結果を表示
        } else {#ファイルが存在しない場合
            print "ファイルが見つかりません"; 
        }
    }
?>
</body>
</html>
