// アルゴリズム期末試験
// 問題4

public class arugo_mon04 {
    public static void main(String[] args) {
        int T = 1000; // 除算される数
        int W = 45;   // 除数
        int s = 0;    // 商を格納する変数
        int a = T;    // 余りを格納する変数、初期値はTで設定

        // 余りがW以上の間、ループを続ける
        while (a >= W) {
            a -= W;
            s++;
        }

        // 結果を出力
        System.out.println("商: " + s); 
        System.out.println("余り: " + a); 
    }
}
