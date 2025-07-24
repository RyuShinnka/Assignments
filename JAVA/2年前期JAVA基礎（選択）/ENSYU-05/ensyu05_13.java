import java.util.Scanner;

public class ensyu05_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 要素数の入力
		System.out.print("要素数を入力=>");
		int num = sc.nextInt();
		int[] lst = new int[num];

		// 配列の値を入力
		for (int i = 0; i < num; i++) {
			System.out.print("lst[" + i + "] = ");
			lst[i] = sc.nextInt();
		}

		// 探索する値を入力
		System.out.print("探索する値を入力=>");
		int key = sc.nextInt();

		// 配列を探索
		int found = 1;
		for (int i = 0; i < num; i++) {
			if (lst[i] == key) {
				System.out.println("lst[" + i + "]にあります。");
				found = 0;
				break;
			}
		}

		// 見つからなかった場合
		if (found == 0) {
			System.out.println("その値は配列内に存在しません。");
		}

		sc.close();
	}
}
