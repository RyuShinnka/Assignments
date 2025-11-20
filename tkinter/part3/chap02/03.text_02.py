import tkinter as tk

# ハンドラ関数
def click_get1():
    # 全文字列を取得
    print(text.get("1.0", "end"))

def click_get2():
    # 全文字列を取得（末尾の改行なし）
    print(text.get("1.0", "end-1c"))

def click_get3():
    # 2行目と3行目の文字列を取得
    print(text.get("2.0", "3.end"))

# トップレベルウインドウの生成
root = tk.Tk()
root.geometry("250x220")
root.title("Text Test")

# Textウィジェットの生成
text = tk.Text(root, width=30, height=7)
text.pack(expand=True)

btn1 = tk.Button(root, text="取得1", command=click_get1)
btn1.pack(expand=True)

btn2 = tk.Button(root, text="取得2", command=click_get2)
btn2.pack(expand=True)

btn3 = tk.Button(root, text="取得3", command=click_get3)
btn3.pack(expand=True)

root.mainloop()