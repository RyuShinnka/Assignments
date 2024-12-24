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

# 関数処理
def point_cal(birth_month, age):
    if birth_month == 8 and age >= 20:
        return "Aコースで３ポイント"
    elif birth_month == 2 and age >= 60:
        return "Bコースで５ポイント"
    elif birth_month == 12 and age < 90:
        return "Cコース１０ポイント"
    elif age >= 90:
        return "Dコース２０ポイント"
    else:
        return "ポイント無"


# メイン処理

# 誕生月と年齢の入力
birth_month = int(input("誕生月を入力してください(1-12): "))
age = int(input("年齢を入力してください: "))

# 関数の実行
result = point_cal(birth_month, age)

# 結果の表示
print(result)