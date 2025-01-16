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
        if($_SERVER["REQUEST_METHOD"] == "POST"){
            echo "<p>あなたの手は".$_POST["hand"]."<br>";
            $computer_hand = array("ぐー", "パー", "チョキ");
            $computer_hand = $computer_hand[array_rand($computer_hand)];
            echo "コンピューターの手は".$computer_hand."<br>";
            if(($_POST["hand"] == "ぐー" && $computer_hand == "チョキ") || ($_POST["hand"] == "チョキ" && $computer_hand == "ぐー")){
                echo "勝敗は…ぐー！";
            }
            elseif(($_POST["hand"] == "パー" && $computer_hand == "ぐー") || ($_POST["hand"] == "ぐー" && $computer_hand == "パー")){
                echo "勝敗は…パー！";
            }elseif(($_POST["hand"] == "チョキ" && $computer_hand == "パー") || ($_POST["hand"] == "パー" && $computer_hand == "チョキ")){
                echo "勝敗は…チョキ！";
            }else{ echo "勝敗は…あいこ"; }
        }else{
            print "<p>あなたの手は未設定<br>コンピューターの手は未設定<br>勝敗は・・・これから</p>";
        }
    ?>
</body>
</html>