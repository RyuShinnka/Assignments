import java.util.Scanner;
public class mon_04 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("整数を入力＝＞");
		int sei = stdin.nextInt();
		if(sei>=10 && sei<=99) {
			System.out.println("2桁の整数値です");
		}else if(sei>=100 && sei<=999) {
			System.out.println("3桁の整数値です");
		}else {
			System.out.println("桁数がわかりません");
		}
		stdin.close();
	}
}
