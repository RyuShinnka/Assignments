print("------7人の生徒のデータを入力してください------")
seiseki = []
for i in range(7):
    print()
    print("ーーーーーー第", (i+1), "人の生徒ーーーーーー")
    name = input("生徒の苗字を入力＝＞")
    name = name+":"
    gamoku = input("科目名を入力＝＞")
    while True:
        try:
            score = int(input("成績を入力＝＞"))
        except ValueError:
            print("成績は整数で入力してください。")
        else:
            break
    seiseki.append([name, gamoku, score])
print()    
print("------データの入力を終了------")
txt = ""
for name, gamoku, score in seiseki:
    txt += name+" " +gamoku+" "+ str(score)+ "\n"

f= open('seiseki.txt', 'w', encoding='utf-8')
f.write(txt)
f.close()

