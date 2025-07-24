import tkinter as tk
from tkinter import messagebox

class Application(tk.Tk):

    def __init__(self):
        super().__init__()

        self.geometry("250x120")
        self.title("Name App")

        self.label_1 = tk.Label(self, text='名前を入力してください')

        self.entry_1 = tk.Entry(self, width=20)

        self.button_1 = tk.Button(self, text='表示', command=self.clicked)

        self.columnconfigure(0, weight=1)

        self.rowconfigure(0, weight=1)
        self.rowconfigure(1, weight=1)
        self.rowconfigure(2, weight=1)

        self.label_1.grid(column=0, row=0, sticky='s')
        self.entry_1.grid(column=0, row=1)
        self.button_1.grid(column=0, row=2, sticky='n')

    def clicked(self):
        messagebox.showinfo('Name app', self.entry_1.get())

app = Application()
app.mainloop()
