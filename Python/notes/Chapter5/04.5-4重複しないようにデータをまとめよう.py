# 5-4-2 セット（集合）の作成
# 書式：　セット　＝　set(リストやタプルなどデータをまとめたもの)

# set()関数を使ってセットを作成する例（shugou01.py）
lst = [10, 3.14, 'abc', 10]
st = set(lst)
print(st) # {10, 3.14, 'abc'}
# 直接値を指定してセットを作成する例（shugou02.py）
st = {10, 3.14, 'abc'}
print(st) # {10, 3.14, 'abc'}

# 直接値を指定してセットを作成する
st = set(10, 3.14, 'abc', 10)
print(st) # {10, 3.14, 'abc', 10}

# 5-4-3 セットから値を取り出す
# セットとin演算子の例（shugou03.py）
st = {10, 3.14, 'abc'}
if 3.14 in st:
    print(str(3.14) + 'はstの要素です。')
else:
    print(str(3.14) + 'はstの要素ではありません。')

# 5-4-4 セットの値を変更する
# 削除
# セットから要素を削除する例（shugou04.py）
st = {10, 3.14, 'abc'}
st.remove(10)
print(st) # {3.14, 'abc'}
st.discard(3.14)
print(st) # {'abc'}

# 追加
# セットに要素を追加する例（shugou05.py）
st = {10, 3.14, 'abc'}
st.add(10)
print(st) # {10, 3.14, 'abc'}
st.update([10, 3.14, 'abc'])
print(st) # {10, 3.14, 'abc'}


# COLUMN リストから重複しないデータを取り出す(set_list.py)