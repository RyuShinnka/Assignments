# 関数定義
def find_multiples(start, end, multiple):
    result = []  # 結果を格納するリスト
    for i in range(start, end + 1):
        if i % multiple == 0:  # 倍数値であるかを確認
            result.append(i)  # 条件に合う値をリストに追加
    return result  # 倍数値が格納されたリストを返す

# メイン処理

# キーボードから初期値、終了値、倍数値を入力
start = int(input("初期値を入力=》"))
end = int(input("終了値を入力=》"))
multiple = int(input("倍数値を入力=》"))

# 関数を呼び出し
multiples_list = find_multiples(start, end, multiple)

# 受け取ったリストを表示
print("指定された範囲の倍数値のリスト:", multiples_list)