import tkinter as tk

root = tk.Tk()

root.title('pack関数')

root.geometry('390x390')

# Labelウイジェットに枠を付け、幅を８文字分にする
label_top = tk.Label(root, text='TOP', relief=tk.SOLID, width= 19)
label_bottom = tk.Label(root, text='BOTTOM', relief=tk.SOLID, width= 19)
label_left = tk.Label(root, text='LEFT', relief=tk.SOLID, width= 19)
label_right = tk.Label(root, text='RIGHT', relief=tk.SOLID, width= 19)

# packの引数sideの使い
label_left.pack(side=tk.LEFT)
label_top.pack(side=tk.TOP)
label_right.pack(side=tk.RIGHT)
label_bottom.pack(side=tk.BOTTOM)




root.mainloop()
