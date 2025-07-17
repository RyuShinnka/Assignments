import java.util.Scanner;
public class ensyu04_09 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 正の整数を入力
        System.out.print("正の整数を入力して => ");
        int n = sc.nextInt();

        int result = 1;

        // 1からnまでの積を計算
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        // 結果を表示
        System.out.println("1から" + n + "までの積は " + result + " です。");
        sc.close();
	}
}
