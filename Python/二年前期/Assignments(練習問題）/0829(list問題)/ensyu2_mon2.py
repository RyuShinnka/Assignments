# 演習2:  ensyu2-mon2
# 辞書TBLに以下のようなキーと値が代入されています。
# {“apple”: 5, “banana”: 2, “cherry”: 8}
# TBLの値を昇順にソートして、以下のようにキーと値を出力してください。
# banana: 2 apple: 5 cherry: 8

"""関数の処理"""
def bubble_sort_by_value(tbl):
    # items() で (key,value) のリストに変換
    tbl_list = list(tbl.items())

    n = len(tbl_list)
    # バブルソート
    for i in range(n): # 0 から n-1 まで
        for j in range(0, n - i - 1): # 0 から n-i-2 まで
            if tbl_list[j][1] > tbl_list[j + 1][1]:
                # 値を比較して交換
                tbl_list[j], tbl_list[j + 1] = tbl_list[j + 1], tbl_list[j]
    return tbl_list


"""メイン処理"""
# 辞書の定義
TBL = {"apple": 5, "banana": 2, "cherry": 8}

# 関数を呼び出して昇順にソート
sorted_TBL = bubble_sort_by_value(TBL)

# 結果を出力
for k, v in sorted_TBL:
    print(k, ":", v, end=" ")