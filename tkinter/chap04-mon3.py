"""
課題：
relief　オプションの中の2つ実践は除く
フォント指定：サイズ色下線を付ける
配置大きさの指定
Entryウィジェットの設定し入力の文字表示（ボタンをクリック時）
ウィンドウの表示内容：
タイトル：課題３
ラベルに：名前を入力してください
Entryに各自の名前を入力
ボタンをクリックしてメッセージボックス表示
今日のお天気を入力
Entryに晴れまたは曇りを入れる
メッセージボックスに表示

"""

import tkinter as tk
from tkinter import messagebox
from tkinter import font

# ウィンドウの作成
root = tk.Tk()
root.geometry("1300x400")
root.title("課題３")

# カスタムフォントの設定
custom_font = font.Font(family="游ゴシック体", size=39, weight="bold", underline=1)

# 名前を入力するためのラベル
label_1 = tk.Label(root, text='名前を入力してください', font=custom_font, fg='green', relief='raised')
label_1.grid(column=0, row=0)

# 名前を入力するためのEntryウィジェット
entry_1 = tk.Entry(root, width=15, font=custom_font)
entry_1.grid(column=0, row=1)

# 名前を表示するためのボタン
def clicked_name():
    name = entry_1.get()
    messagebox.showinfo('名前', name)

button_1 = tk.Button(root, text='表示', command=clicked_name, font=custom_font, bg='lightgreen')
button_1.grid(column=0, row=2)

# 天気を入力するためのラベル
label_2 = tk.Label(root, text='今日のお天気を入力して', font=custom_font, fg='blue', relief='sunken')
label_2.grid(column=1, row=0)

# 天気を入力するためのEntryウィジェット
entry_2 = tk.Entry(root, width=15, font=custom_font)
entry_2.grid(column=1, row=1)

# 天気を表示するためのボタン
def clicked_weather():
    weather = entry_2.get()
    messagebox.showinfo('お天気', weather)

button_2 = tk.Button(root, text='表示', command=clicked_weather, font=custom_font, bg='lightblue')
button_2.grid(column=1, row=2)


root.columnconfigure(0, weight=1)
root.columnconfigure(1, weight=1)

root.rowconfigure(0, weight=1)
root.rowconfigure(1, weight=1)
root.rowconfigure(2, weight=1)
# ウィンドウの表示
root.mainloop()
