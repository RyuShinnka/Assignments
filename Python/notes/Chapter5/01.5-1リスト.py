# 書式：リストの作り方 P85
# 　変数名　＝　[要素１, 要素２, 要素３,...]

# リストは　それぞれのデータの型が異なることが可能です。

lst = [10, 3.14, 'abc']
print(lst)

# リストの中にリストを入れえ作成
lst = [10, [1, 2, 3], 30]
print(lst)

# リストから要素を取り出す P86
# JAVAと同じく、0から数えてインデックス
print(lst[0])  # 10
print(lst[1])  # [1, 2, 3]
print(lst[2])  # 30

# マイナスを指定して要素を取り出す
print(lst[-1])  # 30
print(lst[-2])  # [1, 2, 3]

# リストを切り出す（スライス）P87
# 書式　スライスの書き方
# 　変数名　＝　リスト[開始インデックス:終了インデックス]
lst = [10, 3.14, 'abc']
slice = lst[1:3]
print(slice)  # [3.14, 'abc']

# 開始インデックスの省略例 P88
lst = [10, 3.14, 'abc']
slice = lst[:2]
print(slice)  # [10, 3.14]
slice = lst[1:]
print(slice)  # [3.14, 'abc']

# リストの要素分用意する ただし、変数の数が要素の数と一致していなしていないとエラーになる
lst = [10, 3.14, 'abc']
a, b, c = lst
print(a)  # 10
print(b)  # 3.14
print(c)  # 'abc'

# リストの中に要素が入っているかどうか確認する P89
# 書式：in演算子の使い方
# 要素　in　リスト
lst = [10, 3.14, 'abc']
print(10 in lst)  # True
print(20 in lst)  # False
# 書式：indexメソッドの使い方 P90
# リスト.index(要素)
# indexメソッドの場合、リストに要素として含まれる場合はインデックスを表示、含まれない場合はエラー
lst = [10, 3.14, 'abc']
print(lst.index(10))  # 0
print(lst.index(2))  # ValueError: 2 is not in list

# リストの要素を変更する P90
# 例：
lst = [10, 3.14, 'abc']
print(lst[1])  # 3.14
lst[1] = 6.2
print(lst[1])  # 6.2


# 要素を後ろに追加する p90
# 今まで入っているリストの後ろに追加する場合は、+=演算子を使ってリスト同士をつなげます
# 書式：リスト同士をつなげる方法
# リスト1　+=　リスト2
lst = [10, 3.14, 'abc']
lst += [20]
print(lst)  # [10, 3.14, 'abc', 20]  20を追加した

# appendメソッドを使って追加することもできます P91
# 書式：リスト.append(追加したい要素)
lst = [10, 3.14, 'abc']
lst.append(20)
print(lst)  # [10, 3.14, 'abc', 20]　　20を追加した

# 要素をリストの途中に追加する P91
# リストの中に要素を追加する場所を指定して追加する場合は、insertメソッドを使います
# 書式：リスト.insert(追加したい場所のインデックス, 追加したい要素)
lst = [10, 3.14, 'abc']
lst.insert(1, 'ABC')
print(lst)  # [10, 'ABC', 3.14, 'abc']　インデックス１の位置に'ABC'を追加した

# インデックスを指定して要素を削除する P92
# リストから要素を削除する場合は、delまたはpopメソッドを使います
# 書式：del リスト[削除したい要素のインデックス]
# 書式：リスト.pop(削除したい要素のインデックス)   P93
lst = [10, 3.14, 'abc']
del lst[1]
print(lst)  # [10, 'abc']　インデックス１の位置の要素を削除した
lst = [10, 3.14, 'abc']
lst.pop(0)
print(lst)  # [3.14, 'abc']　インデックス０の位置の要素を削除した

# 要素を指定して削除する   P93
# リストから指定した要素を削除する場合は、removeメソッドを使います
# 書式：リスト.remove(削除したい要素)
lst = [10, 3.14, 'abc']
lst.remove(3.14)
print(lst)  # [10, 'abc']　3.14を削除した

# removeメソッドを使うときに、要素が存在しない場合はValueErrorになるため、ifと組み合わせて使うと良いでしょう
lst = [10, 3.14, 'abc']
if 'XYZ' in lst:
    lst.remove('XYZ')
print(lst)  # [10, 3.14, 'abc']　'XYZ'が存在しないので削除されない

# リストの長さを確認する   P94
# len関数を使う
# 書式：len(リスト)
lst = [10, 3.14, 'abc']
count = len(lst)
print(count)  # 3(要素の数を出力)

# len()関数とインデックス番号の組み合わせ（list20.py）
lst = [10, 3.14, 'abc']
last = lst[len(lst)-1]
print(last)  # 'abc'　最後の要素が取り出される

# min()関数とmax()関数
# 要素の最小値・最大値の取得例
numbers = [10, 30, 20, 15]
min_num = min(numbers)
max_num = max(numbers)
print('最小値:', min_num)  # 10
print('最大値:', max_num)  # 30

# ただし、文字列と数値が混ざっているリストでは使用できません
# エラーの例：
etc = [10, 3.14 , 'abc']
min_str = min(etc)  
max_str = max(etc)
print('最小値:', min_str)  # TypeError: '>' not supported between instances of 'float' and 'str'
print('最大値:', max_str)  # TypeError: '>' not supported between instances of 'float' and 'str'
