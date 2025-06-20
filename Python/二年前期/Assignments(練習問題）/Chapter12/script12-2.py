import re

f = open('Chapter12/students.txt', encoding='utf-8')

lst = []

print("students.txtの内容をリストに格納します")

# ファイルから1行ずつ読み込む
student = f.readline()
while student != "" :
    # 行の先頭が '#' で始まっていない場合のみリストに追加
    if re.search(r'^#', student) is None:
        lst.append(student)
    student = f.readline()

# 結果のリストを表示
print(lst)

# ファイルを閉じる
f.close()
