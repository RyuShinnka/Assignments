import java.util.Scanner;
public class mon_06 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int max=0;
		int min=300;
		for(int i = 1; i<6;i++) {
			System.out.print(i+"人目のゲームの点数＝＞");
			int ten = stdin.nextInt();
			if(max<ten) {
				max = ten;
			}
			if(min>ten) {
				min = ten;
			}
		}
		System.out.println("最高点："+ max);
		System.out.println("最低点："+ min);
		stdin.close();
	}
}
