import tkinter as tk

def clicked(event):
    event.widget['text'] = 'クリックしましたね'

root = tk.Tk()
root.title('イベントドリブン')
root.geometry('250x120')

root.bind_class("Label", "<ButtonRelease-1>", clicked)
label_1 = tk.Label(root, text='ここをクリック')
label_1.pack(expand=True)

label_2 = tk.Label(root, text='ここをクリック')
label_2.pack(expand=True)

root.mainloop()            