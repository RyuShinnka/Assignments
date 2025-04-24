import java.util.Scanner;

public class chapter03_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double goukei = 0;   // 合計点数
        double heikin = 0;   // 平均点数
        double tensuu = 0;   // 入力された点数
        int ninzuu = 0;      // 人数カウント（最大6人）

        // 6人分の点数を入力（while文）
        while (ninzuu < 6) {
            System.out.print((ninzuu + 1) + "人目の点数を入力＝＞");
            tensuu = s.nextDouble();   // 点数入力
            goukei += tensuu;          // 合計に加える
            ninzuu++;                  // カウントを進める
        }

        heikin = goukei / ninzuu;      // 平均計算

        // 結果出力
        System.out.println("六人の点数合計値は：" + goukei + "点");
        System.out.println("六人の点数平均値は：" + heikin + "点");

        s.close();
    }
}
