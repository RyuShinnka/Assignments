import java.util.Random;
import java.util.Scanner;

public class ensyu05_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); // ランダム生成器を作成

		System.out.print("要素数を入力＝＞");
		int num = sc.nextInt();
		int[] lst = new int[num];

		// 1〜10 の正の整数を生成
		for (int i = 0; i < lst.length; i++) {
			lst[i] = 1 + rand.nextInt(10); // 1〜10
		}

		// 縦向き棒グラフの表示（上から10段）
		for (int level = 10; level >= 1; level--) {
			for (int i = 0; i < lst.length; i++) {
				if (lst[i] >= level) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(); // 改行
		}
		System.out.println("ーーーーーーーーーーーー");
		// 最下段：インデックス % 10
		for (int i = 0; i < lst.length; i++) {
			System.out.print((i % 10) + " ");
		}

		sc.close();
	}
}
