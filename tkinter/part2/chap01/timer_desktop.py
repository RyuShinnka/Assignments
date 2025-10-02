import tkinter as tk
import time

def start():
    countdown()

def countdown():
    count = 10

    while True:
        label_1['text'] = str(count)
        print(count)
        count = count - 1
        label_1.update()
        time.sleep(1)
        if count < 0:break

root = tk.Tk()
root.title("GUIが固まるアプリ")
root.geometry("300x100")

label_1 = tk.Label(root, text="10")
label_1.pack(expand=True)

button_1 = tk.Button(root, text="Start", command=start)
button_1.pack(expand=True)

root.mainloop()