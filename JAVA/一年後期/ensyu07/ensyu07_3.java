import java.util.Scanner;
public class ensyu07_3 {
    // 3つの整数の中央値を求める
    public static int med(int X, int Y, int Z) {
        int result;

        if ((X > Y && X < Z) || (X < Y && X > Z)) {
            result = X;
        } else if ((Y > X && Y < Z) || (Y < X && Y > Z)) {
            result = Y;
        } else {
            result = Z;
        }

        return result;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        // 各整数値を入力
        System.out.print("Xに代入したい整数を入力＝＞");
        int X = s.nextInt();
        System.out.print("Yに代入したい整数を入力＝＞");
        int Y = s.nextInt();
        System.out.print("Zに代入したい整数を入力＝＞");
        int Z = s.nextInt();

        // 中央値を求めて表示
        int result = med(X, Y, Z);
        System.out.println("X, Y, Zの中の中央値は：" + result);
        s.close();
    }
}
