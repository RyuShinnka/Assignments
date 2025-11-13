import sqlite3

# コネクションオブジェクトの作成
conn = sqlite3.connect('part3/chap01/sample.db')
# カーソルオブジェクトの作成
cur = conn.cursor()

print("idが '002' と等しい行")
# データの抽出
sql = """
    SELECT
        *
    FROM
        personal
    WHERE
        id = '002'
"""

for row in cur.execute(sql):
    print(row)
print()

print("heightが173以上の行")
sql = """
    SELECT
        *
    FROM
        personal
    WHERE
        height >= 173
"""

for row in cur.execute(sql):
    print(row)
print()

print("weightが75.8以外の行")
sql = """
    SELECT
        *
    FROM
        personal
    WHERE
        weight <> 75.8
"""

for row in cur.execute(sql):
    print(row)
print()

print("idが '001' と等しい以外の行")
sql = """
    SELECT
        *
    FROM
        personal
    WHERE NOT
        id = '001'
"""
for row in cur.execute(sql):
    print(row)
print()

print("""heightが173以上で、かつweightが75.8と等しい行""")
sql = """
    SELECT
        *
    FROM
        personal
    WHERE
        height >= 173 AND weight = 75.8
"""
for row in cur.execute(sql):
    print(row)
print()

print("""heightが163と等しいか、もしくは173と等しい行""")
sql = """
    SELECT
        *
    FROM
        personal
    WHERE
        height = 163 OR height = 173
"""
for row in cur.execute(sql):
    print(row)
print()

print("""heightが170から180の範囲に含まれる行""")
sql = """
    SELECT
        *
    FROM
        personal
    WHERE
        height BETWEEN 170 AND 180
"""
for row in cur.execute(sql):
    print(row)
print()

print("""heightが160、170、180のどれかと等しい行""")
sql = """
    SELECT
        *
    FROM
        personal
    WHERE
        height IN (160, 170, 180)
"""
for row in cur.execute(sql):
    print(row)
print()

print("""heightが160、170、180のどれとも等しくない行""")
sql = """
    SELECT
        *
    FROM
        personal
    WHERE
        height NOT IN (160, 170, 180)
"""
for row in cur.execute(sql):
    print(row)
print()

# クローズ
cur.close()