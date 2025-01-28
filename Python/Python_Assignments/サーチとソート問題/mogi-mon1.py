# 問題１	ファイル名：mogi-mon1
# 	リスト名は任意で、リストを定義する
# 	キーボードから値を入力し、リストを作成します。
# 	要素数は任意とします。
# 	作成したリストの値を降順に並べ替え表示する
# 	バブルソートしましょう


# 変数を準備
lst = []
temp = 0
i = 0
last = 0

# キーボードから値を入力
lstLen = int(input("リストの要素数を入力ー＞"))
for i in range(lstLen):
    lst.append(int(input("値を入力ー＞")))

# 降順に並べ替え  バブルソート
last = lstLen-1

# for文

"""
for i in range(last):
    for j in range(last-i):
        if lst[j] < lst[j+1]:
            temp = lst[j]
            lst[j] = lst[j+1]
            lst[j+1] = temp
"""

# while文
while last > 0:
    i = 0
    while i < last:
        if lst[i] < lst[i+1]:
            temp = lst[i]
            lst[i] = lst[i+1]
            lst[i+1] = temp
        i += 1
    last -= 1

# 結果を表示
print("降順に並べ替えたリスト：", lst)

