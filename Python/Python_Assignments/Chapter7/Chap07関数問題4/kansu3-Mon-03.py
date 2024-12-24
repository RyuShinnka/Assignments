# 問題３
# ファイル名：kansu3-Mon-03	
# キーボードから整数値を繰返し入力します。	
# ９９９の整数が終了値となります。	
# その値が３の倍数である時その値ｌｓｔに追加して表示	
# ３の倍数のカウントをして表示する	
	
# 	空のリストと3の倍数のカウント用
	
# 関数での処理	
# 	引数と戻り値は任意
	
# 	引数で渡された値を３の倍数であるか判断して
# 	３の倍数であればその値をリストに追加していく
# 	リストを表示する
# 	3の倍数の数を数える
	
# メイン処理	
# 	キーボードから整数値を入力し
# 	終了値999の時は繰り返しを終了
# 	終了値でない時は関数に引き渡し関数を呼び出す




# 関数の処理
def three_times(num,lst,count):
    if num % 3 == 0:
        lst.append(num)
        count += 1
        return lst, count

# メイン処理
lst = []
count = 0
while True:
    num = int(input("整数値を入力してください->"))
    if num == 999:
        print("終了します")
        break
    else:
        lst,count = three_times(num,lst,count)

print("3の倍数のリスト:", lst)
print("3の倍数の数:", count)