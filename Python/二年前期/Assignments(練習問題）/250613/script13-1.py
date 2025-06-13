# 合計を求める関数
def get_total(x, y, z):
    return x + y + z

# 平均を求める関数
def get_average(x, y, z):
    return (x + y + z) / 3

# 合計と平均を表示する関数
def print_score(num1, num2, num3):
    print('合計値：', get_total(num1, num2, num3))
    print('平均値：', get_average(num1, num2, num3))

# メイン処理（整数3つを入力）
while True:
    try:
        num1 = int(input("整数1を入力してください->"))
    except ValueError:
        print("整数以外が入力されました")
    else:
        break

while True:
    try:
        num2 = int(input("整数2を入力してください->"))
    except ValueError:
        print("整数以外が入力されました")
    else:
        break

while True:
    try:
        num3 = int(input("整数3を入力してください->"))
    except ValueError:
        print("整数以外が入力されました")
    else:
        break

# 結果を表示
print_score(num1, num2, num3)
