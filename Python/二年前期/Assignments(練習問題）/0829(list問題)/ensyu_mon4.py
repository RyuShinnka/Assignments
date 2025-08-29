# 関数処理内容	
# 	引数：無
# 	戻り値：リスト
# 	キーボードから人数とゲームの点数を入力します。
# 	ゲームの点数を順にリストに追加してリストを作成する
	
# メイン処理	
# 	入力しリストを作成する関数を呼び出す
# 	戻り値のリストから合計と平均を求める
# 	平均値より大きい値を検索し表示する

"""関数処理"""
def input_list():
    num = int(input("人数を入力->"))
    score_list = []
    for i in range(num):
        score = int(input("ゲームの点数を入力->"))
        score_list.append(score)
    return score_list

"""メイン処理"""
score_list = input_list()
total = sum(score_list)
average = total / len(score_list)
print("合計：", total)
print("平均：", average)

print("平均以上の点数：")
for score in score_list:
    if score > average:
        print(score, "点")