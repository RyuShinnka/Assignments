# 復習問題5	
# 	ファイル名：hukusyu-Mon-05
# 	復習問題2の登録処理にクラスや氏名の変更が出来るようにします。
# 	学籍番号の変更はできません！
# 	関数名・引数・戻り値は任意


# ------------------------------------関数処理
# 学生情報を変更する関数
def update_student_info(student):
    # 学籍番号を入力
    studentNo = int(input("変更したい学生の学籍番号を入力してください: "))
    
    # 学籍番号が存在しない場合のチェック
    if studentNo not in student:
        print("その学籍番号は登録されていません。")
        return

    # 新しいクラス名の入力
    print("変更内容を入力してください。")
    classname = input("新しいクラスを入力してください(A, B, C)-> ")
    while classname not in ["A", "B", "C"]:
        print("クラス名が無効です。A, B, C のいずれかを入力してください。")
        classname = input("新しいクラスを入力してください(A, B, C)-> ")

    # 新しい氏名の入力
    name = input("新しい氏名を入力してください-> ")

    # 情報を更新
    student[studentNo] = [classname, name]
    print("情報が更新されました。")

# 学生情報を表示する関数
def display_students(student):
    print("登録内容:")
    for key, value in student.items():
        print("学籍番号: ", key, ", クラス: ", value[0], ", 氏名: ", value[1])

# ------------------------メイン処理
student = {}
# 3名の学生情報を登録
for i in range(3):
    print("登録情報", i + 1, "つ目")
    classname = input("クラスを入力してください(A,B,C)-> ")
    studentNo = int(input("学籍番号を入力してください(1001-1100)-> "))
    name = input("氏名を入力してください-> ")
    
    # クラス名と学籍番号の入力チェック
    while classname not in ["A", "B", "C"]:
        print("入力エラー")
        classname = input("クラスを入力してください(A,B,C)-> ")
    while studentNo < 1001 or studentNo > 1100:
        print("入力エラー")
        studentNo = int(input("学籍番号を入力してください(1001-1100)-> "))
    
    # 学生情報を登録
    student[studentNo] = [classname, name]

# 登録内容を表示
print("登録内容")
display_students(student)

# 学生情報の変更
update_choice = input("情報を変更しますか？ (y/n): ")
if update_choice == 'y':
    update_student_info(student)
    # 変更後の登録内容を表示
    display_students(student)
