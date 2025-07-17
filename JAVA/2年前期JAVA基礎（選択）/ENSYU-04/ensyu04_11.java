import java.util.Scanner;
public class ensyu04_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("正の整数を入力して => ");
        int n = sc.nextInt();

        int sum = 0;

        // 1からnまでの和を求め、加算式を表示
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (i < n) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i); // 最後の + を表示しない
            }
        }

        // 結果表示
        System.out.println(" = +" + sum);
        sc.close();
    }
}
