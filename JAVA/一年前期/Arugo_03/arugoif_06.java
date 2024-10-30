import java.util.Scanner;
public class arugoif_06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("整数を入力してください");
		int num = s.nextInt();
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("２の倍数でもあり３の倍数でもあります！");
		}else if(num % 3 == 0) {
			System.out.println("３の倍数です！");
		}else if(num % 2 == 0) {
			System.out.println("２の倍数です！");
		}else {
			
		}
		s.close();
	}
}
