students = {"佐藤":100, "丸山":64, "三村":48, "古川":83}
students["佐藤"] = {'math':100, 'english':40, 'japanese':65}
students["丸山"] = {'math':64, 'english':98, 'japanese':79}
students["三村"] = {'math':48, 'english':87, 'japanese':92}
students["古川"] = {'math':83, 'english':81, 'japanese':74}

ks = students.keys()
for k in ks:
    print(k, students[k])

"""
実行結果：
佐藤 {'math': 100, 'english': 40, 'japanese': 65}
丸山 {'math': 64, 'english': 98, 'japanese': 79}
三村 {'math': 48, 'english': 87, 'japanese': 92}
古川 {'math': 83, 'english': 81, 'japanese': 74}
"""
