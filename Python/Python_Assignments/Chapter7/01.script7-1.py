def print_score(x,y,z):
    sum = x + y + z
    avg = sum / 3
    print('合計値：', sum)
    print('平均値：', avg)

num1 = int(input('整数１を入力してくださいー＞'))
num2 = int(input('整数２を入力してくださいー＞'))
num3 = int(input('整数３を入力してくださいー＞'))

print_score(num1,num2,num3)