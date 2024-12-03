# 問題３	ファイル名：ensyu06-Mon03
# 	ｘからｙまでの総和を求める
# 	ｘとｙはキーボードから入力する
# 	ｘとｙの値を比較してｘがｙより大きい時は「入力エラー」と表示し終了する
# 	ｘがｙより小さい時は、総和を求め表示する

# 入力
x = int(input("xを入力=>"))
y = int(input("yを入力=>"))

# 処理
if x > y:
    print("入力エラー")
else:
    total = 0
    for i in range(x, y+1):
        total += i
    print("総和=", total)