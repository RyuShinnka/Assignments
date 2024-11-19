def get_total(x,y,z):
    return x+y+z

def get_average(x,y,z):
    return (x+y+z)/3

num1 = int(input('整数１を入力してくださいー＞'))
num2 = int(input('整数２を入力してくださいー＞'))
num3 = int(input('整数３を入力してくださいー＞'))

print('合計値：',get_total(num1,num2,num3))
print('平均値：',get_average(num1,num2,num3))