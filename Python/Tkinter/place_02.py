import tkinter as tk
root=tk.Tk()

root.title("place関数")
root.geometry('250x120')

label_l= tk.Label(root, text='x=100, y=50 ', relief=tk.SOLID)


# 親コンテナの幅の0.5（５０％）の位置に
label_l.place(relx=0.5, rely=0.5)

root.mainloop()
