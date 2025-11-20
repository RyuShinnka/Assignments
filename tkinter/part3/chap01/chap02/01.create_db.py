import sqlite3

# データベースのmemo.dbを作成
conn = sqlite3.connect('part3/chap02/memo.db')
cur = conn.cursor()

# dailyテーブルの生成
cur.execute("""
    CREATE TABLE daily (
            date TEXT PRIMARY KEY,
            memo TEXT NOT NULL)
""")

# データを1件だけ入力しておく
day = '2023_8_9'
memo = '本日のメモ\n\n牛乳を買うこと\n髪を切りに行く'

sql = 'INSERT INTO daily VALUES (?,?)'
cur.execute(sql, (day, memo))

conn.commit()

# データの確認
for row in cur.execute('SELECT * FROM daily'):
    print(row)

conn.close()
