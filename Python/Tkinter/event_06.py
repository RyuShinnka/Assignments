import tkinter as tk
from tkinter import messagebox

def clicked(event, s):
    messagebox.showinfo('メッセージ', s)
    print(event.x, event.y)

root = tk.Tk()
root.title('イベントドリブン')
root.geometry('250x120')

button_1 = tk.Button(root, text='ボタン１')
button_1.bind('<ButtonRelease-1>', lambda event:clicked(event, 'こんにちは！'))
button_1.pack(expand=True)

button_2 = tk.Button(root, text='ボタン2')
button_2.bind('<ButtonRelease-1>', lambda event:clicked(event, 'ありがとう！'))
button_2.pack(expand=True)

root.mainloop()            