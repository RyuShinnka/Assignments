//受け取ったint型引数の値ｎが負であれば-1をreturn、０であれば0をreturn、正であれば１をreturnするメソッドsignof()を作成し、それを呼び出し結果を表示するメインメソッドを作成する。
public class ensyu07_01 {
	// signof メソッドの定義
    public static int signof(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    
	public static void main (String args[]) {
		// テスト用の値
        int[] testValues = {-9, 0, 23};

        // 各テスト値に対して signof() を呼び出し、結果を表示
        for (int i = 0; i < testValues.length; i++) {
            int result = signof(testValues[i]);
            System.out.println("signof(" + testValues[i] + ") = " + result);
        }
	}
}
