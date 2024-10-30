import java.util.Scanner;
public class mon_05 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		System.out.print("初めのを入力＝＞");
		int st = stdin.nextInt();
		System.out.print("終わりのを入力＝＞");
		int end = stdin.nextInt();
		for(int val = st; val<=end;val++) {
			sum+=val;
			count++;
		}
		int avr = sum / count;
		System.out.println("合計値："+sum);
		System.out.println("平均値："+avr);
		stdin.close();
	}
}
