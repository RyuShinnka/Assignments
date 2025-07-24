import tkinter as tk

def clicked(event):
    if "text" in event.widget.keys():
        event.widget['text'] = 'クリックしましたね'
    if isinstance(event.widget, tk.Tk):
        print('ウインドウをクリックしました')

root = tk.Tk()
root.title('イベントドリブン')
root.geometry('250x120')

root.bind_all("<ButtonRelease-1>", clicked)

label_1 = tk.Label(root, text='ここをクリック')
label_1.pack(expand=True)

button_1 = tk.Button(root, text='ここをクリック')
button_1.pack(expand=True)

root.mainloop()            