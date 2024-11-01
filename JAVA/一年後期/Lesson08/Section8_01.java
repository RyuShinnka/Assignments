//メソッドの定義：メソッド名は任意とする。											
//	引数有り・戻り値有り										
//メソッドの処理内容											
//	最大値を返却する										
//	引数：３つの値										
//	戻り値：最大値										
//											
//メイン処理											
//	３人の身長・体重・年齢の最大値を求めて表示する										
//	３人分の身長・体重・年齢を代入する為の配列をそれぞれ用意する										
//	３人分のデータをキーボードからそれぞれの配列に入力する										
//	３人分の配列の値を引き渡して、メソッドの呼び出しを行い最大値を求め表示する。										



import java.util.Scanner;

public class Section8_01 {
    // 最大値を返すメソッド
	public static int max(int num1, int num2, int num3) {
        int max = num1; // 初期値としてnum1を設定
        
        if (num2 > max) {
            max = num2; // num2がmaxより大きければ更新
        }
        if (num3 > max) {
            max = num3; // num3がmaxより大きければ更新
        }
        
        return max; // 最大値を返す
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 3人分の身長・体重・年齢を格納する配列を作成
        int[] heights = new int[3];
        int[] weights = new int[3];
        int[] ages = new int[3];

        // 3人分のデータを入力
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "人目の身長を入力してください（cm）：");
            heights[i] = s.nextInt();
            System.out.println((i + 1) + "人目の体重を入力してください（kg）：");
            weights[i] = s.nextInt();
            System.out.println((i + 1) + "人目の年齢を入力してください（歳）：");
            ages[i] = s.nextInt();
        }

        // 各配列の最大値を求める
        int maxHeight = max(heights[0], heights[1], heights[2]);
        int maxWeight = max(weights[0], weights[1], weights[2]);
        int maxAge = max(ages[0], ages[1], ages[2]);

        // 最大値を表示
        System.out.println("最大身長：" + maxHeight + " cm");
        System.out.println("最大体重：" + maxWeight + " kg");
        System.out.println("最大年齢：" + maxAge + " 歳");

        s.close();
    }
}

