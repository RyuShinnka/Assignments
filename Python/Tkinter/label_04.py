import tkinter as tk

# 创建主窗口
root = tk.Tk()
# 设置窗口标题
root.title('Label Test')
# 设置窗口大小
root.geometry('400x250')

# 定义最大部件数
WIDGET_MAX = 3

# 创建标签列表
labels = [
    # 创建第一个标签，设置文本、边框样式、宽度和高度
    tk.Label(root, text='width=25, height=2',
             relief='solid',  # 边框样式为实线
             width=25, height=2),  # 设置标签的宽度和高度
    # 创建第二个标签，设置文本、边框样式、锚定位置、宽度和高度
    tk.Label(root, text='anchor=\'s\'',
             relief='solid',  # 边框样式为实线
             anchor='s',  # 文本锚定在标签顶部
             width=25, height=4),  # 设置标签的宽度和高度
    # 创建第三个标签，设置文本、边框样式、水平和垂直填充、宽度和高度
    tk.Label(root, text='padx=99, pady=20',
             relief='solid',  # 边框样式为实线
             padx=99, pady=20)  # 设置标签的水平和垂直填充
]

# 配置列以适应窗口大小
root.columnconfigure(0, weight=1)

# 循环配置每一行以适应窗口大小，并将标签放置在对应的网格位置
for num in range(WIDGET_MAX):
    root.rowconfigure(num, weight=1)  # 配置每行以适应窗口大小
    labels[num].grid(row=num, column=0)  # 将标签放置在对应的网格位置

# 进入Tkinter事件循环
root.mainloop()
