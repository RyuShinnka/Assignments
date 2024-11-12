students = {"佐藤":100, "丸山":64, "三村":48, "古川":83}
students["佐藤"] = {'math':100, 'english':40, 'japanese':65}
students["丸山"] = {'math':64, 'english':98, 'japanese':79}
students["三村"] = {'math':48, 'english':87, 'japanese':92}
students["古川"] = {'math':83, 'english':81, 'japanese':74}

ks = students.keys()
while True:
    name = input("生徒名を入力してくださいー＞")
    if name in ks:
        print(students[name])
        break
    else:
        print("存在しません")

"""
実行結果：
生徒名を入力してくださいー＞田中
存在しません
生徒名を入力してくださいー＞山本
存在しません
生徒名を入力してくださいー＞三村
{'math': 48, 'english': 87, 'japanese': 92}
"""