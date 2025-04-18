"""
8-2-1　クラスの作成
"""

# 書式：クラスの作り方    P150
# class クラス名:
    # クラスに設定したい値やメソッドなど

"""
8-2-2 初期化用メソッド（__init__メソッド）の作成
"""
# 書式：__init__メソッドの作り方    P151
# class クラス名: 
    # def __init__(self, 初期化用引数):
        # self.インスタンス変数＝初期値

# インスタンス変数の追加    P151
# インスタンス変数の指定例（その１、class01.py、一部）
class Student:
    def __init__(self):
        self.name = ''
        self.math = 0
        self.english = 0
        self.japanese = 0

# 初期値をNoneを指定     P151
# インスタンス変数の指定例（その２、サンプルなし）
class Student:
    def __init__(self):
        self.name = None
        self.math = None
        self.english = None
        self.japanese = None

# 初期値を引数で受け取る    P152
# インスタンス変数の初期値設定（サンプルなし）
class Student:
    def __init__(self, in_name, _in_math, _in_eng, _in_jpn):
        self.name = in_name
        self.math = _in_math
        self.english = _in_eng
        self.japanese = _in_jpn

# __init__メソッドのデフォルト値例（サンプルなし）  P152
class Student:
    def __init__(self, in_name='', in_math=0, in_eng=0, in_jpn=0):
        self.name = in_name
        self.math = in_math
        self.english = in_eng
        self.japanese = in_jpn

"""
8-2-3 インスタンスうの生成
"""
# 書式：インスタンスの生成方法    P152
# インスタンスを代入する変数＝クラス名（初期化用引数）

# インスタンスの生成例(class01.py)  P153
class Student:
    def __init__(self):
        self.name = ''
        self.math = 0
        self.english = 0
        self.japanese = 0

stu1 = Student()
print(type(stu1))
# 実行結果：
# <class '__main__.Student'>

# 初期値を引数で指定
# インスタンス生成と初期化を同時に行う例（class02.py P153
class Student:
    def __init__(self, in_name='', in_math=0, in_eng=0, in_jpn=0):
        self.name = in_name
        self.math = in_math
        self.english = in_eng
        self.japanese = in_jpn

stu1 = Student('佐藤', 90, 60, 70)
print(type(stu1))
# 実行結果：
# <class '__main__.Student'>

"""
8-2-4 インスタンス変数の利用
"""
# インスタンス変数の利用例(class03.py)  P154
class Student:
    def __init___(self, in_name, in_math, in_eng, in_jpn):
        self.name = in_name
        self.math = in_math
        self.english = in_eng
        self.japanese = in_jpn
stu1 = Student('佐藤', 90, 60, 70)
print('生徒名', stu1.name)
print('数学', stu1.math)
print('英語', stu1.english)
print('国語', stu1.japanese)

stu1.japanese = 75
print('更新後の国語', stu1.japanese)
# 実行結果：
# 生徒名 佐藤
# 数学 90
# 英語 60
# 更新後の国語 75

"""
8-2-5 メソッドの生成
"""
# 書式：メソッドの作成方法
# def メソッド名(self, メソッド引数．．．):
#     メソッドで行う処理
#     return 戻り値

# メソッドの作成例（class04.py）  P155
class Student:
    def __init__(self, in_name, in_math, in_eng, in_jpn):
        self.name = in_name
        self.math = in_math
        self.english = in_eng
        self.japanese = in_jpn
    
    # 自分の情報を表示するメソッド
    def show_detail(self):
        print('生徒名:', self.name)
        print('数学:', self.math)
        print('英語:', self.english)
        print('国語:', self.japanese)
    
    # 合計点数を返すメソッド
    def get_total_score(self):
        return self.math + self.english + self.japanese
    
    # 数学の点数を変更するメソッド
    def set_math(self, new_math):
        self.math = new_math
"""
8-2-6　メソッドの利用
"""
# 書式：メソッドの利用方法
# 戻り値を受け取る変数＝インスタンス.メソッド名(メソッド引数．．．)

# メソッドの利用例（class04.py）  P156
stu1 = Student('佐藤', 90, 60, 70)
# 自分の情報を表示
stu1.show_detail()
# 空行の表示
print()
# 数学の点数を変更する
stu1.set_math(85)
# もう一度自分の情報を表示
stu1.show_detail()
# 合計点数を表示
ts1 = stu1.get_tatal_score()
print('合計点:', ts1)

# 実行結果：
# 生徒名: 佐藤
# 数学: 90
# 英語: 60
# 国語: 70
# 
# 生徒名: 佐藤
# 数学: 85
# 英語: 60
# 国語: 70
# 合計点: 215

# インスタンス変数にアクセス制限を付ける（サンプルなし）
class Student:
    def __init__(self, name, math, english, jpanese):
        self.__name = name
        self.__math = math
        self.__english = english
        self.__japanese = jpanese
stu1 = Student('佐藤', 90, 60, 70)
print(stu1.__name) #これはエラーになる


