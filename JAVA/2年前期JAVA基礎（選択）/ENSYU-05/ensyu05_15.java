import java.util.Random;
import java.util.Scanner;

public class ensyu05_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); // ランダム生成器を作成

		// 要素数の入力
		System.out.print("要素数を入力=>");
		int num = sc.nextInt();
		int[] lst = new int[num];

		// 1〜10 の正の整数を生成（前に代入された同じ値にならないように）
		for (int i = 0; i < lst.length; i++) {
			int val;
			do {
				val = 1 + rand.nextInt(10);
			} while (i > 0 && val == lst[i - 1]);
			lst[i] = val;
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
