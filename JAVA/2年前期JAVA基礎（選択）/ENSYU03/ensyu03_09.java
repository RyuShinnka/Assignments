import java.util.Scanner;
public class ensyu03_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("三つ違いの整数値を入力して");
		System.out.print("一つ目の整数値を入力＝＞");
		int num1 = sc.nextInt();
		
		System.out.print("二つ目の整数値を入力＝＞");
		int num2 = sc.nextInt();
		
		System.out.print("三つ目の整数値を入力＝＞");
		int num3 = sc.nextInt();
		
		int result = 0;
		if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
			result = num1;
		}else if((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
			result = num2;
		}else{
			result = num3;
		}
		
		System.out.println("真ん中の値は："+ result);
		sc.close();
	}
}
