# 関数１の処理	
# 	jisyo＝｛102：’渋谷’,105:'新宿',112:'原宿',230:'池袋',212:'東京'}
# 	ID番号から店名を探して、戻り値とする。
# 関数２の処理	
# 	tenmei＝｛’渋谷’:250000,'新宿':630000,'原宿':456000,'池袋':358000,'東京':850000}
# 	店名から目標額を探して、売上額と比較して下記の判定から評価を戻り値とする
# 	目標額より、売上額が大きい場合は、「達成」と評価する
# 	目標額にみなたかった場合は、売上額/目標額の計算で％表示にして「目標の〇〇％」と評価する
# メイン処理	
# 1	キーボードから入力店のIDと売上金額を入力
# 2	関数１を呼び出して、入力されたIDを引数とし検索します。戻り値の店名を受け取ります。
# 3	関数２を呼び出して、店名と売上金額を引数とします。戻り値は、目標達成の判定を受け取ります。
# 4	結果を次のように表示します。「ID＝〇〇：店名＝○○は、○○○○です。」
# 	１から４までの処理を繰り返し出来るようにします。
# 	店のIDが999が入ってきたらプログラム終了となります。



# 関数１の処理: 店舗IDに対応する店名を取得
def get_shop_name(id):
    jisyo = {102: '渋谷', 105: '新宿', 112: '原宿', 230: '池袋', 212: '東京'}  # 店舗IDと店名の対応表
    return jisyo.get(id)  # 辞書からIDに対応する店名を取得

# 関数２の処理: 売上金額に対する評価を計算
def get_evaluation(shop_name, sales):
    tenmei = {'渋谷': 250000, '新宿': 630000, '原宿': 456000, '池袋': 358000, '東京': 850000}  # 店舗ごとの売上目標
    if sales > tenmei[shop_name]:  # 売上が目標を超えている場合
        return '達成'
    else:  # 売上が目標未満の場合、達成率を計算
        rate = sales / tenmei[shop_name] * 100
        return '目標の' + str(int(rate)) + '％'

# メイン処理
while True:
    # 店舗IDを入力
    id = int(input('IDを入力->'))
    if id == 999:  # 終了コマンド（999）を入力した場合
        print('プログラムを終了します。')
        break
    
    # 売上金額を入力
    sales = int(input('売上金額を入力->'))
    
    # 店舗名と評価を取得
    shop_name = get_shop_name(id)  # 関数1で店名を取得
    evaluation = get_evaluation(shop_name, sales)  # 関数2で売上の評価を取得
    
    # 結果を表示
    print('ID=' + str(id) + '：店名=' + shop_name + 'は、' + str(sales) + '円です。' + evaluation + 'です。')

