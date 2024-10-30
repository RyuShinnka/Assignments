//	分岐処理応用　問題1
//処理番号をキーボードから入力します、処理番号は1～4です。それ以外の番号が入力された時は、「入力エラー」と表示して終了です。正しい処理番号が入力されたら、２つの数値を入力します。処理番号に合わせて計算を行います。その結果を表示する。
//処理番号１は足し算・2番は掛け算・3番は引き算・4番は割り算とします。

import java.util.Scanner;
public class arugoifo_01 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 処理番号の入力
        System.out.print("処理番号を入力してください（1～4）：");
        int p = s.nextInt();

        // 処理番号のチェック
        if (p < 1 || p > 4) {
            System.out.println("入力エラー");
        }else {

        // 2つの数値の入力
        System.out.print("最初の数値を入力してください：");
        double num1 = s.nextDouble();
        System.out.print("次の数値を入力してください：");
        double num2 = s.nextDouble();
        s.close();
        // 計算と結果の表示
        double result = 0;
        switch (p) {
            case 1: // 足し算
                result = num1 + num2;
                System.out.println("結果：" + result);
                break;
            case 2: // 掛け算
                result = num1 * num2;
                System.out.println("結果：" + result);
                break;
            case 3: // 引き算
                result = num1 - num2;
                System.out.println("結果：" + result);
                break;
            case 4: // 割り算
                result = num1 / num2;
                System.out.println("結果：" + result);
                
        	}
        }
    }
}
