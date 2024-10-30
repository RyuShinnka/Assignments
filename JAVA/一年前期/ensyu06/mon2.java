import java.util.Scanner;
public class mon2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("1以上の整数を入力してください！");
		n = s.nextInt();
		int sum = 0;
		for(int i = １; i <= n; i++) {
			if(i % 4 == 0 ) {
				sum+=i;
			}
		}
		System.out.println("４の倍数の総和:"+sum);
		s.close();
	}
}
