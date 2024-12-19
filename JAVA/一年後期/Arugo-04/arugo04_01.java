import java.util.Scanner;

public class arugo04_01 {

    public static void main(String[] args) {
        // キーボードから人数を入力
        Scanner s = new Scanner(System.in);
        System.out.print("人数を入力=>");
        int N = s.nextInt(); // 配列の要素数を定義

        // 配列の初期化
        int[] table = new int[N];

        // 出席番号を入力
        System.out.println("出席番号を入力してください:");
        for (int i = 0; i < N; i++) {
            System.out.print("出席番号 " + (i + 1) + ": ");
            table[i] = s.nextInt();
        }

        // 単純選択法で昇順ソート
        for (int i = 0; i < table.length - 1; i++) {
            int minIndex = i; // 最小値のインデックスを記録
            for (int j = i + 1; j < table.length; j++) {
                if (table[j] < table[minIndex]) {
                    minIndex = j; // より小さい値が見つかれば更新
                }
            }
            // 最小値と現在の位置を交換
            int temp = table[i];
            table[i] = table[minIndex];
            table[minIndex] = temp;
        }

        // ソート後の配列を表示
        System.out.print("昇順ソート結果: ");
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }
    }
}
