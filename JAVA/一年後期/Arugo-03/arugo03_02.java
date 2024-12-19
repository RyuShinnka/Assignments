import java.util.Scanner;

public class arugo03_02 {

    public static void main(String[] args) {
        // 配列TBLの初期化
        int[] TBL = {20, 25, 33, 45, 57, 60, 66, 71, 88, 95};

        // キーボードから検索キーを入力
        Scanner s = new Scanner(System.in);
        System.out.print("検索キーを入力=> ");
        int Y = s.nextInt();

        // 二分検索法の実行
        int left = 0; // 左端
        int right = TBL.length - 1; // 右端
        boolean found = false; // 検索結果フラグ

        while (left <= right) {
            int mid = (left + right) / 2; // 中央インデックス
            if (TBL[mid] == Y) {
                System.out.println("検索キーあり：TBLの" + (mid + 1) + "番目");
                found = true;
                break; // 見つかったら終了
            } else if (TBL[mid] < Y) {
                left = mid + 1; // 探索範囲を右側に絞る
            } else {
                right = mid - 1; // 探索範囲を左側に絞る
            }
        }

        if (!found) {
            System.out.println("検索キーなし");
        }
    }
}
