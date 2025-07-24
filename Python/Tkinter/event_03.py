import tkinter as tk
from tkinter import messagebox

def clicked(s):
    messagebox.showinfo('メッセージ', s)

root = tk.Tk()
root.title('イベントドリブン')
root.geometry('250x120')

button_1 = tk.Button(root, text='ボタン１', command= lambda:clicked('こんにちは！'))
button_1.pack(expand=True)

button_2 = tk.Button(root, text='ボタン2', command= lambda:clicked('ありがとう！'))
button_2.pack(expand=True)

root.mainloop()