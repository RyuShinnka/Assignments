"""
7-3-1戻り値とは
"""
# 書式：関数の作り方（再掲）
# def 関数名(引数):
#     処理
#     return 戻り値

# 戻り値ありの関数例（kansu17.py、一部）P142
def cook(name = 'カレー', count = 1):
    print('料理をはじめます')
    return str(count) + '人分の' + name + 'を作りました'

# returnを途中に書いた場合（kansu18.py）P143
def cook(name = 'カレー', count = 1):
    print('料理をはじめます')
    return str(count) + '人分の' + name + 'を作りました'
    print('関数を終了します')
msg = cook('カレー',3)
print(msg)
# 実行結果：
# 料理をはじめます
# 3人分のカレーを作りました

"""
7-3-2 戻り値の利用
"""
# 書式：戻り値がある関数の呼び出し方
# 　戻り値を受け取る変数＝関数（引数１，引数２．．．）

# 戻り値ありの関数呼び出しの例（kansu18.py、一部）P143
msg = cook('カレー',3)

# 受け取った戻り値を使う例（kansu19.py）P144
def cook(name = 'カレー', count = 1):
    print('料理をはじめます')
    return str(count) + '人分の' + name + 'を作りました'

msg = cook('カレー',3)
print('受け取ったメッセージを表示します')
print(msg)
# 実行結果：
# 料理をはじめます
# 受け取ったメッセージを表示します
# 3人分のカレーを作りました

# 戻り値を使った表示（kansu20.py）P144
def cook(name = 'カレー', count = 1):
    print('料理をはじめます')
    return str(count) + '人分の' + name + 'を作りました'

print(cook('カレー',3))

