
# 問題３
# ファイル名：Chap03ーMon3
# キーボードから生年月日を入力
# 名前も入力し、下記のように表示しましょう。
# 「私は〇〇です。現在〇〇才です。」
# 「誕生月は〇〇です。」

# 生年月日を入力
birth = input("生年月日を入力してください(例：19900101): ")
name = input("名前を入力してください: ")

# 年齢を計算
birth_year = int(birth[0:4])
age = 2024 - birth_year

# 誕生月を取得
birth_month = birth[4:6]

# 出力
print("私は" + name + "です。現在" + str(age) + "才です。")
print("誕生月は" + birth_month + "月です。")



