import java.util.Scanner;

public class arugo04_04 {

    public static void main(String[] args) {
        // 昇順にソートされた商品データ
        int[] array = {1000, 1200, 1350, 1351, 2000, 2025, 2500, 3000, 3500, 3501};

        // 商品NOをキーボードから入力
        Scanner s = new Scanner(System.in);
        System.out.print("商品NOを入力してください: ");
        int num = s.nextInt();

        // 二分探索法
        int left = 0; // 左端
        int right = array.length - 1; // 右端
        int idx = -1;
        int index = 0;
        s.close();
        while (left <= right && idx == -1) {
            int mid = (left + right) / 2; // 中央のインデックス
            if (num == array[mid]) {
            	index = mid;
                idx = array[mid];
            } else if (num > array[mid]) {
                left = mid + 1; // 探索範囲を右側に絞る
            } else {
                right = mid - 1; // 探索範囲を左側に絞る
            }
        }

        if (idx == -1) {
            System.out.println("入力エラー");
        }else {
        	System.out.println("商品NOの番地（添え字）: " + index);
        }
    }
}