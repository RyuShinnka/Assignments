# 演習3:  ensyu2-mon3
# 以下のような整数型のリストTBLがあります。
# [1, 2, 3, 1, 2, 1, 4, 5, 2]
# TBLの要素ごとの出現回数を辞書型で出力してください。

TBL = [1, 2, 3, 1, 2, 1, 4, 5, 2]

count_dict = {} # 辞書型の初期化

for num in TBL: # TBLの各要素について
    if num in count_dict: # 辞書に存在する場合
        count_dict[num] += 1 # 値を1増やす
    else: # 辞書に存在しない場合
        count_dict[num] = 1 # 値を1に設定

# 辞書型の出力
print(count_dict)