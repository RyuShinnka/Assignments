import java.util.Scanner;
public class arugoif_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("数字を入力して見て～");
		double num = s.nextDouble();
		if(num < 0) {
			System.out.println("負数の値です");
		}else if(num == 0) {
			System.out.println("値は0です");
		}else {
			System.out.println("正の数値です");
		}
		s.close();
		
	}
}
