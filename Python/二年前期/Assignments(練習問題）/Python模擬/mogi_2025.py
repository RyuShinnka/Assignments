from func.super_file import Student
from func.sub_file import Sub_student
# student_tbl	インスタンス生成先のアドレスを代入するリスト定義				
student_tbl = []

# # gak_no	学科番号をキーとする辞書を定義する				
gak_no = {1: "IT", 2: "AI", 3: "経営", 4: "オフィス", 5: "スポーツ"}

while True:
    try:
        gak_num = int(input("\n学科番号を入力 （1～5、終了は0）->"))
        if gak_num == 0:
            break
        if gak_num not in gak_no:
            print("☆★学科番号が不正です。もう一度入力してください。★☆")
            print()
            continue
        enrollment = int(input(gak_no[gak_num] + "の入学者数を入力->"))
        offer_count = int(input(gak_no[gak_num] + "の内定者数を入力->"))

        sub_student = Sub_student(gak_no[gak_num], enrollment, offer_count)
        student_tbl.append(sub_student)

    except ValueError:
        print("★☆数字を正しく入力してください。☆★")
        print()

# 合計人数計算（student_tblから）
Sub_student.sum_ninzu(student_tbl)

# 割合計算
for student in student_tbl:
    student.naitwari_fun()
    student.gakwari_fun()

# 結果表示
print("\n--- 結果 ---")
for student in student_tbl:
    student.print_method()
    print()