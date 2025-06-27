"""クラスの処理"""
class Student:
    max_ave_index = 0  # 平均点が一番高い生徒のインデックスを保持するクラス変数

    def __init__(self, number, name, python, java):
        self.number = number       # 学籍番号
        self.name = name           # 氏名
        self.python = python       # Pythonの点数
        self.java = java           # Javaの点数
        self.ave = 0               # 平均点（初期値は0）
        self.level = ""            # 成績評価（A/B/C）

    # 生徒の情報を表示するメソッド
    def showInfo(self):
        print()
        print("学籍番号：", self.number)
        print("氏名：", self.name)
        print("Pythonの点数：", self.python)
        print("Javaの点数：", self.java)
        print("2教科の平均点:", self.ave)
        print("成績評価:", self.level)

    # 成績評価を判定するメソッド
    def calc_level(self):
        if self.python >= 80 and self.java >= 80:
            self.level = "A評価"
        elif self.python >= 80 or self.java >= 80:
            self.level = "B評価"
        else:
            self.level = "C評価"

    # 平均点を計算するメソッド
    def calc_ave(self):
        self.ave = int((self.python + self.java) / 2)

    # 平均点が一番高い生徒のインデックスを取得するクラスメソッド
    @classmethod
    def get_max_ave_index(cls, students, info):
        max_ave = 0
        for i in range(info):
            if students[i].ave > max_ave:
                max_ave = students[i].ave
                cls.max_ave_index = i


"""メインの処理"""
info = 4             # 入力する生徒の人数
students = []        # Studentインスタンスを格納するリスト

# 生徒情報の入力と処理
for i in range(info):
    print()
    print("=========", (i + 1), "人目の情報を入力してください=========")
    number = int(input("学籍番号を入力(23001～23999までの番号)=>"))
    name = input("名前を入力=>")
    py = int(input("Pythonの点数を入力=>"))
    java = int(input("Javaの点数を入力=>"))

    student = Student(number, name, py, java)
    student.calc_ave()       # 平均点を計算
    student.calc_level()     # 成績評価を判定
    students.append(student) # リストに追加

# 平均点が一番高い生徒を特定
Student.get_max_ave_index(students, info)

print()
print("======２教科の平均点が一番高い人の情報を表示する======")
students[Student.max_ave_index].showInfo()

print()
print("======A評価の人を表示する======")
for i in range(info):
    if students[i].level == "A評価":
        students[i].showInfo()
