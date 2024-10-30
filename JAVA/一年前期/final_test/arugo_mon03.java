// アルゴリズム期末試験
// 問題3
import java.util.Scanner;

public class arugo_mon03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 商品の数量を入力
        System.out.print("商品の数量を入力してください＝＞");
        int sl = s.nextInt(); 
        
        // 商品の単価を入力
        System.out.print("商品の単価を入力してください＝＞");
        int dk = s.nextInt(); 
        
        // 合計金額を計算
        int sum = sl * dk;

        // 割引の条件をチェック
        if (sl >= 100 && dk >= 50000) {
            sum *= 0.9; // 1割引
            System.out.println("金額は：" + sum);
        } else {
            System.out.println("金額は：" + sum); 
        }
        s.close();
    }
}
