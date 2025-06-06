name = input("生徒名を入力してください->")
math = input("数学の点数を入力してください->")
eng = input("英語の点数を入力してください->")
jp = input("国語の点数を入力してください->")

f = open("students.txt", "a", encoding="utf-8")
txt = "\n"+name+","+math+","+eng+","+jp
f.write(txt)
f.close

print()
print("students.txtの内容")
print()
with open("students.txt", encoding="utf-8") as f:
    txt = f.read()
    print(txt)