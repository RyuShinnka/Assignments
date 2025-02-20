#関数の処理
def sortfun(lists, sw):
    if sw == 1:# 降順に並べ替え  バブルソート
        x = len(lists) 
        while x > 0: # 昇順に並べ替えたい範囲の左端から右端まで繰り返し
            i = 0
            while i< x-1:
                if lists[i] < lists[i+1]: # 左と右の値を比較し、左が小さい場合は入れ替え
                    work = lists[i]
                    lists[i] = lists[i+1]
                    lists[i+1] = work
                i += 1
            x -= 1
    else: # 昇順に並べ替え  クイックソート
        for i in range(len(lists)):
            for j in range(i+1, len(lists)):
                if lists[i] > lists[j]: # 左と右の値を比較し、左が大きい場合は入れ替え
                    work = lists[i]
                    lists[i] = lists[j]
                    lists[j] = work



#メインの処理
TBL = [20,60,50,10,70,30,90,100,85,65] # リスト定義
ff = int(input("昇順＝１、降順＝2  ＝＞")) # 昇順か降順の値を入力
sortfun(TBL, ff) # 関数を呼び出し並び替えたリストを取得
print("TBL = ", end="")
print(TBL)
