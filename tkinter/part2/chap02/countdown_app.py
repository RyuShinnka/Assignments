import tkinter as tk
from tkinter import ttk
import threading as th
from tkinter import messagebox

# グローバル変数
count = 0
timer = None

# ハンドラ関数


def start():
    global timer
    global count
    button_1['state'] = tk.DISABLED
    button_2['state'] = tk.NORMAL
    m = var_minutes.get()
    s = var_seconds.get()
    count = m * 60 + s
    progressbar_1['maximum'] = count
    # Timer関数の実行
    timer = th.Timer(1, countdown)
    timer.start()


def stop():
    timer.cancel()
    button_1['state'] = tk.NORMAL
    button_2['state'] = tk.DISABLED


def countdown():
    global count
    global timer
    count = count - 1
    if count > 0:
        progressbar_1['value'] = count
        m, s = divmod(count, 60)
        var_minutes.set(m)
        var_seconds.set(s)

       # Timer関数の実行
        timer = th.Timer(1, countdown)
        timer.start()
    else:
        progressbar_1['value'] = count
        var_minutes.set(0)
        var_seconds.set(0)
        messagebox.showinfo('Timer App', 'お時間です！')
        button_1['state'] = tk.NORMAL
        button_2['state'] = tk.DISABLED
        timer.cancel()


# トップレベルウィンドウの生成
root = tk.Tk()
root.title('Timer App')
root.geometry('250x100')

# Labelウィジェットの生成
label1 = tk.Label(
    root,
    text='分：'
)

label2 = tk.Label(
    root,
    text='秒：'
)

# 分秒のウィジェット変数
var_minutes = tk.IntVar(value=0)
var_seconds = tk.IntVar(value=0)

# Spinboxウィジェットの生成
spinbox1 = tk.Spinbox(
    root,
    width=2,
    from_=0,
    to=59,
    increment=1,
    textvariable=var_minutes
)

spinbox2 = tk.Spinbox(
    root,
    width=2,
    from_=0,
    to=59,
    increment=1,
    textvariable=var_seconds)

scale_1 = tk.Scale(
    root,
    variable=var_minutes,
    orient=tk.HORIZONTAL,
    from_=0,
    to=59,
    showvalue=0
)

scale_2 = tk.Scale(
    root,
    variable=var_seconds,
    orient=tk.HORIZONTAL,
    from_=0,
    to=59,
    showvalue=0
)

# Progressbarウィジェットの生成
progressbar_1 = ttk.Progressbar(
    root,
    variable=0,
    maximum=0
)

# Buttonウィジェットの生成
button_1 = tk.Button(
    root,
    text='START',
    state=tk.NORMAL,
    command=start
)

button_2 = tk.Button(
    root,
    text='STOP',
    state=tk.DISABLED,
    command=stop
)


# 各列の割合を指定
for i in range(4):
    root.columnconfigure(i, weight=1)

# 各行の割合を指定
for i in range(3):
    root.rowconfigure(i, weight=1)

# ウィジェットをgrid関数で配置
spinbox1.grid(column=0, row=0, sticky='e')
label1.grid(column=1, row=0, sticky='w')
spinbox2.grid(column=2, row=0, sticky='e')
label2.grid(column=3, row=0, sticky='w')

scale_1.grid(column=0, row=1, columnspan=2, sticky='n')
scale_2.grid(column=2, row=1, columnspan=2, sticky='n')
progressbar_1.grid(column=0, row=2, columnspan=2, sticky='n')
button_1.grid(column=2, row=2, sticky='n')
button_2.grid(column=3, row=2, sticky='n')

root.mainloop()

if timer != None:timer.cancel()
