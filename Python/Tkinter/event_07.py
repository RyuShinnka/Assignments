import tkinter as tk
from tkinter import messagebox

def clicked_1(event):
    print('clicked_1')
def clicked_2(event):
    print('clicked_2')
def clicked_3(event):
    print('clicked_3')

root = tk.Tk()
root.title('イベントドリブン')
root.geometry('250x120')

label_1 = tk.Label(root, text='ここをクリック')

label_1.bind('<ButtonPress-1>', clicked_1)
label_1.bind('<ButtonPress-1>', clicked_2, add='+')
label_1.bind('<ButtonPress-1>', clicked_3, add='+')
label_1.pack(expand=True)

root.mainloop()            