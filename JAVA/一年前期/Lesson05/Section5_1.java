import java.util.Scanner;

public class Section5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 初めの数値と終わりの数値を入力します
        System.out.println("初めの数値は終わりの数値より小さい値を入力してください。");
        System.out.print("初めの数値を入力してください: ");
        int num1 = scanner.nextInt();
        System.out.print("終わりの数値を入力してください: ");
        int num2 = scanner.nextInt();
        int sum = 0;
        int count = 0;

        // 合計と数を計算します
        for (int i = num1; i <= num2; i++) {
            sum += i;
            count++;
        }

        // 平均を計算します
        double average = (double) sum / count;

        // 結果を表示します
        System.out.println("合計: " + sum);
        System.out.println("平均: " + average);
        scanner.close();
    }
}
