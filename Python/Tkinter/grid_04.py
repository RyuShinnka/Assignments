import tkinter as tk
root = tk.Tk()

root.title('grid関数')

root.geometry('400x200')

WIDGET_MAX = 4

labels =[tk.Label(root, text= 'NO_'+ str(num), relief= tk.SOLID)
          for num in range(WIDGET_MAX)
]

root.rowconfigure(0, weight=1)
root.rowconfigure(1, weight=1)

root.columnconfigure(0, weight=1)
root.columnconfigure(1, weight=1)
root.columnconfigure(2, weight=1)
root.columnconfigure(3, weight=1)

labels[0].grid(column=0,row=0, rowspan=2)
labels[1].grid(column=1,row=0, columnspan=2)
labels[2].grid(column=3,row=0)
labels[3].grid(column=1,row=1, columnspan=3)
# labels[4].grid(column=0,row=1)
# labels[5].grid(column=1,row=1)
# labels[6].grid(column=2,row=1)
# labels[7].grid(column=3,row=1)

root.mainloop()