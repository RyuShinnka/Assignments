# 偶数番地と奇数番地の合計を求める関数
def even_odd(TBL):
    even_sum = 0  # 偶数番地の合計を初期化
    odd_sum = 0   # 奇数番地の合計を初期化
    
    # リストの各要素に対して処理を行う
    for i in range(len(TBL)):
        if i % 2 == 0:  # インデックスが偶数かどうかをチェック
            even_sum += TBL[i]  # 偶数番地の値を加算
        else:  # インデックスが奇数の場合
            odd_sum += TBL[i]   # 奇数番地の値を加算
            
    return even_sum, odd_sum  # 偶数番地と奇数番地の合計を返す

# ---------メイン---------
TBL = [20,60,50,10,70,30,90,100,85,65]
# 関数を実行し、結果を出力
print('TBLの偶数番地の値の合計は:', even_odd(TBL)[0])
print('TBLの奇数番地の値の合計は:', even_odd(TBL)[1])
