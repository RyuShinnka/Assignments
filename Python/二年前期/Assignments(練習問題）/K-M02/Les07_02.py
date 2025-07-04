from superclass import Shop         # 親クラスShopをインポート
from Clac import Clac              # 売上計算用のClacクラスをインポート

shops = []  # 店舗オブジェクトを格納するリスト

print("=========３店舗分の情報を入力してください。=========")

# 3店舗分の情報を入力
for i in range(3):
    print()
    print("======店舗", i+1, "の情報を入力してください。======")
    shop_id = int(input("店舗のIDを入力して＝＞"))             # 店舗ID
    shop_name = input("店舗の名前を入力して＝＞")             # 店舗名
    shop_goal = int(input("店舗の目標額を入力して＝＞"))       # 目標額
    price = int(input("商品の値段を入力して＝＞"))             # 商品単価
    visitors = int(input("店舗の来客数を入力して＝＞"))        # 来客数

    # Clacインスタンスを生成し、売上・目標判定を実行
    shop = Clac(shop_id, shop_name, shop_goal, price, visitors)
    shop.calc_sales_amount()   # 売上高を計算
    shop.set_goal_text()       # 目標達成状況を判定
    shops.append(shop)         # リストに追加

# 入力された3店舗の情報を表示
print()
print("========３店舗の情報=========")
for shop in shops:
    shop.print_info()
