import java.util.Scanner;
public class Section6_1 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1;

        // 無限ループで 入力した値を繰り返し求める
        while (true) {
            System.out.print("正の整数値を入力してください: ");
            num1 = s.nextInt();

            // 入力された値が正の整数かどうかを確認
            if (num1 >= 0) {
                // カウントダウンを表示
                for (int i = num1; i >= 0; i--) {
                    System.out.println(i);
                }
                break; // カウントダウンが完了したらループを抜ける
            } else {
                System.out.println("入力エラー: 正の整数値を入力してください。");
            }
        }

        s.close(); 
    }
}
