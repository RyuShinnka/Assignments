import java.util.Scanner;
public class ensyu01_10 {
    public static void main(String[] args) {
        // 整数値を入力
        Scanner s = new Scanner(System.in);

        System.out.print("整数値を入力してください：");
        int num = s.nextInt();

        // 3の倍数である場合
        if (num % 3 == 0) {
            int result = (int) Math.pow(num, 4);
            System.out.println(num + " の4乗は " + result + " です。");
        } else {
            // それ以外の場合は終了メッセージ
            System.out.println("終了");
        }
        s.close();
    }
}
