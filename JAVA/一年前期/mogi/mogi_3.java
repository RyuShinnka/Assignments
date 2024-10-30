import java.util.Scanner;

public class mogi_3 {
    public static void main(String[] args) {
        // Scannerを作成
        Scanner s = new Scanner(System.in);
        
        // 円周率の値を定義
        double pi = 3.14;
        // 計算結果を格納する変数
        double result;
        // 入力値を格納する変数
        double num1, num2;
        
        System.out.println("処理番号を入力=>");
        // 処理番号を入力
        int num = s.nextInt();
        
        // 番号に従って各処理を行い
        switch (num) {
            case 1:
                // 円の面積を求める場合
                System.out.print("円の面積を求める,円の半径を入力してください＝＞");
                // 円の半径を入力
                num1 = s.nextDouble();
                // 円の面積を計算する (面積 = 半径 × 半径 × 円周率
                result = num1 * num1 * pi;
                // 結果を表示
                System.out.println("円の面積は" + result);
                break;
                
            case 2:
                // 円柱の体積を求める場合
                System.out.print("円の体積を求める,円の半径を入力してください＝＞");
                // 円の半径を入力
                num1 = s.nextDouble();
                // 円柱の高さを入力
                System.out.print("円の高さを入力してください＝＞");
                num2 = s.nextDouble();
                // 円柱の体積を計算する (体積 = 半径×半径×円周率×高さ)
                result = num1 * num1 * pi * num2;
                // 結果を表示
                System.out.println("円の体積は" + result);
                break;
                
            case 3:
                // 三角形の面積を求める場合
                System.out.print("三角形の面積を求める,三角形の底辺を入力してください＝＞");
                // 三角形の底辺を入力
                num1 = s.nextDouble();
                // 三角形の高さを入力
                System.out.print("三角形の高さ＝＞");
                num2 = s.nextDouble();
                // 三角形の面積を計算する (面積 = 底辺 × 高さ ÷ 2)
                result = num1 * num2 / 2;
                // 結果を表示
                System.out.println("三角形の面積は" + result);
                break;
                
            case 4:
                // ひし形の面積を求める場合
                System.out.print("ひし形の面積を求める,ひし形の対角線を入力してください＝＞");
                // ひし形の対角線を入力
                num1 = s.nextDouble();
                // ひし形の面積を計算する (面積 = 対角線 × 対角線 ÷ 2)
                result = num1 * num1 / 2;
                // 結果を表示
                System.out.println("ひし形の面積は" + result);
                break;
                
            default:
                // １～4以外「入力番号エラー」と表示する
                System.out.print("入力番号エラー");
        }
        s.close();
    }
}
