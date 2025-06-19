import java.util.Scanner;
public class ensyu01_09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double p = 3.1416; // 円周率
		// 半径を入力
		System.out.print("球の半径を入力＝＞");
		double radius = s.nextDouble();
		// 表面積を計算
		double area = 4 * p * (radius * radius);
		// 体積を計算
		double volume = (4.0 / 3.0) * p * (radius * radius * radius);
		// 結果を出力
		System.out.println("球の表面積は " + area + "です。");
		System.out.println("球の体積は " + volume + "です。");

		s.close();
	}
}
