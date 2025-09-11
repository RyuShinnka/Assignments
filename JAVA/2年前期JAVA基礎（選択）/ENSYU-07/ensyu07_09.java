import java.util.Scanner;
public class ensyu07_09 {

	// 正の整数値を読み取るメソッド
	public static int readplusInt() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("正の整数値を入力＝＞");
			int input = sc.nextInt();
			if(input <= 0) {
				continue; // 0以下の場合、再入力
			}
			sc.close(); // スキャナを閉じる
			return input;
		}
	}
	
	public static void main (String args[]) {
		int num = readplusInt(); // 正の整数を取得
		int result = 0; // 逆順の結果を格納する変数
		
		// 数値を逆順に変換する処理
		while (num > 0) {
		    int digit = num % 10; // 末尾の桁を取得
		    result = result * 10 + digit; // 桁を追加
		    num = num / 10; // 次の桁へ
		}
		
		// 結果を表示
		System.out.println("逆から表示すると"+result+"です。");
	}
}
