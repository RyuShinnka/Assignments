public class mon_01 {
    public static void main(String[] args) {
        // 配列TBLを初期化
        int[] TBL = {100, 95, 23, 45, 87, 63, 10, 40, 60, 85};

        // 合計値を求める
        int sum = 0;
        for (int i = 0; i < TBL.length; i++) {
            sum += TBL[i];
        }

        // 平均値を求める
        double average = sum / (double) TBL.length;

        // 最大値と最小値を求める
        int max = TBL[0];
        int min = TBL[0];
        for (int value : TBL) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        // 結果を表示
        System.out.println("配列 TBL の値: ");
        for (int value : TBL) {
            System.out.print(value + " ");
        }
        System.out.println("\n合計値: " + sum);
        System.out.println("平均値: " + average);
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
    }
}
