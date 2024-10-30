//問題２
//処理の解説をもとに、フローチャートを作成しなさい。
//処理の説明
//※
//変数Ｘに値を入力
//※
//変数Ｙに値を入力
//※
//変数Ｘと変数Ｙを比較し大きい数値を変数MAXに、
//小さい数値を変数MINに代入。
//※
//変数MAXと変数MINの値を出力

public class arugo02_02 {
	public static void main(String[] args) {
		int X = 3;//変数Xを宣言して値を代入する
		int Y = 9;//変数Yを宣言して値を代入する
		int MAX;//変数MAXを宣言する
		int MIN;//変数MINを宣言する
		if(X > Y) {//変数XとYの大きさを判断する
			//trueの場合はここのコードを実行する
			MAX = X;
			MIN = Y;
		}else {//そうではない場合
			//以上の判断はfalseの場合はここのコードを実行する
			MAX = Y;
			MIN = X;
		}
		//MAXとMINを出力
		System.out.println("変数MAXの値:" + MAX + " ; " + "変数MINの値:" + MIN );
	}
}


