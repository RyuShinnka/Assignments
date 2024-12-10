# 指定された回数分、授業回数を表示する関数
def show(times):
    for i in range(times):  # 0からtimes-1まで繰り返し
        print('Pythonの授業は', i+1, '回目です')  # 授業回数を表示

# ---------メイン処理---------

times = int(input('Pythonの授業の回数を入力ー＞'))

# 入力された回数分、授業回数を表示する関数を呼び出す
show(times)
