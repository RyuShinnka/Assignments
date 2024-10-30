// アルゴリズム期末試験
// 問題6
import java.util.Scanner;

public class arugo_mon06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int fee = 0;   // 入園料の合計
        int count = 0; // 4歳~18歳の人数をカウント

        // 1人目から5人目までループ
        for (int i = 1; i <= 5; i++) {
            System.out.print("第" + i + "人の年齢を入力してください＝＞");
            int age = s.nextInt();

            // 年齢に応じた入園料を計算
            if (age <= 3) {
                fee += 0;
            } else if (age <= 18) {
                fee += 800;
                count++;
            } else if (age <= 60) {
                fee += 1000;
            } else {
                fee += 300;
            }
        }

        // 出力
        System.out.println("入園料の合計値は：" + fee + "円です。");
        System.out.println("４歳から１８歳：" + count + "人です。");

        s.close();
    }
}
