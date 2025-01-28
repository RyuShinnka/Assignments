# 問題４	ファイル名：kimatu-mon4	
# 	関数処理内容	
# 		引数：無
# 		戻り値：リスト
# 		キーボードから人数とゲームの点数を入力します。
# 		ゲームの点数を順にリストに追加してリストを作成する
		
# 	メイン処理	
# 		入力しリストを作成する関数を世出す
# 		戻り値のリストから合計と平均を求める
# 		平均値より大きい値を検索し表示する

"""関数処理内容"""
def input_list():
    
    num = int(input("人数を入力してください->")) #  人数を入力
    score_list = [] #  ゲームの点数のリストを作成
    for i in range(num):#  人数分ループ
        score = int(input("ゲームの点数を入力してください->"))#  点数を入力
        score_list.append(score)#  リストに順に追加
    return score_list


"""メイン処理"""
score_list = input_list() #  関数を呼び出し、リストを作成
total = sum(score_list) #  リストの合計を求める
average = total / len(score_list) #  リストの平均を求める
print("合計:", total)
print("平均:", average)

print("平均値より大きい値:", end=" ")
for score in score_list:#  リストをループ
    if score > average:#  平均値より大きい値を検索
        print(score, end=" ")#  値を表示