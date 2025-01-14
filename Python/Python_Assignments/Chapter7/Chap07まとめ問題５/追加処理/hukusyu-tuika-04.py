# 復習問題4	
# 	ファイル名：hukusyu-Mon-04
# 	フレンチレストランのコース料理にポイントを付けています
# 	下記の条件です。
# 	誕生月と年齢をキーボードから入力します。
# 	年齢が20以上で8月生まれの人は「Aコースで３ポイント」と表示
# 	年齢が60以上で2月生まれの人は「Bコースで５ポイント」と表示
# 	年齢は関係なく、12月生まれの人は「Cコース10ポイント」と表示
# 	誕生月関係なく、年齢が９０以上の人は「Dコース20ポイント」と表示
# 	それ以外の人は「ポイント無」表示

# ファイル名：hukusyu-tuika-04
# 追加処理
# ８名のデータを入力します。
# それぞれのポイントのカウントをして表示する

#-----------------------------------関数処理

# ポイントを計算する関数
def point_cal(birth_month, age):
    if birth_month == 8 and age >= 20:
        return "Aコースで３ポイント"
    elif birth_month == 2 and age >= 60:
        return "Bコースで５ポイント"
    elif birth_month == 12:#もし12月生まれの９０歳以上の人がいたら　損になるね
        return "Cコース１０ポイント"
    elif age >= 90:
        return "Dコース２０ポイント"
    else:  # それ以外
        return "ポイント無"

# ポイントを集計する関数
def count_points(result, point_counts):
    if "Aコース" in result:
        point_counts["Aコース"] += 1
    elif "Bコース" in result:
        point_counts["Bコース"] += 1
    elif "Cコース" in result:
        point_counts["Cコース"] += 1
    elif "Dコース" in result:
        point_counts["Dコース"] += 1
    else:
        point_counts["ポイント無"] += 1

#------------------------------メイン処理

# ポイントのカウント用辞書
point_counts = {
    "Aコース": 0,
    "Bコース": 0,
    "Cコース": 0,
    "Dコース": 0,
    "ポイント無": 0
}

# 誕生月と年齢-->８名のデータを入力
print("８名のデータを入力してください")
for i in range(8):
    print("--- " + str(i + 1) + "人目のデータ ---")
    
    # 誕生月と年齢を入力
    birth_month = int(input("誕生月を入力してください(1-12)-> "))
    age = int(input("年齢を入力してください-> "))
    
    # ポイント計算
    result = point_cal(birth_month, age)
    print(result)
    
    # ポイントのカウント
    count_points(result, point_counts)

# ポイントのカウント結果を表示
print("\n＊＊＊＊＊＊ ポイント集計結果 ＊＊＊＊＊＊")
print("Aコース:", point_counts["Aコース"], "人")
print("Bコース:", point_counts["Bコース"], "人")
print("Cコース:", point_counts["Cコース"], "人")
print("Dコース:", point_counts["Dコース"], "人")
print("ポイント無:", point_counts["ポイント無"], "人")
