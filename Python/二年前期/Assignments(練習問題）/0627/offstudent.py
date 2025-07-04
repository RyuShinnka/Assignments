from superclass import StudentCard  # 親クラスStudentCardをインポート

# StudentCardクラスを継承したOffstudentクラス
class Offstudent(StudentCard):
    # コンストラクタ（学籍番号・学科名・国籍を初期化）
    def __init__(self, number, gakka, na):
        super().__init__(number, gakka)  # 親クラスの初期化
        self.na = na                     # 国籍
        self.score = 0                  # 平均点（初期値）
        self.level = ""                 # 成績評価（初期値）

    # 3教科の点数を入力し、平均点と成績評価を計算
    def input_score(self):
        print("========３教科の点数を入力してください==========")
        score1 = int(input("1教科の点数を入力=>"))
        score2 = int(input("2教科の点数を入力=>"))
        score3 = int(input("3教科の点数を入力=>"))
        self.score = (score1 + score2 + score3) / 3

        if self.score >= 80:
            self.level = "優"
        elif self.score >= 60:
            self.level = "良"
        else:
            self.level = "不可"

    # 学籍情報と国籍、成績評価を表示するメソッド
    def show_info(self):
        print()
        super().show_info()  # 親クラスのshow_info()を呼び出す
        print("国籍:", self.na)
        print("成績評価:", self.level)
