# 問題６	ファイル名：ensyu06-Mon06
# 	ｎ個の記号文字”＊”をｗ個ごとに改行しながら表示する
# 	ｎとｗはキーボードから入力する

n = int(input("表示する個数を入力=>"))
w = int(input("改行する個数を入力=>"))

for i in range(n):
    print("*", end="")
    if (i + 1) % w == 0:# w個ごとに改行
        print()  