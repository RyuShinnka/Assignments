class Student:
    def __init__(self, name, math, english, japanese):
        # 生徒の名前と点数を初期化
        self.name = name
        self.math = math
        self.english = english
        self.japanese = japanese

    def show_detail(self):
        # 生徒の詳細情報を表示
        print('生徒名：', self.name)
        print('数学の点数：', self.math)
        print('英語の点数：', self.english)
        print('国語の点数：', self.japanese)

"""
ーーー メイン処理 ーーー
"""
students =[]

for i in range(1, 6):
    stu = input(str(i)+ '人目の生徒名を入力-> ')
    math = int(input(str(i)+ '人目の数学の点数を入力-> '))
    english = int(input(str(i)+ '人目の英語の点数を入力-> '))
    japanese = int(input(str(i)+ '人目の国語の点数を入力-> '))
    print()
    students.append(Student(stu, math, english, japanese))

for student in students:
    student.show_detail()
    print()
