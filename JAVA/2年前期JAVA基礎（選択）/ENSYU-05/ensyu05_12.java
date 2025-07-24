import java.util.Scanner;

public class ensyu05_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 人数の入力
		System.out.print("学生の人数を入力=>");
		int num = sc.nextInt();
		int[] scores = new int[num];

		// 点数の入力
		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + "人目の点数を入力=>");
			scores[i] = sc.nextInt();
		}

		// 合計・平均・最高点・最低点の計算
		int sum = 0;
		int max = scores[0];
		int min = scores[0];

		for (int i = 0; i < num; i++) {
			sum += scores[i];
			if (scores[i] > max) {
				max = scores[i];
			}
			if (scores[i] < min) {
				min = scores[i];
			}
		}

		double avg = (double) sum / num;

		// 結果の表示
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);
		System.out.println("最高点：" + max);
		System.out.println("最低点：" + min);

		sc.close();
	}
}
