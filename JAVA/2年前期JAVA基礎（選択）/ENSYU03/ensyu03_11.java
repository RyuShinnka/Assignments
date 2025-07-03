import java.util.Scanner;
public class ensyu03_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("変数Aの整数値を入力＝＞");
		int num1 = sc.nextInt();
		
		System.out.print("変数Bの整数値を入力＝＞");
		int num2 = sc.nextInt();
		
		System.out.print("変数Cの整数値を入力＝＞");
		int num3 = sc.nextInt();
		
		int min,mid,max;
		if (num1 < num2 && num1 < num3) {
			min = num1;
			if(num2 < num3) {
				mid = num2;
				max = num3;
			}else {
				mid = num3;
				max = num2;
			}
		}else if(num2 < num1 && num2 < num3) {
			min = num2;
			if(num1 < num3) {
				mid = num1;
				max = num3;
			}else {
				mid = num3;
				max = num1;
			}
		}else {
			min = num3;
			if(num1 < num2) {
				mid = num1;
				max = num2;
			}else {
				mid = num2;
				max = num1;
			}
		}
		num1 = min;
		num2 = mid;
		num3 = max;
		
		System.out.println("変数Aは"+ num1+ "です。");
		System.out.println("変数Bは"+ num2+ "です。");
		System.out.println("変数Cは"+ num3+ "です。");
		sc.close();
	}
}
