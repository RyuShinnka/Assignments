import java.util.Scanner;

public class Section5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 整数値を入力
        System.out.print("整数値を入力してください: ");
        int num = scanner.nextInt();
        int d = 0;
        int temp = num;

        // 桁数を計算
        while (temp != 0) {
            temp /= 10;
            d++;
        }

        // 結果を表示
        System.out.println("桁数は" + d + "桁です。");
        scanner.close();
    }
}
