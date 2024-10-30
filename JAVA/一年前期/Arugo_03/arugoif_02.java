import java.util.Scanner;

public class arugoif_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("整数aを入力してくださいｗ");
		int a = s.nextInt();
		System.out.println("整数bを入力してくださいｗ");
		int b = s.nextInt();
		if(a > b) {
			System.out.println("変数名aが大きい");
		}else if(a < b) {
			System.out.println("変数名bが大きい");
		}else {
			System.out.println("変数名aと変数名bは同じ値です");
		}
		s.close();
	}
}
