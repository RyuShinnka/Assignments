students = {"佐藤":100, "丸山":64, "三村":48, "古川":83}
students["佐藤"] = {'math':100, 'english':40, 'japanese':65}
students["丸山"] = {'math':64, 'english':98, 'japanese':79}
students["三村"] = {'math':48, 'english':87, 'japanese':92}
students["古川"] = {'math':83, 'english':81, 'japanese':74}

student = input("生徒の名前を入力してくださいー＞")
if student in students:
    print(students[student])
else:
    print("存在しません")
