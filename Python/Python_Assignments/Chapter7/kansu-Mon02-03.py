# ファイル名: kansu-Mon01.py

# 関数定義: 入園料を計算する関数
def calculate_fee(age):
    if age >= 60:  # 60歳以上
        return 300
    elif 20 <= age < 60:  # 20歳以上60歳未満
        return 1000
    elif 5 <= age < 20:  # 5歳以上20歳未満
        return 500
    else:  # 5歳未満
        return 0

# メイン処理

total_fee = 0  # 合計入園料
people_count = 5  # 5人分のデータ

print("5人分の年齢を入力してください。")

# 5人分の年齢を入力し、入園料を計算
for i in range(1, people_count + 1):
    print(str(i) + "人目の年齢を入力=》")  # 文字列連結
    age = int(input())  # 年齢を入力
    fee = calculate_fee(age)  # 関数を呼び出して入園料を計算
    total_fee += fee  # 合計金額に加算

# 合計入園料を表示
print("5人分の合計入園料: " + str(total_fee) + " 円")