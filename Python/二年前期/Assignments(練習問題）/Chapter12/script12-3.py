import re
from script8_2 import Student  # Studentクラスを定義したモジュールをインポート

# 生徒データの文字列
str = 'name:佐藤,math:100,english:40,japanese:65'

# 正規表現パターンを定義（各教科の点数を抽出する）
pattern = r'^name:(\w+),math:([0-9]+),english:([0-9]+),japanese:([0-9]+)'

# 文字列にパターンがマッチするかを検索
mo = re.search(pattern, str)

# マッチした値をタプルで取得
t = mo.groups()

# Studentクラスのインスタンスを作成（名前と各点数を渡す）
stu = Student(t[0], int(t[1]), int(t[2]), int(t[3]))

# 生徒の詳細情報を表示
stu.show_detail()
