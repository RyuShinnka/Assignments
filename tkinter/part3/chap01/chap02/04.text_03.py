import tkinter as tk

# ハンドラ関数
def click_delete1():
    # すべて削除
    text.delete('1.0', 'end')

def click_delete2():
    # 3行目を削除
    text.delete('3.0', '3.end')

# トップレベルウインドウの生成
root = tk.Tk()
root.geometry("250x200")
root.title("Text Test")

# Textウィジェットの生成
text = tk.Text(root, width=30, height=7)
text.pack(expand=True)

# ボタンの生成
btn1 = tk.Button(root, text="削除1", command=click_delete1)
btn1.pack(expand=True)

btn2 = tk.Button(root, text="削除2", command=click_delete2)
btn2.pack(expand=True)

root.mainloop()