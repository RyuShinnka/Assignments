# 復習問題2	
# 	ファイル名：hukusyu-Mon-02
# 	追加処理
# 	復習問題１に処理を追加して完成します。
# 	登録が可能となった、学籍番号・クラス・氏名を辞書データに追加していきます。
# 	辞書名はstudentとします。
# 	キーは学籍番号です。値はクラスと氏名
# 	3名の登録をしましょう。

# 追加処理
# リストを作成する
# 関数を作成する
# 学生名簿を作成



# 関数の処理

# 辞書をリストに変換する関数
def change_dict(student):
    for key, value in student.items():
        student[key] = value[0], value[1]


# クラスごとに学生名簿を表示する関数
def display_list(classname):
    print(classname, "クラスの学生名簿")
    for studentNo, name in student.items():
        if name[1] == classname:
            print(studentNo, name[0])



# メイン処理
student = {}
# 3名の登録
for i in range(3):
    print("登録情報", i+1, "つ目")
    name = input("氏名を入力してください-> ")
    classname = input("クラスを入力してください(A,B,C)-> ")
    if (classname not in ["A", "B", "C"]):
        print("入力エラー")
        classname = input("クラスを入力してください(A,B,C)-> ")
    studentNo = int(input("学籍番号を入力してください(1001-1100)-> "))
    if studentNo < 1001 or studentNo > 1100:
        print("入力エラー")
        studentNo = int(input("学籍番号を入力してください(1001-1100)-> "))
    
    student[studentNo] = name, classname
print("＊＊＊登録完了＊＊＊")   

# 辞書をリストに変換する関数を呼び出し
change_dict(student)

# クラスごとに学生名簿を表示する
display_list("A")
display_list("B")
display_list("C")

