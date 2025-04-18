# クラス問題1				
				
# ファイル名：chap08-01				
				
# 	クラス名：任意			
# フィールド名	
#   店番			
# 	店名	(渋谷・新宿・上野・銀座・原宿など)		
# 	売上額			
				
# 	初期化			
# 	引数から代入する			
# 	引数：店番・店名・売上額			
				
# 	①メソッド名：任意			
# 	フィールドを表示する			
				
# 	②メソッド名：任意			
# 	売上額の判定し結果を戻り値とする			
# 	0～1000	低迷		
# 	1001～5000	現状維持		
# 	5001以上	好調		
				
# メインメソッドの処理				
				
# 	インスタンス生成を行う初期化の値は任意			
# 	表示するメソッドの呼び出し			
# 	売上の判定のメソッドの呼び出し			
# 	戻り値を表示する			


class Shop:
    def __init__ (self, shop_no, shop_name, sales):
        # 店舗番号・店舗名・売上額を初期化
        self.shop_no = shop_no
        self.shop_name = shop_name
        self.sales = sales
        
    def display(self):
        # 店舗情報を表示
        print("店番：", self.shop_no)
        print("店名：", self.shop_name)
        print("売上額：", self.sales)
    
    def sales_judge(self):
        # 売上額の判定を行い、結果を返す
        if self.sales > 5000:
            return "好調"
        elif self.sales > 1000:
            return "現状維持"
        else:
            return "低迷"

"""
ーーー メイン処理 ーーー
"""

# インスタンス生成（初期値は任意）
shop1 = Shop(1039, '代々木', 4039)

# 情報表示メソッドの呼び出し
shop1.display()

# 売上判定メソッドの呼び出し
result = shop1.sales_judge()

# 戻り値の表示
print("売上額の判定し結果：", result)
