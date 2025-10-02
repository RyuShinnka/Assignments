import tkinter as tk

root= tk.Tk()
root.title('Scale Test')
root.geometry('250x100')

# ウィジェット変数の生成
var_1 = tk.IntVar()

# Labelウィジェットの生成
label_1 = tk.Label(root, textvariable=var_1)
label_1.pack(expand=True)

# Scaleウィジェットの生成
scale_1 = tk.Scale(
    root
    ,variable=var_1 # 変数の設定
    ,resolution=5 #分野能を5に
    ,orient=tk.HORIZONTAL # 水平方向
    ,from_=0 # 左端 
    ,to=100) # 右端
scale_1.pack(expand=True)

# 初期値を50にする
var_1.set(50)

root.mainloop()