import tkinter as tk
from tkinter import messagebox

def clicked(event):
    print(event.x, event.y)

root = tk.Tk()
root.title('イベントドリブン')
root.geometry('250x120')

root.bind('<ButtonPress>', clicked)

root.mainloop()            