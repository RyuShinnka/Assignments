# 問題２
# 　ファイル名：kansu3-Mon-02
# キーボードから人数とゲームの点数を入力します。
# ゲームの点数の合計と平均を求め関数
# 最高点・最低点を求め関数

# 関数の処理:

def calc(arr):
    # 合計値を求め
    sum = 0
    for i in arr:
        sum += i
    # 平均値を求め
    count = 0
    for j in arr:
        count += 1
    avg = sum / count
    return sum,avg

def maxMin(arr):
    # 最大値を求め
    maxVal = arr[0]
    for i in arr:
        if i > maxVal:
            maxVal = i
    # 最小値を求め
    minVal = arr[0]
    for j in arr:
        if j < minVal:
            minVal = j
    return maxVal,minVal


# メイン処理
qua = int(input("人数を入力ー＞"))
scores = []
for i in range(qua):
    print((i+1),"人目のゲームの点数を入力ー＞")
    score = int(input())
    scores.append(score)

sumAvg = calc(scores)
print("合計は：",sumAvg[0],"、平均は：",sumAvg[1])

maxMin = maxMin(scores)
print("最大値は：",maxMin[0],"、最小値は：",maxMin[1])