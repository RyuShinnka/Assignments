import java.util.Scanner;
public class ensyu07_06 {

	// 入力された月から季節を返すメソッド
	public static String printSeason(int mon) {
		String c = "";
		if(mon == 3 || mon == 4 || mon == 5) {
			c = "春";
		}else if(mon == 6 || mon == 7 || mon == 8) {
			c = "夏";
		}else if(mon == 9 || mon == 10 || mon == 11) {
			c = "秋";
		}else {
			c = "冬";
		}
		return c;
	}

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n＝＝月によって季節を表示します＝＝\n");

		while(true) {
			System.out.print("月を入力(999を入力すると終了)＝＞");
			int month = sc.nextInt();
			int endCode = 999; // 終了コード

			if(month == endCode) {
				System.out.println("終了します。");
				break; // ループ終了
			}

			// 1〜12以外の数字はエラー
			if(month>12 || month <0) {
				System.out.println("\n＝★＝☆＝エラーです\n１～１２の数値を入力してください＝★＝☆＝\n");
				continue; // 再入力
			}

			// 季節を表示
			String monString = month + "月は、"+ printSeason(month)+ "の季節です。";
			System.out.println(monString);
		}

		sc.close(); // Scannerを閉じる
	}
}
