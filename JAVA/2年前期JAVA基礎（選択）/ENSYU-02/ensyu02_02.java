import java.util.Random;
import java.util.Scanner;

public class ensyu02_02 {
	public static void main(String[] args) {
		Random rand = new Random(); // ランダム生成器を作成
		Scanner s = new Scanner(System.in); // キーボード入力用のスキャナーを作成

		System.out.print("整数値を入力＝＞");
		int num = s.nextInt(); // ユーザーから整数を入力してもらう

		int low = num - 5; // 範囲の下限（入力値 - 5）
		int up = num + 5; // 範囲の上限（入力値 + 5）
		// low ～ up の範囲でランダムな整数を生成
		int randNum = rand.nextInt(up - low + 1) + low;

		// 結果を表示
		System.out.println("入力値: " + num);
		System.out.println("プラス・マイナス5の範囲: " + low + " から " + up + " まで");
		System.out.println("生成されたランダムな整数: " + randNum);
		s.close(); 
	}
}
