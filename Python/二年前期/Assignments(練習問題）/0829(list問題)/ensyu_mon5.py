# 関数処理内容	
# 	引数：キー
# 	戻り値：TrueかFalseと値か０
# 	jisyo={'AA':100,'BB:250,'CC':300,'DD':450,'EE':350,'FF':750}
# 	辞書は関数で定義する
# 	関数はキーを受け取りそのキーが有ったら、Trueとその値を返す
# 	キーが無かったらFalseと０を返す
	
# メイン処理	
# 	メインは数回キーを入力できるようにする
# 	キーを引数として関数を呼び出す
# 	戻り値を判定して、キーが見つからなかったら合計値を表示してプログラム終了
# 	戻り値を判定して、キーが見つかったら合計していく

"""関数処理"""
def jisyo_search(key):
    jisyo={'AA':100,'BB':250,'CC':300,'DD':450,'EE':350,'FF':750}
    if key in jisyo:
        return True,jisyo[key]
    else:
        return False,0

"""メイン処理"""
total=0
while True:
    key=input("キーを入力->")
    # 	戻り値を判定して、キーが見つからなかったら合計値を表示してプログラム終了
    # 	戻り値を判定して、キーが見つかったら合計していく
    result,value=jisyo_search(key)
    if result:
        total+=value
        print(key,"は",value,"です。")
    else:
        print("見つかりませんでした。")
        print("合計値は", total, "です。")
        break