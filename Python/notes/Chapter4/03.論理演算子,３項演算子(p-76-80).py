"""
and 左右すべての条件がTrueのときにTrue、そうでないときにFalse
or 左右のいずれかの条件がTrueのときにTrue、そうでないときにFalse
not 条件がTrueのときにFalse、FalseのときにTrue
"""

# and演算子
a = int(input("整数を入力してください->"))
if a < 10 and a >= 0:
    print("aは0以上10未満です。")
else:
    print("aは0より小さい、または10以上です。")

# and を略の書式
a = int(input("整数を入力してください->"))
if 0 <= a < 10:
    print("aは0以上10未満です。")
else:
    print("aは0より小さい、または10以上です。")

# or演算子
a = int(input("整数を入力してください->"))
if a < 0 or a > 10:
    print("aは0より小さい、または10以上です。")
else:
    print("aは0以上10未満です。")

# not演算子
a = int(input("整数を入力してください->"))
if not a < 10:
    print("aは10未満ではありません。")
elif not a >= 0 :
    print("aは10以上ではありません。")
else:
    print("aは0以上10未満です。")

# 3項演算子
num1 = 10
str1 = '偶数' if num1 % 2 == 0 else '奇数'
print(str1) # 出力: 偶数