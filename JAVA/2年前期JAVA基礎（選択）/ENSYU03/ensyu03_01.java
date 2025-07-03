import java.util.Scanner;
public class ensyu03_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ゼロ以外の整数値を入力＝＞");
		int num = sc.nextInt();
		if(num < 0) {
			System.out.println("その値は負です。");
		}
		sc.close();
	}
}
