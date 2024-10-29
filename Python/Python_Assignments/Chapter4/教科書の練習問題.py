# 練習問題1

num = int(input("整数を入力してくださいー＞"))
if num > 0:
    print("正の数です")
elif num < 0:
    print("負の数です")
else:
    print("0です")

# 練習問題2

num1 = int(input("整数を入力してくださいー＞"))
num2 = int(input("整数を入力してくださいー＞"))
if num1 > num2:
    print("数字1は数字2より大きい")
elif num1 < num2:
    print("数字2は数字1より大きい")
else:
    print("数字1と数字2は同じ数")

# 練習問題3

time = int(input("今何時ですか？"))
if time >= 6 and time <= 10:
    print("おはようございます")
elif time >= 11 and time <= 15:
    print("こんにちは")
elif (time >= 16 and time <= 23) or (time >= 0 and time <= 5):
    print("こんばんは")
else:
    print("0から23までの数字を入力してください")
