import java.util.Scanner;
public class arugoif_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("整数を入力してくださいｗ");
		int num = s.nextInt();
		if(num > 100) {
			num -=100;//num = num - 100;
			System.out.println(num);
		}else {
			System.out.println(num);
		}
		s.close();
	}
}
