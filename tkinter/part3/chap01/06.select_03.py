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

data = cur.execute(sql)

while True:
    d = data.fetchone()
    if d is None: break
    print(d)
# クローズ
cur.close()