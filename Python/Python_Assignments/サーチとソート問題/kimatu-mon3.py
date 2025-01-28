# 問題３	ファイル名：kimatu-mon3
# 	List1を定義し、値をキーボードから入力し作成する。
# 	TBL＝[15,23,58,64,10,45,35,15,10,64]を定義する。
# 	List1とTBLの一つのTBL2に代入していきます。
# 	TBL2をセット関数で同じ値が内容にします。
# 	TBL2を表示

lst = []
TBL = [15,23,58,64,10,45,35,15,10,64]
# キーボードから値を入力
lstLen = int(input("リストの要素数を入力ー＞"))
for i in range(lstLen):
    lst.append(int(input("値を入力ー＞")))

# 	List1とTBLの一つのTBL2に代入していきます。
TBL2 =  TBL + lst
# 	TBL2をセット関数で同じ値が内容にします。
TBL2 = set(TBL2)
TBL2 = list(TBL2)
# # 	TBL2を表示
print(TBL2)
