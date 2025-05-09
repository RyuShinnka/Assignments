class Student:
    def __init__(self, name, math, english, japanese):
        # 名前と各教科の点数を初期化
        self.name = name
        self.math = math
        self.english = english
        self.japanese = japanese

    def show_detail(self):
        # 生徒の情報を表示
        print('生徒名：', self.name)
        print('数学の点数：', self.math)
        print('英語の点数：', self.english)
        print('国語の点数：', self.japanese)
    
    def get_total_score(self):
        # 合計点を取得
        return self.math + self.english + self.japanese
    
    def get_averate_score(self):
        # 平均点を取得（小数第5位まで）
        total_score = self.get_total_score()
        return round(total_score / 3, 5)


"""
ーーー メイン処理 ーーー
"""

# 生徒リストを作成
students = []

for i in range(1, 6):
    name = input(str(i) +"人目の生徒の名前を入力＝＞")
    math = int(input(name + "さんの数学の点数を入力＝＞"))
    eng = int(input(name + "さんの英語の点数を入力＝＞"))
    ja = int(input(name + "さんの国語の点数を入力＝＞"))
    students.append(Student(name, math, eng, ja))





# students = [Student('佐藤', 100, 40, 65), Student('丸山', 64, 98, 79),
#             Student('三村', 48, 87, 92), Student('古川', 83, 81, 74)]






# 検索する生徒名を入力
stu1 = input('検索する生徒名を入力してください-> ')

check = True
for x in students:
    # 生徒が見つかったら情報を表示
    if stu1 == x.name:
        x.show_detail()
        check = False
        break


# 見つからなかった場合のメッセージ
if check:
    print('存在しません')
