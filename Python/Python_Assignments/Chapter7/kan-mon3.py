# 数値のリストTBLを定義
TBL = [20, 60, 50, 10, 70, 30, 90, 100, 85, 65]

# 最大値と最小値を探す関数
def find_max_min(TBL):
    max = TBL[0]  # 最初の要素を最大値と最小値の初期値に設定
    min = TBL[0]
    
    # リストの各要素に対して処理を行う
    for i in range(len(TBL)):
        if TBL[i] > max:  # 現在の値が最大値より大きければ、最大値を更新
            max = TBL[i]
        elif TBL[i] < min:  # 現在の値が最小値より小さければ、最小値を更新
            min = TBL[i]
    
    # 最大値と最小値を返す
    return max, min
# ---------メイン---------
# 関数を実行し、結果を出力
print("TBL[]の最大値と最小値は", find_max_min(TBL))
