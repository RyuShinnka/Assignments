class StudentCard:
    # クラス変数
    schoolName= 'ビジネスアカデミー'
    def __init__(self, id, name):
        self.id = id
        self.name = name

    def printInfo(self):
        print("学校名：", StudentCard.schoolName)
        print("学籍番号：", self.id)
        print("氏名：", self.name)
    
    # クラスメソッド定義
    @classmethod
    def sumMethod(cls, score1, score2):
        sum = score1 + score2
        return sum
    
# メインの処理
score1 = int(input('点数１＝＞'))
score2 = int(input('点数２＝＞'))
name = input('生徒名を入力＝＞')
id = int(input('学籍番号を入力＝＞'))
# インスタンス生成
student = StudentCard(name, id)
student.printInfo()

sum = StudentCard.sumMethod(score1, score2)
print('合計点：', sum)
