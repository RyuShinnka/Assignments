"""
6-2-1 繰り返す条件を指定する　while文
"""
# 書式　while 条件式:
# while 繰り返し条件：
#     繰り返し処理

# whileの例（kurikaeshi14.py） P122
lst = [3, 6, 7, 8]
i = 0
while lst[i] !=7:
    print("要素が７になるまで繰り返す")
    print(lst[i])
    i += 1
# 実行結果：
# 要素が７になるまで繰り返す
# 3
# 6
# 7

"""
無限ループ
"""
# 無限ループの例（kurikaeshi15.py）P123
i = 5
while i < 10:
    print(i)
    i += 1

# 無限ループの例（kurikaeshi16.py）P124
while True:
    print("無限ループ")

# breakを使った中断（kurikaeshi17.py）P124
i = 0
x = 3
while True:
    if i == x:
        print("ループを中断しました")
        break
    i += 1
    print(i, x)
print("ループを終了しました")
# 実行結果：
# 1 3
# 2 3
# 3 3
# ループを中断しました
# ループを終了しました

# continueを使った処理飛ばし（kurikaeshi18.py）P125
i = 0
x = 3
while i < 5:
    if i == x:
        i += 1
        print("先頭に戻ります")
        continue
    print(i,x)
    i += 1
# 実行結果：
# 1 3
# 2 3
# 3 3
# 4 3
# 先頭に戻ります
# 1 3
# 2 3
# 3 3
# 4 3
