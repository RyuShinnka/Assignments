from superclass import StudentCard  # 親クラスStudentCardをインポート

# StudentCardクラスを継承したItstudentクラス
class Itstudent(StudentCard):
    # コンストラクタ（学籍番号・学科名・出席回数を初期化）
    def __init__(self, number, gakka, attendees):
        super().__init__(number, gakka)  # 親クラスの初期化
        self.attendees = attendees       # 出席回数
        self.rate = 0                    # 出席率（初期値は0）

    # 出席率を計算するメソッド（全15回中の割合）
    def get_rate(self):
        self.rate = int(self.attendees / 15 * 100)

    # 学籍情報と出席率を表示するメソッド
    def show_info(self):
        print()
        super().show_info()              # 親クラスのshow_info()を呼び出す
        print("出席率:", self.rate, "%")
