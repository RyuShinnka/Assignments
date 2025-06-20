class Student:
    totalScore = 0
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
    def get_total_score(self):
        # 合計点を計算
        return self.math + self.english + self.japanese
    
    def get_average_score(self):
        # 平均点を計算（小数第5位まで）
        total_score = self.get_total_score()
        return round(total_score / 3, 5)

