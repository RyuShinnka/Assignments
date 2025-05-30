import random

omikujis = ["大吉", "中吉", "小吉", "凶", "大凶"]

for i in range(3):
    print("=========第", i+1, "回のおみくじ=========")
    print()
    result = random.choice(omikujis)
    print(result, "です！")
    print()
    if i < 2:
        choice = int(input("続きますか？　YES＝1・NO＝2 ；　＝＞"))
        print()
        if choice == 2:
            break
print("=========おみくじを終了します=========")