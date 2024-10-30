import java.util.Scanner;
public class ensyu01_04 {
    public static void main(String[] args) {
        // 数値を入力
        Scanner s = new Scanner(System.in);
        System.out.print("Xの値を入力＝＞");
        int X = s.nextInt();
        System.out.print("Yの値を入力＝＞");
        int Y = s.nextInt();
        System.out.print("Zの値を入力＝＞");
        int Z = s.nextInt();
        // 合計と平均を計算
        int sum = X + Y + Z;
        int avg = sum / 3;
        // 結果を表示
        System.out.println("X と Y と Zの合計:" + sum);
        System.out.println("X と Y と Zの平均:" + avg);
        s.close();
    }
}
