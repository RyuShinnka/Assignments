# 復習問題3	
# 	ファイル名：hukusyu-Mon-03
	
# 	問題1のエラー処理を関数で行えるようにします。
# 	引数と戻り値は任意とする
# 	コメントを入れてほかの人が見ても分かりやすくしましょう。


"""
関数処理
"""
# クラス名が"A", "B", "C" のいずれかであるかを確認する関数
def checkClassname(classname):
    # classname が "A", "B", "C" 以外の場合
    if classname not in ["A", "B", "C"]:
        print("入力エラー")  # エラーメッセージを表示
        # 正しいクラス名を入力させる
        classname = input("クラスを入力してください(A,B,C)-> ")
    return classname  # 入力が正しい場合はそのまま返す

# 学籍番号が1001から1100の範囲にあるかを確認する関数
def checkStudentNo(studentNo):
    # 学籍番号が1001未満または1100より大きい場合
    if studentNo < 1001 or studentNo > 1100:
        print("入力エラー")  # エラーメッセージを表示
        # 正しい学籍番号を入力させる
        studentNo = int(input("学籍番号を入力してください(1001-1100)-> "))
    return studentNo  # 入力が正しい場合はそのまま返す

"""
メイン処理
"""
# クラス名、学籍番号、氏名をユーザーから入力させる
classname = input("クラスを入力してください(A,B,C)-> ")
studentNo = int(input("学籍番号を入力してください(1001-1100)-> "))
name = input("氏名を入力してください-> ")

# クラス名のチェックを行う
classname = checkClassname(classname)

# 学籍番号のチェックを行う
studentNo = checkStudentNo(studentNo)

# 入力された内容を表示
print("クラス:", classname)
print("学籍番号:", studentNo)
print("氏名:", name)
