import tkinter as tk

# 创建主窗口
root = tk.Tk()
# 设置窗口标题
root.title('Label Test')
# 设置窗口大小
root.geometry('250x150')

# 定义最大部件数
WIDGET_MAX = 3

# 创建标签列表
labels = [
    # 创建第一个标签，设置文本、边框样式、宽度和高度
    tk.Label(root, text='テキスト1行目\n2行目',
             relief='solid'),  # 边框样式为实线
    # 创建第二个标签
    tk.Label(root, text='テキスト1行目\n2行目',
             relief='solid',  # 边框样式为实线
             justify='left'),  # 设置标签的位置为左对齐
    # 创建第三个标签
    tk.Label(root, text='テキスト1行目\n2行目',
             relief='solid',  # 辺框样式为实线
             justify='right')  # 设置标签的锚定位置为右对齐
]

# 配置列以适应窗口大小
root.columnconfigure(0, weight=1)

# 循环配置每一行以适应窗口大小，并将标签放置在对应的网格位置
for num in range(WIDGET_MAX):
    root.rowconfigure(num, weight=1)  # 配置每行以适应窗口大小
    labels[num].grid(row=num, column=0)  # 将标签放置在对应的网格位置

# 进入Tkinter事件循环
root.mainloop()