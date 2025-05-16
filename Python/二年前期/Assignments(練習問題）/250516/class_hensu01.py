class Goods:
    totalSales = 0

    def __init__(self, no, price, qua, name):
        self.no = no
        self.label = ""
        self.price = price
        self.qua = qua
        self.name = name
        self.sales = 0

    # 商品番号に応じた分類ラベルを設定
    def nameLabel(self):
        if 1000 <= self.no < 2000:
            self.label = "アウター"
        elif 2000 <= self.no < 3000:
            self.label = "インナー"
        elif 3000 <= self.no < 4000:
            self.label = "ワンピーズ"
        else:
            self.label = "パンツ"

    # 商品の詳細を表示
    def showinfo(self):
        print("---------商品の情報を表示---------")
        print("商品番号：", self.no)
        print("商品名：", self.name)
        print("分類名：", self.label)
        print("単価：", self.price)
        print("売上個数：", self.qua)
        print("売上金額:", self.sales)

    # 売上を計算
    def getSales(self):
        self.sales = self.price * self.qua

    # クラス全体の売上合計を集計
    @classmethod
    def getTotalSales(cls, allGoods):
        cls.totalSales = 0  # ← 一度初期化
        for good in allGoods:
            cls.totalSales += good.sales

    # 売上状況を判定して表示
    @classmethod
    def checkSales(cls):
        if cls.totalSales >= 1000000:
            print("売上好調")
        elif cls.totalSales >= 500000:
            print("売上半減")
        else:
            print("売上赤字")

    # 売上の最大・最小を表示
    @classmethod
    def getMaxMin(cls, allGoods):
        maxGood = allGoods[0]
        minGood = allGoods[0]
        for good in allGoods:
            if good.sales > maxGood.sales:
                maxGood = good
            if good.sales < minGood.sales:
                minGood = good
        print("一番高い売上の商品は：", maxGood.name, ", 売上は：", maxGood.sales)
        print("一番低い売上の商品は：", minGood.name, ", 売上は：", minGood.sales)


"""
商品情報の入力処理
"""
def inputs():
    results = []
    while True:
        num = int(input("商品番号を入力=>"))
        if num == 9999:
            print("プログラミング終了します")
            break
        if 1000 <= num <= 4999:
            name = input("商品名を入力＝＞")
            price = int(input("単価を入力＝＞"))
            qua = int(input("個数を入力＝＞"))
            result = Goods(num, price, qua, name)
            result.nameLabel()
            result.getSales()
            results.append(result)
        else:
            print("入力エラー")
    return results


"""
メインの処理
"""
goods = inputs()
print()

# 全商品情報の表示
for good in goods:
    good.showinfo()

# 総売上の計算
Goods.getTotalSales(goods)

# 売上判定
Goods.checkSales()

# 最大最小の売上商品を表示
Goods.getMaxMin(goods)
