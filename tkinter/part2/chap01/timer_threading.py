import tkinter as tk
import threading as th

count = 10 # 10秒後にカウントダウンを開始
timer = None 

# ハンドラ関数
def start():
    global count
    count = 10
    button_1['state'] = tk.DISABLED # 開始ボタンを無効化
    countdown()

# カウントダウン関数
def countdown():
    global count
    global timer
    label_1['text'] = str(count)
    count = count - 1
    timer = th.Timer(1, countdown) # Timer関数を実行
    timer.start() # スレッドの開始
    
    for thread in th.enumerate():
        print(thread)
    print('\n')

    if count < 0:
        timer.cancel() #スレッドの停止
        button_1['state'] = tk.NORMAL # 開始ボタンを有効化

# トップレベルウインドウの作成 
root = tk.Tk()
root.title('スレッド')
root.geometry('250x100')

# ラベルの作成
label_1 = tk.Label(root, text='10')
label_1.pack(expand=True)

# 開始ボタンの作成
button_1 = tk.Button(root, text='START', command=start)
button_1.pack(expand=True)

root.mainloop()

if timer != None: timer.cancel()