"""
bg またはbackground ====== 背景色を指定
bd　またはborderwidth=====   枠線の太さを指定
cursor ===== マウスホバー時のカーソルの形状を指定
fg またはforeground ====== 文字色を指定
font ===== 文字のフォントを指定
justify ===== テキストの入力位置を指定
relief ===== 枠線の種類を指定
show ===== 入力文字の代わりに表示する文字を指定
state ===== 入力欄の状態を指定（有効/無効の状態を指定）
width ===== 幅の文字単位を指定
textvariable ===== 値を取得、設定するためのウィジェット変数を指定
"""

import tkinter as tk

# 创建主窗口实例
root = tk.Tk()
# 设置窗口大小为 250x100 像素
root.geometry("250x100")
# 设置窗口标题为 'Entry Test'
root.title('Entry Test')

# 创建一个 Entry 小部件，用于输入，宽度为 20 字符，输入内容以 '*' 显示
entry_1 = tk.Entry(root, width=20, show='*')
# 将 Entry 小部件添加到窗口中，并允许其扩展以填充可用空间
entry_1.pack(expand=True)

# 进入 Tkinter 事件循环，等待用户操作
root.mainloop()

"""
get() 入力されたテキストを取得する

Insert(index, string) テキストを挿入する
index：挿入する文字の位置
    indexには次の値を指定できる
        tkinter.INSERT:挿入カーソルのある位置
        tkinter.CURRENT:マウスポインターに一番近い位置
        tkinter.END:最後の文字の次の位置
        tkinter.SEL_FIRST:選択範囲の最初の位置
        tkinter.SEL_LAST:選択範囲の最後の位置
    string：挿入したい文字列

delete(first, last) 入力されたテキストを削除する
    first：削除する文字の開始位置
    last：削除する文字の終了位置

"""