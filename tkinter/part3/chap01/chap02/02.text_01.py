import tkinter as tk

# ハンドラ関数
def click_insert1():
    text.insert('end', 'ABCDEFG\n')

def click_insert2():
    text.insert('2.0', 'あいうえお')

def click_insert3():
    text.insert('3.2', '■ ■ ■')

# トップレベルウィンドウの生成
root = tk.Tk()
root.geometry('250x220')
root.title('Text Test')

# Textウィジェットの生成
text = tk.Text(root, width=30, height=7)
text.pack(expand=True)

# Buttonウィジェットの生成
btn1 = tk.Button(root, text='挿入1', command=click_insert1)
btn1.pack(expand=True)

btn2 = tk.Button(root, text='挿入2', command=click_insert2)
btn2.pack(expand=True)

btn3 = tk.Button(root, text='挿入3', command=click_insert3)
btn3.pack(expand=True)

root.mainloop()