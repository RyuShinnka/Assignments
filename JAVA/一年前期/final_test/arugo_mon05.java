// アルゴリズム期末試験
// 問題5

public class arugo_mon05 {
    public static void main(String[] args) {
        int sum = 0;    // 合計値
        int count = 0;  // 4の倍数の数をカウント

        // 10から1000までの整数をループ
        for (int i = 10; i <= 1000; i++) {
            // 4の倍数かどうかをチェック
            if (i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        // 結果を出力
        System.out.println("4の倍数だけの合計値: " + sum);
        System.out.println("4の倍数だけの合計値の数: " + count);
    }
}
