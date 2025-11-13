import sqlite3

# コネクションオブジェクトの作成
conn = sqlite3.connect('part3/chap01/sample.db')
# カーソルオブジェクトの作成
cur = conn.cursor()

# データの抽出
sql = """
    SELECT
        id
        ,name
    FROM
        personal
"""

for row in cur.execute(sql):
    print(row)
# クローズ
cur.close()