# 問題４	ファイル名：ensyu06-Mon04
# 	問題３と同じ内容で総和をもとめますが
# 	途中の計算結果を表示する工夫をしましょう。
# 	3から８までの総和であれば
# 	3+4+5+6+7+8＝33

total = 0
for i in range(3, 9):
    total += i
    if i == 8:
        print(str(i), "=", end=" ")
    else:
        print(str(i),"+", end=" ")
print(total,end=" ")
