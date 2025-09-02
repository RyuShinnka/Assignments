import java.util.Random;
public class Random_mon02 {
	public static void main(String args[]) {
		Random rand = new Random();
		
		int[] dice_cnt = new int[6]; // 各サイコロの目の出現回数を格納する配列

		// サイコロを100回振る
		for(int i = 0; i < 100; i++) {
			int result = rand.nextInt(6) + 1; // 1〜6のランダムな数

			// 出た目に応じてカウントを増やす
			switch(result) {
				case 1:
					dice_cnt[0]++;
					break;
				case 2:
					dice_cnt[1]++;
					break;
				case 3:
					dice_cnt[2]++;
					break;
				case 4:
					dice_cnt[3]++;
					break;
				case 5:
					dice_cnt[4]++;
					break;
				case 6:
					dice_cnt[5]++;
					break;
			}
		}

		// 結果を出力
		for(int i = 0; i < dice_cnt.length; i++) {
			System.out.println("サイコロの" + (i + 1) + "の目は" + dice_cnt[i] + "回出ました");
		}
	}
}
