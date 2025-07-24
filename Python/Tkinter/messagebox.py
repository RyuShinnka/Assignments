import tkinter as tk
from tkinter import messagebox
 
# 显示一个信息对话框，并打印返回值
r = messagebox.showinfo('showinfo', '情報')
print(r)
 
# 显示一个警告对话框，并打印返回值
r = messagebox.showwarning('showwarning', '警告')
print(r)
 
# 显示一个错误对话框，并打印返回值
r = messagebox.showerror('showerror', 'エラー')
print(r)
 
# 显示一个“はい/いいえ”对话框，并打印返回值
r = messagebox.askyesno('askyesno', 'はい、いいえ')
print(r)
 
# 显示一个“はい/いいえ”对话框，并打印返回值（以字符串形式返回）
r = messagebox.askquestion('askquestion', '質問')
print(r)
 
# 显示一个“OK/キャンセル”对话框，并打印返回值
r = messagebox.askokcancel('askokcancel', 'OK、キャンセル')
print(r)
 
# 显示一个“再試行/キャンセル”对话框，并打印返回値
r = messagebox.askretrycancel('askretrycancel', '再試行、キャンセル')
print(r)
 
# 显示一个“はい/いいえ/キャンセル”对话框，并打印返回値
r = messagebox.askyesnocancel('askyesnocancel', 'はい、いいえ、キャンセル')
print(r)