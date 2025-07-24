import tkinter as tk  # tkinterライブラリをインポート

root = tk.Tk()  # メインウィンドウオブジェクトを作成する

root.title('Label Test')  # メインウィンドウのタイトルを「Label Test」に設定する
root.geometry('400x50')  # メインウィンドウのサイズを400ピクセル幅、50ピクセル高に設定する

WIDGET_MAX = 6  # 作成するLabelウィンドウの最大数量を定義する

# Labelウィンドウのボーダースタイルリストを定義する
border_name = ('flat', 'solid', 'groove', 'raised', 'ridge', 'sunken')

# リスト内包表記を使用して複数のLabelウィンドウを作成し、それぞれのLabelのテキストとボーダースタイルをborder_nameリストの値に基づいて設定する
labels = [tk.Label(root, text=border_name[num], relief=border_name[num]) for num in range(WIDGET_MAX)]

root.rowconfigure(0, weight=1)  # メインウィンドウの0行目を構成し、ウィンドウサイズの変化に応じて拡張できるようにする

# ループを使用して列を構成し、各Labelウィンドウの位置を設定する
for num in range(WIDGET_MAX):
    root.columnconfigure(num, weight=1)  # num列目を構成し、ウィンドウサイズの変化に応じて拡張できるようにする
    labels[num].grid(column=num, row=0)  # num番目のLabelウィンドウをnum列目と0行目に配置する

root.mainloop()  # Tkinterイベントループに入り、ウィンドウを表示したままにする
