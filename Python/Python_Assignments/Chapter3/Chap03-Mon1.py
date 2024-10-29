# 問題１
# ファイル名：Chap03ーMon1
# キーボードから整数を２個入力します。
# この整数値を使って下記の計算を行い式と答えを表示しなさい。
# 足し算
# 引き算
# 掛け算
# 割り算
# 余りを求める
# 商を求める

num1 = int(input("整数1を入力してください->")) 
num2 = int(input("整数2を入力してください->")) 
puls = num1 + num2
minus = num1 - num2
kake = num1 * num2
waru = num1 / num2
amari = num1 % num2
syou = num1 // num2 #商を求める
print(str(num1)+' + '+ str(num2)+' = '+str(puls))
print(str(num1)+' - '+ str(num2)+' = '+str(minus))
print(str(num1)+' * '+ str(num2)+' = '+str(kake))
print(str(num1)+' / '+ str(num2)+' = '+str(waru))
print(str(num1)+' % '+ str(num2)+' = '+str(amari))
print(str(num1)+' // '+ str(num2)+' = '+str(syou))