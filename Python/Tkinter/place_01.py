import tkinter as tk
root=tk.Tk()

root.title("place関数")
root.geometry('250x120')

label_l= tk.Label(root, text='x=100, y=50 ', relief=tk.SOLID)

label_l.place(x=100, y=50)
root.mainloop()
