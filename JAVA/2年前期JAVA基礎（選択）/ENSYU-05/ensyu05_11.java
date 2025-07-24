import java.util.Scanner;
public class ensyu05_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("要素数を入力＝＞");
		int num = sc.nextInt();
		int[] lst = new int[num];
		
		for(int i = 0; i< lst.length; i++) {
			System.out.print((i+1) +"の要素の値を入力＝＞");
			lst[i] = sc.nextInt();
		}
		// 表示
		System.out.print("lst = {");
		for (int k = 0; k < lst.length; k++) {
			if (k > 0) {
				System.out.print(", ");
			}
			System.out.print(lst[k]);
		}
		System.out.println("}");
		sc.close();
	}
}
