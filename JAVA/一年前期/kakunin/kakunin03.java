import java.util.Scanner;

public class kakunin03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int code;//コード格納の変数を宣言する
		
		while (true) {
            System.out.print("処理番号を入力してください (1〜4、終了コードは9999): ");
            code = s.nextInt();
            //終了コード判断
            if (code == 9999) {
            	System.out.print("終了コードなので、プログラム終了します。");
                break;
            }
            switch (code) {
            case 1:
                // 三角形の面積を求め表示する（底辺・高さ）入力する
                System.out.print("底辺を入力してください: ");
                double teihen = s.nextDouble();
                System.out.print("高さを入力してください: ");
                double height = s.nextDouble();
                double menseki = (teihen * height) / 2;
                System.out.println("三角形の面積: " + menseki);
                System.out.println("");
                break;

            case 2:
                // ゲームの点を３つ入力して、合計点と平均点を表示する
                System.out.print("ゲームの点数1を入力してください: ");
                int tensu1 = s.nextInt();
                System.out.print("ゲームの点数2を入力してください: ");
                int tensu2 = s.nextInt();
                System.out.print("ゲームの点数3を入力してください: ");
                int tensu3 = s.nextInt();
                int total = tensu1 + tensu2 + tensu3;
                double avg_tensu = total / 3.0;
                System.out.println("合計点: " + total + ", 平均点: " + avg_tensu);
                System.out.println("");
                break;

            case 3:
                // 半径を入力して、円の面積を求め表示する（π＝3.14）
                System.out.print("半径を入力してください: ");
                double hankei = s.nextDouble();
                double en_menseki = 3.14 * hankei * hankei;
                System.out.println("円の面積: " + en_menseki);
                System.out.println("");
                break;
            
            case 4:
            	//整数値を入力し、その値が２の倍数でもあり３の倍数でもあるかを判定する
            	System.out.print("整数値を入力してください: ");
                int num = s.nextInt();
                if (num % 2 == 0 && num % 3 == 0) {
                	System.out.println("正常値: " + num);
                	System.out.println("");
                }else {
                	System.out.println("入力値 " + num + " は範囲外です");
                	System.out.println("");
                }
                break;
            default:
            	System.out.println("処理番号エラー");
            	System.out.println("");
                break;
            }
		
		}
		s.close();
	}
}
