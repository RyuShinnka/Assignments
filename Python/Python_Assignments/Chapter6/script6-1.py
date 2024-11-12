scores = [100, 64, 48, 83]
sum = 0
count = 0
print('scores',scores)
for i in range(len(scores)):
    sum += float(scores[i])
    count += 1
print('合計：',int(sum))
print('平均：',sum/count)


"""
実行結果：
scores [100, 64, 48, 83]
合計： 295
平均： 73.75
"""
