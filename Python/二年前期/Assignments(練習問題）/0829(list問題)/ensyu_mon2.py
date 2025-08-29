# List1＝［10,25,50,65,77,85,100,105,110,130,155,160]を定義
# キーボードから検索するキーを入力する
# List1から検索値を２分探索で検索する。
# キーと同じ値が見つかったそのインデックスを表示する
# 見つからなかったら「キーと同じ値は有りませんでした」と表示する

List1 = [10,25,50,65,77,85,100,105,110,130,155,160]

search_key = int(input("検索する値を入力->"))

low = 0
high = len(List1) - 1

while low <= high:
    mid = (low + high) // 2
    if List1[mid] == search_key:
        print("見つかりました。インデックスは", mid)
        break
    elif List1[mid] < search_key:
        low = mid + 1
    else:
        high = mid - 1
else:
    print("キーと同じ値は有りませんでした")