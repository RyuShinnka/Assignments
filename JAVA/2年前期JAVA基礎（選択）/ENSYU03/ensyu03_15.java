import java.util.Scanner;
public class ensyu03_15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("時間を0～24の整数値を入力して=>");
		int time = sc.nextInt();
		String message = "";

		switch(time) {
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				message = "おはようございます";
				break;
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:	
				message = "こんにちは";
				break;
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
				message = "こんばんは";
				break;
			case 21:
			case 22:
			case 23:
				message = "遅くに失礼します";
				break;
			case 24:
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				message = "真夜中に失礼します";
				break;
			default:
				System.out.println("0～24の整数を入力してください");
				sc.close();
				break;
		}

		System.out.println(message);
		sc.close();
	}
}
