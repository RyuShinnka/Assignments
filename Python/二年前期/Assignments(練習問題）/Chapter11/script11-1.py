print("students.txtの内容を表示します")
print()
with open("students.txt", encoding="utf-8") as f:
    txt = f.read()
    print(txt)