public class arugo04_02 {

    public static void main(String[] args) {
        // 配列arryの初期化（ランダムな値を設定）
        int[] arry = {45, 12, 78, 34, 89, 23, 56, 67, 90, 15};

        // バブルソートで降順ソート
        for (int i = 0; i < arry.length - 1; i++) {
            for (int j = 0; j < arry.length - 1 - i; j++) {
                if (arry[j] < arry[j + 1]) {
                    // 隣接要素を交換
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                }
            }
        }

        // ソート後の配列を表示
        System.out.print("降順ソート結果: ");
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
    }
}
