# タプル（tuple）
# タプルとリストで一番大きく異なるのは、タプルでは要素の追加や削除など、あとからデータを変更できないということです
# 例えば、タプルのデータにdelやinsertメソッドなど、要素の変更を行おうとするとエラーが出力されます
tpl = (10, 3.14, 'abc')
tpl.insert(1, 'ABC')
print(tpl)  # attributeError: 'tuple' object has no attribute 'insert' タプルでは要素追加ができないというメッセージ

# 5-2-2 タプル作成
# 書式：　変数名＝（要素１,　要素２,　要素３,　...）
# タプルの作成例（tuple02.py）
tpl = (10, 3.14, 'abc')
print(tpl)  # (10, 3.14, 'abc')

# 要素が１つだけのタプルの例（tuple03.py）
tpl = (10)
print(tpl)  # 10 「,」を付けないと数値として出力
tpl = (10,)
print(tpl)  # (10,)　「,」を付けるとタプルとして出力

# インデックスを指定してタプルから要素を取り出す例（tuple04.py）
tpl = (10, 3.14, 'abc')
print(tpl[1])  # 3.14
print(tpl[1:3])  # (3.14, 'abc')

#リストと同様の方法　len()関数、in 演算子 
tpl = (10, 3.14, 'abc')
count = len(tpl)
print(count)  # 3
print(3.14 in tpl)  # True

# タプルからリスト、リストからタプルへの変換(tuplecolumn01.py)
tpl = (10, 3.14, 'abc')
lst = list(tpl)
print(lst)  # [10, 3.14, 'abc'] リストが出力
tpl = (10, 3.14, 'abc')
lst = list(tpl)
tpl2 = tuple(lst)
print(tpl2)  # (10, 3.14, 'abc')　タプルが出力
