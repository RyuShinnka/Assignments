import java.util.Scanner;
public class mon1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("20より大きい整数を入力してください！");
		n = s.nextInt();
		int sum = 0;
		for(int i = 20; i <= n; i++) {
			sum+=i;
		}
		System.out.println("総和:"+sum);
		s.close();
	}
}
