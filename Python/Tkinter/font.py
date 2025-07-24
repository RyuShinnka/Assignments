import tkinter as tk
from tkinter import font

# 创建主窗口
root = tk.Tk()
# 设置窗口标题
root.title('Font Test')

# 设置窗口大小
root.geometry('250x250')

# 定义最大组件数量
WIDGET_MAX = 3

# 定义三种不同的字体样式
fonts = [
    font.Font(size=18),
    font.Font(family='System'),
    font.Font(family='ＭＳ　Ｐ明朝', weight='bold', size=20, slant='italic', underline=True, overstrike=True)
]

# 创建三个标签，每个标签使用不同的字体
labels = [
    tk.Label(root, text='フォントテスト\nABCD', font=fonts[num])
    for num in range(WIDGET_MAX)
]

# 配置窗口的列，使其可以自动调整大小
root.columnconfigure(0, weight=1)

# 配置窗口的行，使其可以自动调整大小，并将每个标签放置在对应的行中
for num in range(WIDGET_MAX):
    root.rowconfigure(num, weight=1)
    labels[num].grid(row=num, column=0)

# 进入主事件循环
root.mainloop()