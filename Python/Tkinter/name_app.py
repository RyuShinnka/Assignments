import tkinter as tk
from tkinter import messagebox

def clicked():
    # 显示输入框中的文本
    messagebox.showinfo('Name App', entry_1.get())

# 创建主窗口
root = tk.Tk()
root.geometry('200x120')
root.title('Name App')

# 创建标签、输入框和按钮
label_1 = tk.Label(root, text="名前を入力してください")
entry_1 = tk.Entry(root, width=20)
button_1 = tk.Button(root, text='表示', command=clicked)

# 设置窗口列的权重
root.columnconfigure(0, weight=1)

# 设置窗口行的权重
root.rowconfigure(0, weight=1)
root.rowconfigure(1, weight=1)
root.rowconfigure(2, weight=1)

# 将组件放置在网格中
label_1.grid(column=0, row=0, sticky='s')
entry_1.grid(column=0, row=1)
button_1.grid(column=0, row=2, sticky='n')

# 进入主事件循环
root.mainloop()