import java.util.Random;
public class Random_mon01 {
	public static void main(String args[]) {
		Random rand = new Random();
		int even_sum = 0; // 偶数の合計
		int odd_sum = 0;  // 奇数の合計
		int even_cnt = 0; // 偶数の個数
		int odd_cnt = 0;  // 奇数の個数
		int max_val = 0;  // 最大値
		int min_val = 101; // 最小値
		int[] lst = new int [20]; // 20個の整数を格納

		// 1～100の乱数を20個生成して配列に格納
		for(int i= 0; i< lst.length; i++) {
			int num = rand.nextInt(100) + 1;
			lst[i] = num;
		}

		// 偶数・奇数の集計と最大値・最小値を算出
		for(int i= 0; i< lst.length; i++) {
			if(lst[i] % 2 == 0) {
				even_sum += lst[i];
				even_cnt++;
			}
			if(lst[i] % 2 != 0) {
				odd_sum += lst[i];
				odd_cnt++;
			}
			if(lst[i] > max_val) {
				max_val = lst[i];
			}
			if(lst[i] < min_val) {
				min_val = lst[i];
			}
		}

		// 結果を出力
		System.out.println("ランダム生成した整数の偶数の平均値は　"+ even_sum / even_cnt);
		System.out.println("ランダム生成した整数の奇数の平均値は　"+ odd_sum / odd_cnt);
		System.out.println("ランダム生成した整数の最大値は　"+ max_val);
		System.out.println("ランダム生成した整数の最小値は　"+ min_val);
	}
}
