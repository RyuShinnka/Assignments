import java.util.Scanner;
public class ensyu03_14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("月を１～１２の整数値を入力して=>");
		int month = sc.nextInt();
		String month_text = "";

		switch(month) {
			case 3:
			case 4:
			case 5:
				month_text = "春";
				break;
			case 6:
			case 7:
			case 8:
				month_text = "夏";
				break;
			case 9:
			case 10:
			case 11:
				month_text = "秋";
				break;
			case 12:
			case 1:
			case 2:
				month_text = "冬";
				break;
			default:
				System.out.println("そんな月はありません！");
				sc.close();
				break;
		}

		System.out.println(month_text);
		sc.close();
	}
}
