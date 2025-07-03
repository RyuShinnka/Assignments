import java.util.Scanner;
public class ensyu03_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("二つ違いの整数値を入力して");
		System.out.print("一つ目の整数値を入力＝＞");
		int num1 = sc.nextInt();
		
		System.out.print("二つ目の整数値を入力＝＞");
		int num2 = sc.nextInt();
		
		int temp = 0;
		if (num1 < num2) {
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		
		System.out.println("変数Aは"+ num1+ "です。");
		System.out.println("変数Bは"+ num2+ "です。");
		sc.close();
	}
}
