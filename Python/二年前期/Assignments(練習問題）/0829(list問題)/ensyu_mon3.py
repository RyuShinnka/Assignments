# ファイル名：ensyu-mon3
# List1を定義し、値をキーボードから入力し作成する。
# TBL＝[15,23,58,64,10,45,35,15,10,64]を定義する。
# List1とTBLの一つのTBL2に代入していきます。
# TBL2をセット関数で同じ値が内容にします。
# TBL2を表示

List1 = []
for i in range(3):
    num = int(input("値を入力-> "))
    List1.append(num)

TBL = [15,23,58,64,10,45,35,15,10,64]
TBL2 = List1 + TBL
TBL2 = set(TBL2)
print('TBL2:', TBL2)