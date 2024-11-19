def get_total(x, y, z):
    return x + y + z

def get_average(x, y, z):
    return (x + y + z) / 3

def get_student(name):
    students = {
        "佐藤": {'math': 100, 'english': 40, 'japanese': 65}, 
        "丸山": {'math': 100, 'english': 40, 'japanese': 65},
        "三村": {'math': 48, 'english': 87, 'japanese': 92}, 
        "古川": {'math': 83, 'english': 81, 'japanese': 74}
    }
    if name in students:
        return students[name]
    else:
        return {'math': 0, 'english': 0, 'japanese': 0}


name = input('生徒名を入力してくださいー＞')
student = get_student(name)
total = get_total(student['math'], student['english'], student['japanese'])
avg = round(get_average(student['math'], student['english'], student['japanese']),5)

# 結果を表示する
print('合計値：', total)
print('平均値：', avg)
