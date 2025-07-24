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


for num in range(WIDGET_MAX):
    labels[num].grid()
root.mainloop()