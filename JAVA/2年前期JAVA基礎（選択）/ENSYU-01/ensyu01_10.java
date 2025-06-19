import java.util.Scanner;
public class ensyu01_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("整数を入力＝＞");
		int num = s.nextInt();
		
		if(num % 3 == 0) {
			int new_num = num*num*num*num;
			System.out.println(num+ "の4乗は " + new_num + "です。");
		}else {
			System.out.println("終了");
		}


		s.close();
	}
}
