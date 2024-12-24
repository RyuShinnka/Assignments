# 問題1
# 　ファイル名：kansu3-Mon-01
# メイン処理を作成
#     TBL=[20,60,50,10,70,30,90,100,85,65]
#     合計・平均を求め関数
#     最大値と最小値を求める関数

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
TBL=[20,60,50,10,70,30,90,100,85,65]

sumAvg = calc(TBL)
print("TBL配列の合計は：",sumAvg[0],"、平均は：",sumAvg[1])

maxMin = maxMin(TBL)
print("TBL配列の最大値は：",maxMin[0],"、最小値は：",maxMin[1])
