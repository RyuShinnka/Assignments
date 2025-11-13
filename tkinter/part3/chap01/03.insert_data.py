import sqlite3

# コネクションオブジェクトの作成
conn = sqlite3.connect('part3/chap01/sample.db')
# カーソルオブジェクトの作成
cur = conn.cursor()

# データの追加
sql = """
    INSERT INTO personal VALUES(
        '001'
        ,'Yamada Taro'
        ,173
        ,62.5
    )
"""
cur.execute(sql)

sql = """
    INSERT INTO personal VALUES(
        '002'
        ,'Tanaka Hanako'
        ,163
        ,53.1
    )
"""
cur.execute(sql)

sql = """
    INSERT INTO personal VALUES(
        '003'
        ,'Suzuki Saburo'
        ,180
        ,75.8
    )
"""
cur.execute(sql)

# コミットを行うことでデータベースに反映される
conn.commit()
print('Personalテーブルにデータを追加しました。')

conn.close()