import java.util.Scanner;

public class ensyu04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 無限ループで100～999の整数が入力されるまで繰り返す
        while (true) {
            System.out.print("整数値(100～999)を入力＝＞");
            int num = sc.nextInt();

            // 入力値が100以上999以下のとき
            if (num >= 100 && num <= 999) {
                System.out.println(num + "が入力されましたと表示する");
                break; 
            } else {
                // 範囲外のときエラーメッセージを表示
                System.out.println("入力エラー");
                System.out.println(""); 
            }
        }

        sc.close();
    }
}
