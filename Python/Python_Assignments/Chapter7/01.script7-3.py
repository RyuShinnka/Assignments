def get_total(x, y, z):
    return x + y + z

def get_average(x, y, z):
    return (x + y + z) / 3

def get_student(name):
    if name in students:
        # 学生の情報を取得し、合計と平均を計算
        total = get_total(students[name]['math'], students[name]['english'], students[name]['japanese'])
        average = get_average(students[name]['math'], students[name]['english'], students[name]['japanese'])
        print('合計値：', total)
        print('平均値：', round(average,5))  # 平均を小数点第5位まで表示
    else:
        # 学生が存在しない場合
        none = {'math': 0, 'english': 0, 'japanese': 0}
        total = get_total(none['math'], none['english'], none['japanese'])
        average = get_average(none['math'], none['english'], none['japanese'])
        print('合計値：', total)
        print('平均値：', int(average))  # 平均を整数に変換して表示

# 学生データ
students = {
    "佐藤": {'math': 100, 'english': 40, 'japanese': 65}, 
    "丸山": {'math': 100, 'english': 40, 'japanese': 65},
    "三村": {'math': 48, 'english': 87, 'japanese': 92}, 
    "古川": {'math': 83, 'english': 81, 'japanese': 74}
}

# ユーザーからの入力を受け取る
name = input('生徒名を入力してくださいー＞')
get_student(name)
