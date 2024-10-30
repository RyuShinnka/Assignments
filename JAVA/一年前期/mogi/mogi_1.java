import java.util.Scanner;

public class mogi_1 {
    public static void main(String[] args) {
        // Scannerを作成
        Scanner s = new Scanner(System.in);
        
        // 学科名を入力
        System.out.println("あなたの学科名は？");
        String gakka_name = s.next();  

        // 氏名を入力
        System.out.println("あなたの氏名は？");
        String name = s.next(); 

        // 国語の点数を入力
        System.out.println("あなたの国語の点数を入力してください");
        int gtest = s.nextInt();  

        // 数学の点数を入力
        System.out.println("あなたの数学の点数を入力してください");
        int stest = s.nextInt();  
        
        //英語の点数を入力
        System.out.println("あなたの英語の点数を入力してください");
        int etest = s.nextInt();  

        // 3教科の合計点を計算する
        int sumtest = gtest + stest + etest;

        // 3教科の平均点を計算する
        double avgtest = sumtest / 3.0;  
        
        // 成績評価を格納する変数
        String hyouka;

        // 平均点に基づいて成績評価を決定する
        if (avgtest >= 80) {
            hyouka = "優";
        } else if (avgtest >= 60) {
            hyouka = "良";
        } else if (avgtest >= 40) {
            hyouka = "可";
        } else {
            hyouka = "不可";
        }

        // 結果を画面に表示する
        System.out.println("３教科の合計点は、" + sumtest + "点・平均点は、" + avgtest + "点です。\n"
                + gakka_name + "学科の" + name + "さんの成績評価は。" + hyouka + "です。");

        
        s.close();
    }
}
