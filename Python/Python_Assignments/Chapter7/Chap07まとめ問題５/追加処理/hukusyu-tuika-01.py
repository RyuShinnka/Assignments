# 復習問題1	
# 	ファイル名：hukusyu-Mon-01
	
# 	クラスはA・B・Cの3クラスです。
# 	学籍番号は1001から1100までの間の数値です。
# 	登録をする為にクラスと学籍番号と氏名を入力します。
# 	入力に間違いがないかクラスと学籍番号のチェックをして、
# 	間違いの時は「入力エラー」表示して再度入力出来るようにする
# 	両方ともOKの時は、学籍番号・クラス・氏名を表示しなさい。
# 	表示する関数を作成して、必要な値を引き渡しましょう


# 	ファイル名：hukusyu-tuika-01
# 追加処理
# 登録する辞書データを作成する
# 学籍番号をキーとして、名前を登録
# 関数を作成して表示
# ５名の登録をしましょう

# 関数の処理
# 辞書を表示する関数を作成
def showStudents():
    for key, value in students.items():
        print(key, value)


students = {}
# 登録する辞書データを作成する
def registerStudent(classname, studentNo, name):
    students[studentNo] = name, classname
    print("登録完了")

# メイン処理
for i in range(5):
    while True:
        name = input("氏名を入力してください-> ")
        classname = input("クラスを入力してください(A,B,C)-> ")
        if (classname not in ["A", "B", "C"]):
            print("入力エラー")
            classname = input("クラスを入力してください(A,B,C)-> ")
        studentNo = int(input("学籍番号を入力してください(1001-1100)-> "))
        if studentNo < 1001 or studentNo > 1100:
            print("入力エラー")
            studentNo = int(input("学籍番号を入力してください(1001-1100)-> "))
        if (classname in ["A", "B", "C"] and studentNo >= 1001 and studentNo <= 1100):
            break
    registerStudent(classname, studentNo, name)

# 辞書を表示する
showStudents()
