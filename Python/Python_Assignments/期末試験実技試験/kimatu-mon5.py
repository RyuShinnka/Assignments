# 関数処理内容
# 引数：キー
# 戻り値：TrueかFalseと値か０
# jisyo={'AA':100,'BB:250,'CC':300,'DD':450,'EE':350,'FF':750}
# 辞書は関数で定義する
# jisyoに同じキー有ったら、Trueとその値を返す
# 同じキーが無かったらFalseと０を返す
# メイン処理
# 繰返しキーを入力しjisyoから検索する
# 入力されたキーを引渡し関数を呼び出す
# 戻り値がFalseの時は、「プログラム終了」表示して終わる
# 戻り値がTrueの時は、値を合計し次のキー入力をして繰り返す

"""関数の処理"""
def search(key): #引数はキー
    jisyo={'AA':100,'BB':250,'CC':300,'DD':450,'EE':350,'FF':750}
    if key in jisyo: #キーが辞書にあるか
        return True,jisyo[key] #Trueと値を返す
    else:
        return False,0 #Falseと０を返す


"""メインの処理"""
total = 0 #合計値を初期化
while True: #無限ループ
    key = input("キーを入力して->") 

    result = search(key) #関数を呼び出し
    if result[0] == False: #Falseの時
        print("プログラム終了")
        break #ループを抜ける
    else:
        total += result[1] #値を合計
print("合計は",total,"円です")
