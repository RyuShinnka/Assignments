import java.util.Scanner;
public class ensyu07_2 {
    // 3つの整数の中から最小値を求める
    public static int min(int A, int B, int C) {
        int result;
        if (A < B && A < C) {
            result = A;
        } else if (B < A && B < C) {
            result = B;
        } else {
            result = C;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        // 各整数値を入力
        System.out.print("Aに代入したい整数を入力＝＞");
        int A = s.nextInt();
        System.out.print("Bに代入したい整数を入力＝＞");
        int B = s.nextInt();
        System.out.print("Cに代入したい整数を入力＝＞");
        int C = s.nextInt();

        // 最小値を求めて表示
        int result = min(A, B, C);
        System.out.println("A, B, Cの中の最小値は：" + result);
        s.close();
    }
}
