import java.util.Scanner;
public class ensyu04_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("正の整数を入力して => ");
        int n = sc.nextInt();
        // 変数sumを初期化
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        // 表示する
        System.out.println("1から" + n + "までの和は" + sum + "です。");
        sc.close();
    }
}
