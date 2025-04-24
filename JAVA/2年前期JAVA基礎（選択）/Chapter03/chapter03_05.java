import java.util.Scanner;

public class chapter03_05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double total = 0;  // 合計点
        double avg = 0;    // 平均点
        double score = 0;  // 入力された点数
        int count = 0;     // 入力人数のカウント

        // do-while文を使って6人分の点数を入力
        do {
            System.out.print((count + 1) + "人目の点数を入力=>");
            score = s.nextDouble();  // 点数を入力
            total += score;          // 合計に加算
            count++;                 // カウントを1増やす
        } while (count < 6);

        // 平均点を計算
        avg = total / count;

        // 合計点と平均点を表示
        System.out.println("六人の点数合計値は：" + total);
        System.out.println("六人の点数平均値は：" + avg);

        // Scannerを閉じる
        s.close();
    }
}
