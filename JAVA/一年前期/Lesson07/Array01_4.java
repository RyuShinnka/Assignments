//double型配列名：Ａｔｂｌ「5]
//double[] Atbl= { 1.2, 2.5, 3.2, 4.8, 5.1 };
//Atblを後ろから表示しましょう。


public class Array01_4 {
	public static void main(String[] args) {
        // double型の配列を初期化
        double[] Atbl = {
            1.2, 2.5, 3.2, 4.8, 5.1
        };

        // 配列の要素を逆順に表示
        for (int i = Atbl.length - 1; i >= 0; i--) {
            System.out.println("Atbl[" + i + "] = " + Atbl[i]);
        }
    }
}
