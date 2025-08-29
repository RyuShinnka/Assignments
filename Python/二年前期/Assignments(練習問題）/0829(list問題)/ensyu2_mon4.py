# 演習4:  ensyu2-mon4
# 以下のような文字列型のリストTBLがあります。
# [“apple”, “banana”, “apple”, “cherry”, “cherry”, “cherry”, “banana”, “apple”, “apple”, “cherry”]
# TBLの要素ごとの出現回数を辞書型で出力してください。


TBL = ["apple", "banana", "apple", "cherry", "banana", "apple", "apple", "cherry"]

count_dict = {} # 辞書型の初期化

for i in TBL: # 各要素をループ
    if i in count_dict: # 辞書に存在する場合
        count_dict[i] += 1 # 値を1増やす
    else: # 辞書に存在しない場合
        count_dict[i] = 1 # 値を1に設定

# 辞書型の出力
print(count_dict)