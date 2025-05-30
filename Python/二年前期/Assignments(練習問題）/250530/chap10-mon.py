"""
各自の誕生日から今日までの日数を表示
誕生日の曜日も表示する
"""

import datetime

# 誕生日の入力
birth_year = int(input("誕生年を入力してください: "))
birth_month = int(input("誕生月を入力してください: "))
birth_day = int(input("誕生日を入力してください: "))

# 誕生日の日付オブジェクトを作成
birth_date = datetime.date(birth_year, birth_month, birth_day)

# 現在の日付の取得
today = datetime.date.today()

# 誕生日からの日数を計算
days_from_birth = (today - birth_date).days

# 誕生日の曜日を取得
weekdays = ["月", "火", "水", "木", "金", "土", "日"]
birth_weekday = weekdays[birth_date.weekday()]

# 結果を表示
print("誕生日:", birth_date.strftime("%Y年%m月%d日"))
print("誕生日の曜日:", birth_weekday, "曜日")
print("今日からの日数:", days_from_birth, "日")
print("あなたは", days_from_birth // 365, "歳です。")
