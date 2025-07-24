# tkinterライブラリをインポート
import tkinter as tk

# ラベルがクリックされたときに呼び出される関数
def clicked(event, s):
    if s == '学校名':
        event.widget['text'] = '東京ビジネス・アカデミー'
    if s == '学科名':
        event.widget['text'] = 'AIシステム学科'
    if s == '専攻':
        event.widget['text'] = 'AIエンジニア専攻'
    if s == '学籍番号':
        event.widget['text'] = '学籍番号：2416xxxx'
    if s == '生徒名':
        event.widget['text'] = '生徒名：リxx　xxx'

# ウィンドウを作成
root = tk.Tk()

# ウィンドウのタイトルを設定
root.title('Windowの作成')

# ウィンドウのサイズを設定
root.geometry('395x165')


# ラベルを作成し、それぞれクリックイベントをバインド
label_1 = tk.Label(root, text='学校名', relief= tk.SOLID)
label_1.bind('<ButtonRelease-1>', lambda event:clicked(event, '学校名'))

label_2 = tk.Label(root, text='学科名', relief= tk.SOLID)
label_2.bind('<ButtonRelease-1>', lambda event:clicked(event, '学科名'))

label_3 = tk.Label(root, text='専攻', relief= tk.SOLID)
label_3.bind('<ButtonRelease-1>', lambda event:clicked(event, '専攻'))

label_4 = tk.Label(root, text='学籍番号', relief= tk.SOLID)
label_4.bind('<ButtonRelease-1>', lambda event:clicked(event, '学籍番号'))

label_5 = tk.Label(root, text='生徒名', relief= tk.SOLID)
label_5.bind('<ButtonRelease-1>', lambda event:clicked(event, '生徒名'))

# ラベルの配置（座標と幅を指定）
label_1.place(x=0, y=19, width=395)
label_2.place(x=0, y=58, width=198)
label_3.place(x=198, y=58, width=197)
label_4.place(x=0, y=96, width=395)
label_5.place(x=198, y=139, width=197)

# ウィンドウを表示し、イベントループを開始
root.mainloop()
