import java.util.Scanner;
public class ensyu03_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0から100までの整数値を入力＝＞");
		int num = sc.nextInt();
		
		if (num >= 0 && num < 60) {
			System.out.println("不可");
		} else if(num >= 60 && num < 70) {
			System.out.println("可");
		}else if(num >= 70 && num < 80){
			System.out.println("良");
		}else{
			System.out.println("優");
		}
		sc.close();
	}
}
