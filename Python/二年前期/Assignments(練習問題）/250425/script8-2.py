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
        print('合計点：', self.get_total_score())
        print('平均点：', self.get_averate_score())
    
    def get_total_score(self):
        # 合計点を計算
        return self.math + self.english + self.japanese
    
    def get_averate_score(self):
        # 平均点を計算（小数第5位まで）
        total_score = self.get_total_score()
        return round(total_score / 3, 5)

"""
ーーー 関数の処理 ーーー
"""

def findMax(students):
  max = 0
  for student in students:
    if (student.get_total_score()) > max:
      max = student.get_total_score()
  return max


"""
ーーー メインの処理 ーーー
"""
students = []

for i in range(1, 4):
  stu1 = input(str(i) + '人目の生徒名を入力-> ')
  math1 = int(input(str(i) + '人目の数学の点数を入力-> '))
  english1 = int(input(str(i) + '人目の英語の点数を入力-> '))
  japanese1 = int(input(str(i) + '人目の国語の点数を入力-> '))
  print()
  students.append(Student(stu1, math1, english1, japanese1))
  
# 最大値を求めるメソッド　呼び出し
max = findMax(students)

# 表示
for student in students:
  student.show_detail()


print('最高点：', max)
