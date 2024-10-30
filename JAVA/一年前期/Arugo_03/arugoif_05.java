import java.util.Scanner;
public class arugoif_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("年齢を入力してください");
		int age = s.nextInt();
		if(age <= 3) {
			System.out.println("２００円です");
		}else if(age <= 12) {
			System.out.println("５００円です");
		}else if(age <= 18) {
			System.out.println("８００円です");
		}else {
			System.out.println("１０００円です");
		}
		s.close();
	}
}

