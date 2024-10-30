import java.util.Scanner;
public class mon4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x,y;
		System.out.println("xの値（整数）を入力してください！");
		x = s.nextInt();
		System.out.println("yの値（整数）を入力してください！");
		y = s.nextInt();
		int sum = 0;
		if(x>y) {
			System.out.println("入力エラー");
		}else {
			for(int i = x; i <= y; i++) {
				sum+=i;
				if(i < y) {
					System.out.print(i+"+");
				}else {
					System.out.print(i);
				}
			}
			System.out.println("="+sum);
		}
		
		s.close();
	}
}
