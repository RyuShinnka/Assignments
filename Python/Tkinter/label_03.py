import tkinter as tk
 
# 创建主窗口实例
root = tk.Tk()
# 设置窗口标题
root.title('Label Test')
# 设置窗口大小
root.geometry('250x100')
 
# 定义最大部件数
WIDGET_MAX = 3
 
# 定义颜色名称元组
color_name = ('red', 'green', 'blue')
 
# 定义 RGB 颜色值元组
rgb_value = ('#ff0000', '#00ff00', '#0000ff')
 
# 创建一组标签，背景颜色为对应的颜色名称
labels_1 = [
    tk.Label(root, text=color_name[num],
             bg= color_name[num])
             for num in range(WIDGET_MAX)
]
 
# 创建另一组标签，前景颜色为对应的 RGB 值
labels_2 = [
    tk.Label(root, text=rgb_value[num],
             fg = rgb_value[num])
             for num in range(WIDGET_MAX)
]
 
# 设置第一行的权重为1
root.rowconfigure(0, weight=1)
# 设置第二行的权重为1
root.rowconfigure(1, weight=1)
 
# 配置每一列的权重为1，并将第一组标签放置在第一行
for num in range(WIDGET_MAX):
    root.columnconfigure(num, weight=1)
    labels_1[num].grid(row=0, column=num)
 
# 配置每一列的权重为1，并将第二组标签放置在第二行
for num in range(WIDGET_MAX):
    root.columnconfigure(num, weight=1)
    labels_2[num].grid(row=1, column=num)
 
# 进入 Tkinter 事件循环
root.mainloop()