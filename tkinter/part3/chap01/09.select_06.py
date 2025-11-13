import sqlite3

# コネクションオブジェクトの作成
conn = sqlite3.connect('part3/chap01/sample.db')
# カーソルオブジェクトの作成
cur = conn.cursor()

print("weight列で体重の軽い順（昇順）に並べ替える")
# データの抽出
sql = """
    SELECT
        *
    FROM
        personal
    ORDER BY
        weight ASC
"""

for row in cur.execute(sql):
    print(row)
print()

print("height列で背の高い順（降順）に並べ替える")
sql = """
    SELECT
        *
    FROM
        personal    
    ORDER BY
        height DESC
"""

for row in cur.execute(sql):
    print(row)
print()


# クローズ
cur.close()