txt = '''
柴田,100,40,65
古川,83,81,74'''
f = open("students3.txt", "a", encoding="utf-8")
f.write(txt)
f.close()

print("追加されたstudent3.txtのテキストデータを読み込み表示しましょう")
f = open("students3.txt", encoding="utf-8")
lines = f.readlines()
print(lines)
f.close()
