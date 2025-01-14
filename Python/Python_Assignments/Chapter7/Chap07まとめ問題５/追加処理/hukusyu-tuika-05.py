# 復習問題5	
# 	ファイル名：hukusyu-Mon-05
# 	復習問題2の登録処理にクラスや氏名の変更が出来るようにします。
# 	学籍番号の変更はできません！
# 	関数名・引数・戻り値は任意

# ファイル名：hukusyu-tuika-05
# 追加処理
# 学籍番号をキーとして、３教科の点数をリストデータで作成する
# 関数を作成する
# ３教科の点数は0から１００とする


# ------------------------------------関数処理
# 学生情報を変更する関数
def update_student_info(student):
    studentNo = int(input("変更したい学生の学籍番号を入力-> "))
    
    print("変更内容を入力->")
    # 新しいクラス名を入力
    classname = input("新しいクラスを入力(A, B, C)-> ")
    
    # 無効なクラス名の入力チェック
    while classname in ["A", "B", "C"] == False:
        print("クラス名が無効です。A, B, C のいずれかを入力してください。")
        classname = input("新しいクラスを入力(A, B, C)-> ")

    # 新しい氏名を入力
    name = input("新しい氏名を入力-> ")

    # 情報を更新
    student[studentNo] = [classname, name]
    print("情報が更新されました。")

# 登録された学生情報を表示する関数
def display_students(student):
    print("登録内容:")
    for key, value in student.items():
        print("学籍番号: ", key, ", クラス: ", value[0], ", 氏名: ", value[1])

# 学籍番号をキーとして、3教科の点数をリストデータで作成する関数
def create_score_list(student):
    score_list = {}  # 学籍番号と点数リストを格納する辞書
    for key, value in student.items():
        print("学生名:", value[1], "(学籍番号:", key, ")")
        score = []  # 各学生の点数リスト
        for i in range(3):
            score_input = int(input(str(i + 1) + "教科の点数を入力(0-100)-> "))
            score.append(score_input)
        score_list[key] = score  # 学籍番号をキーに点数リストを登録
    return score_list


# ------------------------メイン処理
student = {}
# 3名の学生情報を登録
for i in range(3):
    print("登録情報", i + 1, "つ目")

    classname = input("クラスを入力(A,B,C)-> ")
    # クラス名と学籍番号の入力チェック
    while classname not in ["A", "B", "C"]:
        print("入力エラー")
        classname = input("クラスを入力(A,B,C)-> ")
    studentNo = int(input("学籍番号を入力(1001-1100)-> "))
    while studentNo < 1001 or studentNo > 1100:
        print("入力エラー")
        studentNo = int(input("学籍番号を入力(1001-1100)-> "))

    name = input("氏名を入力-> ")
    
    # 学生情報を登録
    student[studentNo] = [classname, name]

# 登録内容を表示
display_students(student)

# 学生情報の変更
update_choice = input("情報を変更しますか？ (y/n): ")
if update_choice == 'y':
    update_student_info(student)
    # 変更後の登録内容を表示
    display_students(student)

# 学籍番号をキーとして、３教科の点数をリストデータで作成する関数を呼び出す
score_list = create_score_list(student)

# 点数リストを表示
print("点数リスト")
for key, value in score_list.items():
    print("学籍番号:", key, ", 点数:", value)
