//double[]  Ａｔｂｌ１= { 1.2,1.8,3.5,4.2,8.0 };
//double[] Atbl２= { 1.2, 2.5, 3.2, 4.8, 5.1 };
//
//Bｔｂｌ[5]の配列を定義して
//Ａtbl1の値とＡtbl2の値を足した値をＢtblに代入する
//Ｂtblを表示する


public class Array01_5 {
	public static void main(String[] args) {
        // double型の配列を初期化
        double[] Atbl1 = { 1.2, 1.8, 3.5, 4.2, 8.0 };
        double[] Atbl2 = { 1.2, 2.5, 3.2, 4.8, 5.1 };

        // 配列を宣言
        double[] Btb1 = new double[5];

        // Atbl1とAtbl2要素の和をBtb1に代入
        for (int i = 0; i < Btb1.length; i++) {
            Btb1[i] = Atbl1[i] + Atbl2[i];
        }

        // Btb1配列の要素を表示
        for (int j = 0; j < Btb1.length; j++) {
            System.out.println("Btb1[" + j + "] = " + Btb1[j]);
        }
    }
}
