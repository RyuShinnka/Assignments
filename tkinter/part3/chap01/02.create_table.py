import sqlite3

# コネクションオブジェクトの生成
conn = sqlite3.connect('part3/chap01/sample.db')

# カーソルオブジェクト生成
cur = conn.cursor()

# personalテーブルの生成
cur.execute("""
    CREATE TABLE personal(
            id TEXT PRIMARY KEY
            ,name TEXT NOT NULL
            ,height INTEGER NOT NULL
            ,weight REAL NOT NULL
            )
""")
print('personalテーブルを作成しました。')
conn.close()