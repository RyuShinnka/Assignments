# tkinterライブラリをインポート
import tkinter as tk

# ウィンドウを作成
root = tk.Tk()

# ウィンドウのタイトルを設定
root.title('Windowの作成')

# ウィンドウのサイズを設定（幅395ピクセル、高さ165ピクセル）
root.geometry('395x165')


# 学校名のラベルを作成
label_1 = tk.Label(root, text='東京ビジネス・アカデミー', relief= tk.SOLID)

# 学科名のラベルを作成
label_2 = tk.Label(root, text='AIシステム学科', relief= tk.SOLID)

# 専攻名のラベルを作成
label_3 = tk.Label(root, text='AIエンジニア専攻', relief= tk.SOLID)

# 学籍番号のラベル（ダミー値あり）を作成
label_4 = tk.Label(root, text='学籍番号：xxxxxxxx', relief= tk.SOLID)

# 氏名のラベル（ダミー値あり）を作成
label_5 = tk.Label(root, text='氏名：xxxxxx', relief= tk.SOLID)

# ラベルをウィンドウ内に配置
label_1.place(x=0, y=19, width=395)     # 学校名（横一列）
label_2.place(x=0, y=58, width=198)     # 学科名（左側）
label_3.place(x=198, y=58, width=197)   # 専攻名（右側）
label_4.place(x=0, y=96, width=395)     # 学籍番号（横一列）
label_5.place(x=198, y=139, width=197)  # 氏名（右下）

# メインループ開始（画面表示）
root.mainloop()
