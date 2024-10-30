import java.util.Scanner;
public class mon5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int g,num;
		System.out.println("表示する個数（整数）を入力してください！");
		g = s.nextInt();
		for(int i = 0; i < g;i++) {
			System.out.println("初期値（整数）を入力してください！");
			num = s.nextInt();
			if(num % 2 ==0) {
				System.out.println("+");
			}else {
				System.out.println("-");
			}
		}
		s.close();
	}
}
