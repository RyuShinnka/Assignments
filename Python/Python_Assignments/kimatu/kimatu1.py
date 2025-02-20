#関数の処理
def listfun(in_end):
    goukei = 0 # 合計値を初期化
    for val in range(10, in_end+1, 2): # 10から2増やした値が終了値になるまでループ
        goukei += val # 合計値にiを加算
    return goukei # 関数の戻り値として合計値を返す


#メインの処理

in_end = int(input("リストの終了値＝＞")) # キーボードから終了値を入力
go = listfun(in_end) # 関数を呼び出し合計値を取得
print("合計値:", go ) # 合計値を表示
