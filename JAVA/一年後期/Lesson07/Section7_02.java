import java.util.Scanner;

public class Section7_02 {
    public static int uriagefun(int TBL[],int kingaku) {
        int sum = 0; // 合計金額を初期化
        for (int i = 0; i < TBL.length; i++) {
            sum += TBL[i]; // 各要素を合計
        }
        System.out.println("合計額は" + sum + "です。");
        // 達成率の計算
        double result = ((double) sum / kingaku) * 100; 
        return (int) result; // 結果を返す
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int[] Dtbl = new int[5];
        for (int i = 0; i < Dtbl.length; i++) {
            System.out.print("６か月分の売り上げを入力=> ");
            Dtbl[i] = s.nextInt(); // 目標金額を入力
        }
        System.out.print("目標金額を入力=> ");
        int kingaku = s.nextInt();

        // 達成率を計算
        int result = uriagefun(Dtbl,kingaku);
        System.out.println("達成率は" + result + "％です。");

        // 達成率に基づいたメッセージ
        if (result >= 100) {
            System.out.println("目標達成！");
        } else if (result < 100 && result >= 80) {
            System.out.println("もう少しですね");
        } else {
            System.out.println("後半に頑張りましょう");
        }

        s.close(); 
    }
}