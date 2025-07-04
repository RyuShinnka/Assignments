from superclass import Shop  
# Shopクラスを継承したClacクラス（売上計算用）
class Clac(Shop):
    # コンストラクタ（店舗ID、名前、目標額、単価、来店者数を初期化）
    def __init__(self, id, name, goal, price, visitors):
        super().__init__(id, name, goal)   # スーパークラスの初期化
        self.price = price                 # 商品単価
        self.visitors = visitors           # 来店者数
        self.sales_amount = 0              # 売上高（初期値）
        self.goal_text = ""                # 目標達成テキスト（初期値）

    # 売上高を計算するメソッド
    def calc_sales_amount(self):
        self.sales_amount = self.price * self.visitors

    # 売上が目標額に達したか判定するメソッド
    def set_goal_text(self):
        if self.sales_amount >= self.goal:
            self.goal_text = "目標達成"
        else:
            self.goal_text = "目標額に届かない"

    # 店舗情報と売上状況を表示するメソッド
    def print_info(self):
        super().print_info()
        print("売上高:", self.sales_amount)
        print("目標達成状況:", self.goal_text)
