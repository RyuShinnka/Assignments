import java.util.Scanner;

public class ensyu04_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("カウントダウンしましょう！");

        System.out.print("正の整数を入力=>");
        int num = sc.nextInt();

        // 無限ループで正の数が入力されるまで繰り返す
        while (true) {
            if (num > 0) {
                // 正の整数のとき、カウントダウンを実行
                System.out.print(num);
                num--;
            } else if (num == 0) {
                // 0 になったら表示して終了
                System.out.print(num);
                break;
            } else {
                // 負の整数のとき、再入力を促す
                System.out.print("負の整数値ですので再入力して=>");
                num = sc.nextInt();
            }
        }

        sc.close();
    }
}
