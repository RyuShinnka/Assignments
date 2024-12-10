# キーをチェックして辞書から対応する値を返す関数
def check(key):
    jisyo = {'AA': 100, 'BB': 250, 'CC': 300, 'DD': 450}
    
    # 入力されたキーが辞書に存在するかを確認
    if key in jisyo:
        return True, jisyo[key]  # 存在する場合、Trueと対応する値を返す
    else:
        return False, 0  # 存在しない場合、Falseと0を返す

# ---------メイン処理 ---------
sum = 0  # 合計値の初期化
while True:
    key = input("キーを入力＝＞")
    
    # キーが辞書に存在するかをチェック
    if check(key)[0] == False:
        print("キーが見つからなかった、合計値：", sum)  # キーが見つからない場合のメッセージと合計値の表示
        print("プログラム終了")
        break  # ループを終了
    else:
        sum += check(key)[1]  # 合計値にその値を加算
