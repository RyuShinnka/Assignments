# 関数処理内容
# 引数：リストと並べ替えの値（昇順の場合は1・降順の場合は2）
# 戻り値：並び変えたリスト
# 昇順は、リストの並べ替え処理をバブルソートで行う
# 降順は、リストの並べ替え処理を単純選択法で行う
# メイン処理
# リスト定義　TBL＝［20,60,50,10,70,30,90,100,85,65]を定義する
# キーボードから昇順か降順の値を入力し
# それに合わせて関数を呼び出しリストを表示する

"""関数の処理"""
def sort(lst, order):
    if order == 1:# 降順に並べ替え  バブルソート
        temp = 0
        last = len(lst) - 1
        while last > 0:
            i = 0
            while i < last:
                if lst[i] < lst[i+1]:
                    temp = lst[i]
                    lst[i] = lst[i+1]
                    lst[i+1] = temp
                i += 1
            last -= 1
    elif order == 2:# 昇順に並べ替え  単純選択法
        for i in range(len(lst)):
            min_idx = i
            for j in range(i+1, len(lst)):
                if lst[min_idx] > lst[j]:
                    min_idx = j
            lst[i], lst[min_idx] = lst[min_idx], lst[i]
    return lst



"""メインの処理"""
TBL = [20,60,50,10,70,30,90,100,85,65]
order = int(input("昇順に並べ替え(1)、降順に並べ替え(2)->"))
sorted_list = sort(TBL, order)
print(sorted_list)
