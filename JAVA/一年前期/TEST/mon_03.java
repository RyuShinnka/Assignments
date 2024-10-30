import java.util.Scanner;
public class mon_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("1500を入力＝＞");
		int data = s.nextInt();
		System.out.println("入力した整数値は："+data+"ですね。");
		s.close();
	}
}
