students = {
    "佐藤": {'math': 100, 'english': 40, 'japanese': 65}, 
    "丸山": {'math': 100, 'english': 40, 'japanese': 65},
    "三村": {'math': 48, 'english': 87, 'japanese': 92}, 
    "古川": {'math': 83, 'english': 81, 'japanese': 74}
}
while True:
    name = input("生徒名を入力してくださいー＞")
    if name in students:
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
