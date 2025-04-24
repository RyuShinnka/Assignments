import java.util.Scanner;

public class chapter03_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double total = 0; // 合計点
        double avg = 0;   // 平均点
        double score = 0; // 入力された点数
        int count = 0; // 人数カウント

        // 6人分の点数を入力
        for (int i = 0; i < 6; i++) {
            System.out.print((i + 1) + "人目の点数を入力=>");
            score = s.nextDouble();     // 点数を入力
            total += score;          // 合計に加算
            count++;                 // 人数カウントを増加
        }

        // 平均を計算（整数で切り捨て）
        avg = total / count;

        // 合計と平均を表示
        System.out.println("六人の点数合計値は：" + total);
        System.out.println("六人の点数平均値は：" + avg);

        // Scannerを閉じる
        s.close();
    }
}
