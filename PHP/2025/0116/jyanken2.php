<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jyanken</title>
</head>
<body>
    <form action="<?php echo $_SERVER["PHP_SELF"]; ?>" method="POST">
        <p>自分の手を選択してから勝負ボタンを押してください<br>
        <label><input type="radio" name="hand" value="ぐー" required>ぐー</label>　
        <label><input type="radio" name="hand" value="パー">パー</label>　
        <label><input type="radio" name="hand" value="チョキ">チョキ</label><br><br>
        <input type="submit" value="勝負">
        </p>
    </form>
    <?php
        $file = "jyan.txt";
        $count = 0;
        try {
            if (!file_exists($file)) {
                throw new Exception("ファイル見つかりません");
            }
            // 現在の勝利数を取得
            if (file_exists($file)) {
                // ファイルを読み取りモードで開く
                $fp = fopen($file, "r");
                $count = (int)fread($fp, filesize($file));
                fclose($fp);
            }else{
                // ファイルを新規書き込みモードで開く
                $fp = fopen($file, "w");
                fputs($fp, $count);
                fclose($fp);
            }
            if ($_SERVER["REQUEST_METHOD"] == "POST") {
                $user_hand = $_POST["hand"];
                echo "<p>あなたの手は " . $user_hand . "<br>";

                // コンピューターの手をランダムで決定
                $computer_hand = array("ぐー", "パー", "チョキ");
                $computer_hand = $computer_hand[array_rand($computer_hand)];
                echo "コンピューターの手は " . $computer_hand . "<br>";

                // 勝敗の判定
                // userの勝の場合
                if($user_hand == "ぐー" && $computer_hand == "パー" || $user_hand == "パー" && $computer_hand == "チョキ" || $user_hand == "チョキ" && $computer_hand == "ぐー"){
                    echo "勝敗は・・・あなたの勝ち！";
                    $count++; // 勝利数を増加
                    $fh = fopen($file, "w"); // ファイルを書き込みモードで開く
                    fputs($fh, $count); // 勝利数をファイルに書き込む
                    fclose($fh); // ファイルを閉じる
                }elseif($user_hand == $computer_hand){
                    echo "勝敗は・・・あいこ！";
                }else{
                    echo "勝敗は・・・あなたの負け！";
                }
                echo "<br>現在の勝利数: " . $count . "</p>";
            } else {
                echo "<p>あなたの手は未設定<br>コンピューターの手は未設定<br>勝敗は・・・これから<br>";
                echo "現在の勝利数: " . $count . "</p>";
            }
        } catch (Exception $e) {
            print "キャッチされた例外: (" . $e->getMessage() . ")<br>";
        }
    ?>
</body>
</html>
