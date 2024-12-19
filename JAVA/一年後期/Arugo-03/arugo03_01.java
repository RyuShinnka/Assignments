import java.util.Scanner;
public class arugo03_01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 配列TBLの作成
        int[] TBL = {20,60,33,45,95,71,25,88,66,57};


        // 検索キーYを入力
        System.out.print("探索キーを入力＝＞");
        int Y = s.nextInt();

        // シーケンシャルサーチの実行
        boolean found = false; // 検索結果フラグ
        for (int i = 0; i < TBL.length; i++) {
            if (TBL[i] == Y) {
                System.out.println("検索キーあり：TBLの" + (i + 1) + "番目");
                found = true;
                break; // 見つかったら終了
            }
        }

        if (!found) {
            System.out.println("検索キーなし");
        }
    }
}
