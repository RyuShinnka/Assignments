# 復習問題1	
# 	ファイル名：hukusyu-Mon-01
	
# 	クラスはA・B・Cの3クラスです。
# 	学籍番号は1001から1100までの間の数値です。
# 	登録をする為にクラスと学籍番号と氏名を入力します。
# 	入力に間違いがないかクラスと学籍番号のチェックをして、
# 	間違いの時は「入力エラー」表示して再度入力出来るようにする
# 	両方ともOKの時は、学籍番号・クラス・氏名を表示しなさい。
# 	表示する関数を作成して、必要な値を引き渡しましょう



# 関数の処理
def showInfo(classname, studentNo, name):
    print("クラス:", classname)
    print("学籍番号:", studentNo)
    print("氏名:", name)

# メイン処理
while True:
    classname = input("クラスを入力してください(A,B,C)-> ")
    studentNo = int(input("学籍番号を入力してください(1001-1100)-> "))
    name = input("氏名を入力してください-> ")

    if (classname in ["A", "B", "C"] == False):
        print("入力エラー")
        classname = input("クラスを入力してください(A,B,C)-> ")
    elif studentNo < 1001 or studentNo > 1100:
        print("入力エラー")
        studentNo = int(input("学籍番号を入力してください(1001-1100)-> "))
    else:
        break
# ここまでの処理でエラーがなければ、showInfo関数に値を渡す
showInfo(classname, studentNo, name)

