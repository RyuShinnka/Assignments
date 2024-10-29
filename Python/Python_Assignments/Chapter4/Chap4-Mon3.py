# 問題３ ファイル名：Chap04-Mon3
# キーボードから入力名前を入力し、年齢を入力します。
# 年齢によって該当するクラスを表示しなさい。
# 0から5 幼児クラス
# 6から7 小学クラス
# 8から12 高学年クラス

name = input("名前を入力してください：")
age = int(input("年齢を入力してください："))
check = True
if age >= 0 and age <= 5:
    className = "幼児クラス"
elif age >= 6 and age <= 7:
    className = "小学クラス"
elif age >= 8 and age <= 12:
    className = "高学年クラス"
else:
    check = False
if check:
    print(name + "さんは" + str(age) + "歳です。" + "クラスは" + className + "です。")
else:
    print("入力エラーです。")