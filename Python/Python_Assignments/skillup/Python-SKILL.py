#関数の処理

def bubble_sort(arr):#バブルソート
    n = len(arr)
    for i in range(n): # 外側のループ
        for j in range(0, n-i-1): # 内側のループ
            if arr[j] > arr[j+1] : # 前の要素より大きい場合
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp

def binary_search(arr, x):  # 二分探索
    while True:  # 再入力処理を含む無限ループ
        low = 0  # 最初のインデックス
        high = len(arr) - 1  # 最後のインデックス
        while low <= high:  # 条件が成り立つ限りループ
            mid = (high + low) // 2
            
            if arr[mid] < x:  # 探索範囲の中央より小さい場合
                low = mid + 1
            elif arr[mid] > x:  # 探索範囲の中央より大きい場合
                high = mid - 1
            else:  # 探索範囲の中央に一致する場合
                return mid  # 見つかったインデックスを返す
        
        # 商品番号が見つからなかった場合
        print("!!!!!!!!!入力エラー!!!!!!!!!!")
        x = int(input("商品番号を再入力=>"))
def max_sale(arr, marr): # 最大売上の処理
    max_sale = 0
    max_index = 0
    for i in range(len(arr)): # 売上の最大値を求める
        if arr[i] > max_sale: # 売上が最大値を更新
            max_sale = arr[i] # 最大値を更新
            max_index = i # 最大値のindexを更新
    print("=========最大売上情報=========")
    print("最大の売上額:", max_sale)
    print("最大の売上商品:", marr[max_index])




#メインの処理
TBLNO =[205,201,209,202,206,200,203,204,208,207]
TBLT =[100,200,300,400,550,600,650,700,750,800]
TBLM =["A品","B品","C品","D品","E品","F品","G品","H品","I品","J品"]
TBLG =[0,0,0,0,0,0,0,0,0,0]

# TBLNOを昇順に並べ替える
bubble_sort(TBLNO)

for i in range(len(TBLNO)):
    # 商品番号と売上数を入力
    print("=========データを入力してください=========")
    x = int(input("商品番号を入力=>"))
    # 商品番号を検索してindexを求める
    index = binary_search(TBLNO, x)
    sale = int(input("売上数を入力=>"))
    TBLG[index] = sale * TBLT[index] # 売上を求める

print("=========売上金額情報=========")
print ("TBLG=",end="")
print(TBLG)

# 最大売上の処理
max_sale(TBLG, TBLM)

