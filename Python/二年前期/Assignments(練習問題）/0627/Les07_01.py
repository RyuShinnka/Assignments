from Itstudent import Itstudent        # Itstudentクラスをインポート
from offstudent import Offstudent      # Offstudentクラスをインポート
from superclass import StudentCard     # スーパークラスStudentCardをインポート

students = []  # 生徒オブジェクトを格納するリスト

# メニュー処理ループ
while True:
    print()
    print("＝＝＝＝次の処理番号を選択してください＝＝＝＝")
    print("処理番号が１・はIT学科の生徒の処理")
    print("処理番号が２・はオフィス学科の生徒の処理")
    print("処理番号が３・はプログラム終了")
    input_number = int(input("処理番号=>"))

    if input_number == 3:
        break  # プログラム終了
    elif input_number == 1:
        print()
        print("=========IT学科の生徒の処理START=========")
        gakka = "IT学科"
        number = int(input("学籍番号(4桁数字)を入力＝＞"))
        attendees = int(input("出席数を入力＝＞"))
        student = Itstudent(number, gakka, attendees)  # IT学科の生徒を生成
        student.get_rate()  # 出席率を計算
        students.append(student)  # リストに追加
    elif input_number == 2:
        print()
        print("=========オフィス学科の生徒の処理START=========")
        gakka = "オフィス学科"
        number = int(input("学籍番号(4桁数字)を入力＝＞"))
        na = input("国籍を入力＝＞")
        student = Offstudent(number, gakka, na)  # オフィス学科の生徒を生成
        student.input_score()  # 点数と評価を入力・計算
        students.append(student)  # リストに追加
    else:
        # 入力エラー時のメッセージ表示
        print()
        print("☆＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝☆")
        print("★　入力エラー、もう一度入力してください。★")
        print("☆＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝☆")
    
# 全生徒の情報を表示
print()
print("＝＝＝＝＝＝＝＝＝それぞれの学科の情報を入力したデータを表示＝＝＝＝＝＝＝＝＝")
for student in students:
    student.show_info()
