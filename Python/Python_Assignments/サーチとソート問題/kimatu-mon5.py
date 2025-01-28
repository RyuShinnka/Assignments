# 問題５	ファイル名：kimatu-mon5	
# 	関数処理内容	
# 		引数：キー
# 		戻り値：TrueかFalseと値か０
# 		jisyo={'AA':100,'BB:250,'CC':300,'DD':450,'EE':350,'FF':750}
# 		辞書は関数で定義する
# 		関数はキーを受け取りそのキーが有ったら、Trueとその値を返す
# 		キーが無かったらFalseと０を返す
		
# 	メイン処理	
# 		メインは数回キーを入力できるようにする
# 		キーを引数として関数を呼び出す
# 		戻り値を判定して、キーが見つからなかったら合計値を表示してプログラム終了
# 		戻り値を判定して、キーが見つかったら合計していく



"""関数処理内容"""

def search_jisyo(key):#引数：キー
    jisyo={'AA':100,'BB':250,'CC':300,'DD':450,'EE':350,'FF':750}
    if key in jisyo:#キーが辞書に存在したら
        return True,jisyo[key]#Trueと値を返す
    else:
        return False,0 #Falseと０を返す



"""メイン処理"""
total = 0 #合計値初期化
while True: #無限ループ
    key=input("キーを入力してください：")
    result=search_jisyo(key)#関数呼び出し
    if result[0]:#戻り値がTrue
        print("見つかりました！値は",result[1],"です。")
        total += result[1] #合計値に値を加算
    else:
        print("見つかりませんでした。")
        print("合計値は",total,"です。")
        break #プログラム終了