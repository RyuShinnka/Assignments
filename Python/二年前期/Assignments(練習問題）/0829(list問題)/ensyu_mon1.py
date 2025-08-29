# リスト名は任意で、リストを定義する
# キーボードから値を入力し、リストを作成します。
# 要素数は任意とします。
# 作成したリストの値を降順に並べ替え表示する
# (バブルソートしましょう）

# リストの作成
lst = []
n = int(input("要素数を入力-> "))
for i in range(n):
    lst.append(int(input("値を入力->")))

# 降順に並べ替え
for i in range(n):
    for j in range(n-i-1):
        if lst[j] < lst[j+1]:
            lst[j], lst[j+1] = lst[j+1], lst[j]

# 降順に並べ替えたリストを表示
print("降順に並べ替えたリスト: ", lst)