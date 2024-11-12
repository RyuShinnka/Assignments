"""
6-1-1  for文を使った繰り返しの書き方
"""
# 書式：forを使った繰り返しの書き方 P114
# for 変数 in データの集まり：
#     繰り返したい処理

"""
6-1-2  range()関数の使い方
"""

#書式：range()関数の使い方（その１） P115
# range(終了値)
# 終了値を指定したrange()関数の使用例(kurikaeshi01.py)
r = range(5)
print(list(r)) # [0, 1, 2, 3, 4]

#書式：range()関数の使い方（その２） P116
# range(始まり値, 終了値)
# 開始値も指定したrange()関数の使用例(kurikaeshi02.py)
r = range(3, 5)
print(list(r)) # [3, 4]

#書式：range()関数の使い方（その３） P116
# range(始まり値, 終了値, 増減値)
# 開始値、終了値、増減値を指定したrange()関数の使用例(kurikaeshi03.py)
r = range(1, 5, 2)
print(list(r)) # [1, 3]
# 増減値をマイナス値としたrange()関数の使用例(kurikaeshi04.py)
r = range(10, 4, -2)
print(list(r)) # [10, 8, 6]

"""
6-1-3 決まった回数を繰り返す処理
"""
# 書式：forとrange()関数を組み合わせた書き方 P117
# for 変数 in range(繰り返し回数):
#     繰り返したい処理
# 　決まった回数繰り返すfor の使用例(kurikaeshi05.py)
for i in range(3):
    print("表示します")
    print(i)

# 開始値10、終了値３で３ずつ減る数を表示する（kurikaeshi06.py) P118
for i in range(10, 3, -3):
    print("表示します")
    print(i)
# 実行結果：
# 表示します
# 10
# 表示します
# 7
# 表示します
# 4

"""
6-1-4 データの集まりの要素の数分繰り返す
"""
# インデックスからリストの要素を取り出す例（kurikaeshi07.py） P119
lst = [10, 3.14, "abc"]
for i in range(len(lst)):
    print(lst[i])
# 実行結果：
# 10
# 3.14
# abc

# リストの要素を取り出す例（kurikaeshi08.py） P120
lst = [10, 3.14, "abc"]
for v in lst:
    print(v)
# 実行結果：
# 10
# 3.14
# abc

# セットから要素を取り出す例（kurikaeshi09.py） P120
s = {10, 3.14, "abc"}
for v in s:
    print(v)
# 実行結果：
# 10
# 3.14
# abc

"""
6-1-5
"""
# 辞書からキーを取り出す例：（kurikaeshi10.py） P120
dct = {101:'abc', 102:'xyz', 103:[10, 30, 20]}
for k in dct:
    print(k)
# 実行結果：
# 101
# 102
# 103

# 辞書からキーを取り出す、値を表示する例：（kurikaeshi11.py） P121
dct = {101:'abc', 102:'xyz', 103:[10, 30, 20]}
for k in dct:
    print(k, dct[k])
# 実行結果：
# 101 abc
# 102 xyz
# 103 [10, 30, 20]

# items()メソッドで辞書から要素を取り出す例：（kurikaeshi12.py） P121
dct = {101:'abc', 102:'xyz', 103:[10, 30, 20]}
for kv in dct.items():
    print(kv)
# 実行結果：
# (101, 'abc')
# (102, 'xyz')
# (103, [10, 30, 20])

# items()メソッドで辞書から要素を取り出す例：（kurikaeshi13.py） P121
dct = {101:'abc', 102:'xyz', 103:[10, 30, 20]}
for k, v in dct.items():
    print(k, v)
# 実行結果：
# 101 abc
# 102 xyz
# 103 [10, 30, 20]
