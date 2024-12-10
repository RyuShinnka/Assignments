# 関数で値が1～50の間で引き渡された倍数値のみをリストに作成してリストを戻り値とする
def find(num):
    list = []  # 結果を格納するリストの初期化
    multiple = num  # 初期の倍数を設定
    while multiple <= 50:  # 1～50の範囲内で倍数を繰り返す
        list.append(multiple)  # リストに倍数を追加
        multiple += num  # 次の倍数に進む
    return list  # 倍数リストを戻り値として返す

# ---------メイン処理---------

num = int(input('倍数値を入力（１～５０の間）ー＞'))

# find関数を呼び出し、指定された倍数に基づくリストを取得
multiples = find(num)

# 戻り値のリストを表示する
print(num, 'の倍数値は', multiples, 'です。')
