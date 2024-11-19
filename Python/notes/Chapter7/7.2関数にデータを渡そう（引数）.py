"""
7-2-1 引数とは
"""
# 書式：関数の作り方（引数あり、戻り値なし）
# def 関数名(引数1, 引数2, 引数3, …):
#     引数の内容によって変わる処理

"""
7-2-2 引数のある関数
"""
# 引数ありのcook()関数（kansu04.py一部）P132
def cook(name):
    print('料理をはじめます')
    print(name + 'を作りました')

# 引数ありの関数を呼び出す例（kansu04.py）P133
cook('ナポリタン')

# 引数の内容を変えて関数を呼び出す例（kansu05.py）P134
cook('カレー')
cook('ナポリタン')
cook('ハンバーグ')

# 引数が複数ある関数（kansu06.py） P134 ~ P135
def cook(name, count):
    print('料理をはじめます')
    print(str(count) + '人分の' + name + 'を作りました')

cook('カレー', 3)

# 変数を引数に指定する（kansu07.py） P135
def cook(name, count):
    print('料理をはじめます')
    print(str(count) + '人分の' + name + 'を作りました')

cary = 'カレー'
cnt = 3
cook(cary, cnt)

# 変数を引数に指定する（kansu08.py） P136
def cook(name, count):
    print('料理をはじめます')
    print(str(count) + '人分の' + name + 'を作りました')

name = 'カレー'
count = 3
cook(name, count)

"""
7-2-3 引数の初期値
"""
# 書式：引数のデフォルト値
# def 関数名(引数1=デフォルト値1, 引数2=デフォルト値2, 引数3=デフォルト値3, …):
#     引数の内容によって変わる処理

# 引数にデフォルト値を指定した関数例（kansu09.py） P137
def cook(name='カレー', count=1):
    print('料理をはじめます')
    print(str(count) + '人分の' + name + 'を作りました')
cook()

# デフォルト値を利用せず、引数を指定した例（kansu10.py）P137
def cook(name='カレー', count=1):
    print('料理をはじめます')
    print(str(count) + '人分の' + name + 'を作りました')
cook('ナポリタン', 4)
# 実行結果：
# 料理をはじめます
# 4人分のナポリタンを作りました

# 一部だけデフォルト値を利用した例（kansu11.py） P138
def cook(name='カレー', count=1):
    print('料理をはじめます')
    print(str(count) + '人分の' + name + 'を作りました')
cook('ハンバーグ')
# 実行結果：
# 料理をはじめます
# 1人分のハンバーグを作りました

"""
7-2-4　引数に名前を付ける
"""
# 書式：キーワード付き引数の使い方
# 関数名（引数名＝値１, 引数名＝値２, 引数名＝値３, …）

# キーワード付き引数の実行例（kansu12.py） P138
def cook(name, count):
    print('料理をはじめます')
    print(str(count) + '人分の' + name + 'を作りました')
cook(name='カレー', count=3)
# 実行結果：
# 料理をはじめます
# 3人分のカレーを作りました

# キーワード付き引数と無名引数の混在例（kansu13.py） P139
def cook(name, count):
    print('料理をはじめます')
    print(str(count) + '人分の' + name + 'を作りました')
cook('カレー', count=3)

# キーワード付き引数の注意（kansu_a1.py）P139
def cook(name, count):
    print('料理をはじめます')
    print(str(count) + '人分の' + name + 'を作りました')
# cook(name='カレー',  3) # 引数の順番が間違っている
# 実行結果：
# TypeError: cook() missing 1 required positional argument: 'count'

# デフォルト値を指定している関数（kansu14.py） P140
def cook(name = 'カレー', count =  1):
    print('料理をはじめます')
    print(str(count) + '人分の' + name + 'を作りました')
cook(count=3)

"""
7-2-5 引数の順番を変更する
"""
# 引数の順序を変更した例（kansu15.py） P140
def cook(name = 'カレー', count =  1):
    print('料理をはじめます')
    print(str(count) + '人分の' + name + 'を作りました')
cook(count=3, name = 'カレー')

# ３つ以上の引数がある関数（kansu16.py） P141
def cook(name = 'カレー', count =  1, cold = False):
    temp = '熱々の'
    if cold:
        temp = '冷たい'

    print('料理をはじめます')
    print(str(count) + '人分の' + temp + name + 'を作りました')
cook('ハンバーグ', cold=False, count=2)
