# 関数１（入力処理）
# 引数：無
# 戻り値：リスト
# キーボードから人数とゲームの点数を入力します。
# ゲームの点数を順にリストに追加してリストを作成する
# 関数2（合計・平均処理）
# 引数：入力処理で作成したリスト
# 戻り値：合計と平均
# 関数３（平均値より大きい値の数を求める関数処理）
# 引数：入力処理で作成したリスト
# 戻り値：平均値より大きい値の数
# メイン処理
# リストを作成する関数を呼び出す
# 戻り値のリストから合計と平均を求める関数を呼び出す
# 平均値より大きい値の数を求める関数を呼び出す
# それぞれの関数を呼び出し戻り値を表示する


"""関数の処理"""
def 入力処理():
    num = int(input("人数を入力して->"))
    scores = []
    for i in range(num):
        score = int(input("ゲームの点数を入力して->"))
        scores.append(score)
    return scores

def 合計平均処理(scores):
    total = sum(scores)
    average = total / len(scores)
    return total, average

def 平均値より大きい値の数を求める関数処理(scores):
    average = sum(scores) / len(scores)
    count = 0
    for score in scores:
        if score > average:
            count += 1
    return count


"""メインの処理"""
scores = 入力処理()
result = 合計平均処理(scores)
count = 平均値より大きい値の数を求める関数処理(scores)

print("合計:", result[0])
print("平均:", result[1])
print("平均値より大きい値の数:", count)
