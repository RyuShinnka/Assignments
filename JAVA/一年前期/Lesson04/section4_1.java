//ｉｆ文を使用する
//キーボードから整数値を入力して、１０以上99以下の場合は、”２桁の整数値です”
//それ以外は、”桁数がわかりません”と表示する
//
//追加機能として、以下の判定もできるようにする
//100以上から999以下までは、”３桁の整数値です”と表示しなさい。
import java.util.Scanner;
public class section4_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("整数値を入力して");
		int num = s.nextInt();
		if(num>=10 && num<=99) {
			System.out.println("２桁の整数値です");
		}else if (num >= 100 && num <= 999) {
			System.out.println("３桁の整数値です");
		}
		else {
			System.out.println("桁数がわかりません");
		}
		
	}
}
