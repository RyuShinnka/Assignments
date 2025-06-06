f = open("students.txt", encoding="utf-8")
lines = f.readlines()
lst = lines[3]
f.close()
slst = lst.split(',')
print("生徒名:", slst[0])
print("数学:", slst[1])
print("英語：", slst[2])
print("国語：", slst[3])