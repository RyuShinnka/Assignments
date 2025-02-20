#関数の処理
def jisyosearch(kye): #引数はキー
    jisyo={'AA':100,'BB':250,'CC':300,'DD':450,'EE':350,'FF':750}
    atai = jisyo.get(kye)
    if atai == None: #同じキーが無かったらFalseと０を返す
        return False,0
    else: #同じキー有ったらTrueとその値を返す
        return True,atai


#メインの処理
go = 0 #合計値を初期化
while True: #無限ループ
    in_kye = input("大文字の英字＝＞") 
    sw,val =jisyosearch(in_kye) #関数を呼び出し
    if sw == False: #Falseの時
        print("プログラム終了")
        break #ループを抜ける
    else:
        print(in_kye,"キーの値：",val)
        go += val #値を合計
print("キーの値の合計：",go) 
