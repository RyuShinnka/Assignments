import java.util.Scanner;
public class ensyu01_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Xの値を入力＝＞");
		int X = s.nextInt();
		System.out.print("Yの値を入力＝＞");
		int Y = s.nextInt();
		System.out.print("Zの値を入力＝＞");
		int Z = s.nextInt();
		int sum = X + Y + Z;
		int avg = sum / 3;
		System.out.println(X+" + "+Y+" + "+Z+" = "+sum);
		System.out.println(sum + " ÷ 3 = "+ avg);
		s.close();
	}
}
