# 問題１
print(type(1 + 2))  # <class 'int'>
print(type(4 * 2 * 3.14)) # <class 'float'>
print(type(8 // 3)) # <class 'int'>
print(type('1 + 2')) # <class'str'>
print(type('Hello' + '3')) #  <class'str'>
print(type(True)) # <class 'bool'>
print(type('False')) # <class'str'>

# 問題２
lastname = input("姓を入力してくださいー＞") #山田
name = input("名を入力してくださいー＞") #太郎
print(lastname+name) #山田太郎

# 問題３

num1 = int(input("整数1を入力してください->")) #20
num2 = int(input("整数2を入力してください->")) #15
print(str(num1) + "+" + str(num2) + "=" + str(num1 + num2))  #20+15=35
print(str(num1) + "-" + str(num2) + "=" + str(num1 - num2))  #20-15=5