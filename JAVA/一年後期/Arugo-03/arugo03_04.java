public class arugo03_04 {

    public static void main(String[] args) {
        // 配列TBLの初期化
        int[] TBL = {20, 60, 33, 45, 95, 71, 25, 88, 66, 57};

        // 昇順ソート（隣接交換法 - バブルソート）
        for (int i = 0; i < TBL.length - 1; i++) {
            for (int j = 0; j < TBL.length - 1 - i; j++) {
                if (TBL[j] > TBL[j + 1]) {
                    // 隣接要素を交換
                    int temp = TBL[j];
                    TBL[j] = TBL[j + 1];
                    TBL[j + 1] = temp;
                }
            }
        }

        // ソート後の配列を表示（従来のforループ使用）
        System.out.print("昇順ソート結果: ");
        for (int i = 0; i < TBL.length; i++) {
            System.out.print(TBL[i] + " ");
        }
    }
}
