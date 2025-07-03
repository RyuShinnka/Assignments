import java.util.Scanner;
public class ensyu03_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("値を入力＝＞");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("その値"+ num+"は、負です");
		} else if(num > 0) {
			System.out.println("その値"+ num+"は、正です");
		}else {
			System.out.println("その値はゼロです。");
		}
		sc.close();
	}
}
