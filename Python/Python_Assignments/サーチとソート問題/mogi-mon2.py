# 問題２	ファイル名：mogi-mon2
# 	List1＝［10,25,50,65,77,85,100,105,110,130,155,160]を定義
# 	キーボードから検索するキーを入力する
# 	List1から検索値を２分探索で検索する。
# 	キーと同じ値が見つかったそのインデックスを表示する
# 	見つからなかったら「キーと同じ値は有りませんでした」と表示する

List1 = [10,25,50,65,77,85,100,105,110,130,155,160]

key = int(input("検索する値を入力してください："))

# ２分探索法　		（バイナリーサーチ）	
idx = -1
low = 0
high = len(List1) - 1
while low <= high and idx == -1:
    mid = (low + high) // 2
    if List1[mid] == key:
        idx = mid
    elif List1[mid] < key:
        low = mid + 1
    else:
        high = mid - 1

if idx == -1:
    print("キーと同じ値は有りませんでした")
else:
    print("キーと同じ値が見つかりました。インデックスは", idx)
