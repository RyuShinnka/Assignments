import java.util.Scanner;

public class ensyu04_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 正の整数を入力
        System.out.print("正の整数を入力して => ");
        int num = sc.nextInt();

        int count = 0;

        // 桁数をカウントする
        while (num > 0) {
            num = num / 10;
            count++;
        }

        // 結果を出力
        System.out.println("その数は " + count + " 桁です。");

        sc.close();
    }
}
