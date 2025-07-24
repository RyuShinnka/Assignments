import tkinter as tk
root = tk.Tk()

root.title('grid関数')

root.geometry('400x200')

WIDGET_MAX = 8

labels =[tk.Label(root, text= 'NO_'+ str(num), relief= tk.SOLID)
          for num in range(WIDGET_MAX)
]
"""
labels = []
for num in range(8):
    label = tk.Label(root, text='NO_' + str(num), relief=tk.SOLID)
    labels.append(label)
"""


labels[0].grid(column=0,row=0)
labels[1].grid(column=1,row=0)
labels[2].grid(column=2,row=0)
labels[3].grid(column=3,row=0)
labels[4].grid(column=0,row=1)
labels[5].grid(column=1,row=1)
labels[6].grid(column=2,row=1)
labels[7].grid(column=3,row=1)

root.mainloop()