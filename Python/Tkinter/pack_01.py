import tkinter as tk

root = tk.Tk()

root.title('pack関数')

root.geometry('390x120')

# labelウイジェットの生成
label_l = tk.Label(root,text='画面の中央')

# labelウイジェットをウインドウの中央に配置
label_l.pack(expand = True)

root.mainloop()


