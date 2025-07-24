import tkinter as tk
from tkinter import messagebox

def clicked(event):
    messagebox.showinfo('メッセージ', 'こんにちは！')

root = tk.Tk()
root.title('イベントドリブン')
root.geometry('250x120')

button_1 = tk.Button(root, text='ボタン１')
button_1.bind('<ButtonRelease-1>', clicked)
button_1.pack(expand=True)

root.mainloop()            