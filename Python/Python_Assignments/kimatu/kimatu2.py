#関数の処理
def searchfun(in_kye):#引数：検索値
    list1 = [20,60,50,10,70,30,90,100,85,65]#List1を定義
    on = 2
    for x in list1: #List1から検索値をシーケンシャルサーチの方法で検索する
        if x == in_kye: #検索値が見つかった場合
            on = 1 
    return on

#メインの処理

in_kye = int(input("検索するキー＝＞"))
sw = searchfun(in_kye)
if sw == 1:
    print("検索値は見つかりました")
else:
    print("検索値はList1の中にはありません")

