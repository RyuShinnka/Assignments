import java.util.Scanner;
public class ensyu01_05 {
    public static void main(String[] args) {
        // 数値を入力
        Scanner s = new Scanner(System.in);
        System.out.print("Aの値を入力＝＞");
        double A = s.nextDouble();
        System.out.print("Bの値を入力＝＞");
        double B = s.nextDouble();
        // 合計と平均を計算
        double sum = A + B;
        double avg = sum / 2;
        // 結果を表示
        System.out.println("A と B の合計:" + sum);
        System.out.println("A と B の平均:" + avg);
        s.close();
    }
}
