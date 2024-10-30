
//P-56
import java.util.Scanner;
public class List2_16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("三角形の面積を計算します");
		System.out.println("底辺の長さを入力してください");
		double base = in.nextDouble();
		System.out.println("高さを入力してください");
		double height = in.nextDouble();
		double area = base * height / 2.0;
		System.out.println("面積は" + area);
		in.close();
	}
}
