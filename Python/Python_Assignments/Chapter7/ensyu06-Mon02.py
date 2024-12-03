# 問題２	ファイル名：ensyu06-Mon02
# 	1からｎまでの４の倍数の総和を求める
# 	ｎの値はキーボードから入力する（ｎの値は１以上の数を入力）
# 	４の倍数の表示も行う

n = int(input("１以上の数を入力=> "))
total = 0
print("４の倍数:")
for i in range(1, n+1):
    if i % 4 == 0:
        print(str(i))
        total += i
print("総和=", total)