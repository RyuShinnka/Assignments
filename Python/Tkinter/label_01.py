import tkinter as tk

root = tk.Tk()

root.title('Label Test')
root.geometry('250x150')

label_1 = tk.Label(root, text='ラベルのテスト')

label_1.pack(expand=True)

root.mainloop()