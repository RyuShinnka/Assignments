import java.util.Scanner;
public class ensyu03_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("整数値Aを入力＝＞");
		int numA = sc.nextInt();
		System.out.print("整数値Bを入力＝＞");
		int numB = sc.nextInt();
		
		if(numA % numB == 0) {
			System.out.println("B"+ numB+"値は　A"+ numA+ "値の約数です。");
		}else {
			System.out.println("B"+ numB+"値は　A"+ numA+ "値の約数ではありません。");
		}
		sc.close();
	}
}
