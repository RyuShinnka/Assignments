# ファイル名: kansu-Mon02-01.py

# 関数定義: 合計と平均を計算する関数
def calc(score1, score2, score3, score4):
    total = score1 + score2 + score3 + score4  # 合計を計算
    avg = total / 4  # 平均を計算
    return total, avg  # 合計と平均を戻り値として返す

# メイン処理

print("4教科の点数を入力してください。")

# キーボードから4つの点数を入力
score1 = int(input("1教科目の点数: "))
score2 = int(input("2教科目の点数: "))
score3 = int(input("3教科目の点数: "))
score4 = int(input("4教科目の点数: "))

# 関数を呼び出して合計と平均を取得
total, avg = calc(score1, score2, score3, score4)

# 結果を表示
print("4教科の合計点: " + str(total) + " 点")
print("4教科の平均点: " + str(avg) + " 点")