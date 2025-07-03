import java.util.Scanner;
public class ensyu03_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("一つ目の実数値を入力＝＞");
		double num1 = sc.nextDouble();
		
		System.out.print("二つ目の実数値を入力＝＞");
		double num2 = sc.nextDouble();
		
		double result = 0.0;
		if (num1 > num2) {
			result = num1 - num2;
			System.out.println(num1 +"の方が大きいです。その差は"+result +"です。");
		}else{
			result = num2 - num1;
			System.out.println(num2 +"の方が大きいです。その差は"+result +"です。");
		}
		sc.close();
	}
}
