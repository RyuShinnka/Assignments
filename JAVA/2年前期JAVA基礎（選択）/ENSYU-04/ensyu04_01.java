import java.util.Scanner;

public class ensyu04_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3回繰り返す
        for (int i = 0; i < 3; i++) {
            System.out.print("整数値を入力＝＞");
            int num = sc.nextInt();

            // 入力値が正の場合
            if (num > 0) {
                System.out.println("その値は正です");
            }
            // 入力値が負の場合
            else if (num < 0) {
                System.out.println("その値は負です");
            }
            // 入力値が0の場合
            else {
                System.out.println("その値は０です");
            }
        }

        sc.close();
    }
}
