import tkinter as tk

def close_button():
    print('プログラムを終了します')
    root.destroy()

root = tk.Tk()
root.title('閉じるボタン')
root.geometry('250x120')

root.protocol('WM_DELETE_WINDOW', close_button)

root.mainloop()