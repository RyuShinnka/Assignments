public class arugo03_03 {

    public static void main(String[] args) {
        // 配列TBLの初期化
        int[] TBL = {20, 60, 33, 45, 95, 71, 25, 88, 66, 57};

        // 降順ソート（逐次決定法）
        for (int i = 0; i < TBL.length - 1; i++) {
            int maxIndex = i; // 最大値のインデックスを記録
            for (int j = i + 1; j < TBL.length; j++) {
                if (TBL[j] > TBL[maxIndex]) {
                    maxIndex = j; // より大きい値が見つかれば更新
                }
            }
            // 最大値と現在の位置を交換
            int temp = TBL[i];
            TBL[i] = TBL[maxIndex];
            TBL[maxIndex] = temp;
        }

        // ソート後の配列を表示
        System.out.print("降順ソート結果: ");
        for (int i = 0; i < TBL.length; i++) {
            System.out.print(TBL[i] + " ");
        }
    }
}
