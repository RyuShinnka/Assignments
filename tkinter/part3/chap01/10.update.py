import sqlite3

# コネクションオブジェクトの作成
conn = sqlite3.connect('part3/chap01/sample.db')
# カーソルオブジェクトの作成
cur = conn.cursor()

print("idが002の変更前")
sql = """
    SELECT * FROM personal WHERE id = '002'
"""
cur.execute(sql)
print(cur.fetchone())
print()

# idが002のname列をSasaki　Jiroに変更
sql = """
    UPDATE personal SET name = 'Sasaki Jiro' WHERE id = '002'
"""
cur.execute(sql)
conn.commit()

print("idが002の変更後")
sql = """
    SELECT * FROM personal WHERE id = '002'
"""
cur.execute(sql)
print(cur.fetchone())
print()

cur.close()
