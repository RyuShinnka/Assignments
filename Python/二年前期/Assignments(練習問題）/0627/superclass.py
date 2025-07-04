class StudentCard:
    # コンストラクタ（学籍番号と学科名を初期化）
    def __init__(self, number, gakka):
        self.number = number  # 学籍番号
        self.gakka = gakka    # 学科名

    # 学籍情報を表示するメソッド
    def show_info(self):
        print()
        print("学籍番号:", self.number)
        print("学科名:", self.gakka)
