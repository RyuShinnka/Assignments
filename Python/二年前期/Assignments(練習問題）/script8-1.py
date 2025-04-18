class Student:
    def __init__(self, name, math, english, japanese):
        self.name = name
        self.math = math
        self.english = english
        self.japanese = japanese

    def show_detail(self):
        print('生徒名：', self.name)
        print('数学の点数：', self.math)
        print('英語の点数：', self.english)
        print('国語の点数：', self.japanese)


# 1人目の生徒情報を入力
stu1 = input('生徒名を入力してください-> ')
math1 = int(input('数学の点数を入力してください-> '))
english1 = int(input('英語の点数を入力してください-> '))
japanese1 = int(input('国語の点数を入力してください-> '))
print()

# 2人目の生徒情報を入力
stu2 = input('生徒名を入力してください-> ')
math2 = int(input('数学の点数を入力してください-> '))
english2 = int(input('英語の点数を入力してください-> '))
japanese2 = int(input('国語の点数を入力してください-> '))
print()

# 生徒オブジェクトを作成
student1 = Student(stu1, math1, english1, japanese1)
student2 = Student(stu2, math2, english2, japanese2)

# 表示
print("＜生徒１＞")
student1.show_detail()
print("＜生徒２＞")
student2.show_detail()
