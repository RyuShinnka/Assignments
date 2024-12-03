# 問題４	ファイル名：ensyu06-Mon04
# 	問題３と同じ内容で総和をもとめますが
# 	途中の計算結果を表示する工夫をしましょう。
# 	3から８までの総和であれば
# 	3+4+5+6+7+8＝33

# 3から８までの総和を計算する関数
def sum(start, end):
    total = 0
    for i in range(start, end+1):
        total += i
    return total
# 3から８までの総和を計算して表示する
result = sum(3, 8)
print("3から8までの総和は", result, "です。")