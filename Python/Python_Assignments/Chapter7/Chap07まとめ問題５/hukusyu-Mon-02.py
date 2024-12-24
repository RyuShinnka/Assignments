# 復習問題2	
# 	ファイル名：hukusyu-Mon-02
# 	追加処理
# 	復習問題１に処理を追加して完成します。
# 	登録が可能となった、学籍番号・クラス・氏名を辞書データに追加していきます。
# 	辞書名はstudentとします。
# 	キーは学籍番号です。値はクラスと氏名
# 	3名の登録をしましょう。


# メイン処理
student = {}
# 3名の登録
for i in range(3):
    print("登録情報", i+1, "つ目")
    classname = input("クラスを入力してください(A,B,C)-> ")
    studentNo = int(input("学籍番号を入力してください(1001-1100)-> "))
    name = input("氏名を入力してください-> ")
    if (classname in ["A", "B", "C"] == False):
        print("入力エラー")
        classname = input("クラスを入力してください(A,B,C)-> ")
    if studentNo < 1001 or studentNo > 1100:
        print("入力エラー")
        studentNo = int(input("学籍番号を入力してください(1001-1100)-> "))
    student[studentNo] = [classname, name]

# 登録内容の表示
print("登録内容")
for key, value in student.items():
    print(key, value)