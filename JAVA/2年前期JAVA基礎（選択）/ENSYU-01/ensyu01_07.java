import java.util.Scanner;
public class ensyu01_07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 整数値を入力
		System.out.print("整数値を入力＝＞");
		int num = s.nextInt();
		// 最下位桁（1の位）を取り出す
		int last = num % 10;
		// 最下位桁を除いた値（10で割って整数にする）
		double calc = num * 0.1;
		int new_calc = (int)calc;
		// 結果を出力
		System.out.println("最下位桁を除いた値は "+ new_calc + "です。");
		System.out.println("最下位桁は "+ last + "です。");
		
		s.close();
	}
}
