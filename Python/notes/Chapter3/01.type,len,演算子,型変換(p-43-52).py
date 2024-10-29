'''
基本プログラム
'''
print(type(3.14)) # float
print(type("調べたいデータ")) # str
print(type(1+2j)) # complex
a = type(3.14) # 変数aに型を代入
print(a) # 変数aの型を表示 float
print(type(True)) # bool

# 文字列の表示
# \n 改行
# \t タブ
# \\ 円マーク
# \' 単一引用符
# \" 二重引用符

# 文字列の長さ
print(len('あいうえお')) # 5
print(len(u'あいうえお')) # 5

# 演算子
"""
 +   加算 
x + y
 -   減算
x - y
 *   乗算
x * y
 /   除算
x / y
 //  切り捨て除算
x // y # 小数点以下切り捨て
 %   剰余
x % y # 割ったあまり
 **  べき乗
x ** y # xのy乗
"""
# 数値を文字列に変換する
str("変換したい数値のデータ")
print('数値は：' + str(3.14)) # 数値は：3.14
# 文字列を数値に変換する
int("変換したい文字列のデータ")
float("変換したい文字列のデータ")
complex("変換したい文字列のデータ")

# 文字列型を掛け算すると、文字列が連結され掛け算結果が得られる。
print('Hello' * 3) # HelloHelloHello