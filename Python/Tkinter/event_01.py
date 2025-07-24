import tkinter as tk
from tkinter import messagebox

def clicked_1():
    messagebox.showinfo('メッセージ', 'こんにちは！')
def clicked_2():
    messagebox.showinfo('メッセージ', 'ありがとう！')

root = tk.Tk()
root.title('イベントドリブン')
root.geometry('250x120')

button_1 = tk.Button(root, text='ボタン１', command= clicked_1)
button_1.pack(expand=True)

button_2 = tk.Button(root, text='ボタン2', command= clicked_2)
button_2.pack(expand=True)

root.mainloop()