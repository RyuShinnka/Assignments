import java.util.Scanner;
public class ensyu03_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("整数値を入力＝＞");
		int num = sc.nextInt();
		int result = 0;
		if(num < 0) {
			result = -num;
		}else if(num > 0) {
			result = num;
		}else {
			result = 0;
		}
		System.out.println(num+ "の絶対値は："+ result);
		sc.close();
	}
}
