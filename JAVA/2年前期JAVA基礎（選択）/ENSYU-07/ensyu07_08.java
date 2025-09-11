import java.util.Random;
import java.util.Scanner;

public class ensyu07_08 {
    // A以上B以下の乱数を返すメソッド
    static int random(int A, int B) {
        if (A > B) {
            System.out.println("乱数表示できません");
            return -1; // エラー値として -1 を返す
        }

        Random rand = new Random();
        return rand.nextInt(B - A + 1) + A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n＝＝乱数を表示します＝＝\n");
        System.out.print("Aの値を入力 ＝＞ ");
        int A = sc.nextInt();

        System.out.print("Bの値を入力 ＝＞ ");
        int B = sc.nextInt();

        int result = random(A, B);

        // 有効な乱数の場合のみ表示
        if (result != -1) {
            System.out.println("生成された乱数＝＞" + result);
        }

        sc.close();
    }
}
