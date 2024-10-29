# 問題２
# ファイル名：Chap03ーMon2
# キーボードから入力したデータを文字列と整数と小数点数に変換して
# それぞれのtypeを表示してみましょう。

moji = (input("数字を入力してください->")) 
print(type(moji))
intmoji = int(moji)
print(type(intmoji))
floatmoji = float(moji)
print(type(floatmoji))