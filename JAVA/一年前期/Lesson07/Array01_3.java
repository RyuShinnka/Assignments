//配列の代入配列データのコピー		
//ｉｎｔ型	配列名：Ａｔｂｌ[5]	
//ｉｎｔ型	配列名：Ｂｔｂｌ[5]	
//配列名：Ａｔｂｌ[5]には、キーボードから値を代入していきます
//Atblの値をBtblに代入する。
//
//二つの配列の値を表示します。


import java.util.Scanner;
public class Array01_3 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 配列の宣言と初期化
        int[] Atbl = new int[5];
        int[] Btbl = new int[5];
        // Atbl配列の要素をキーボードから入力
        for (int i = 0; i < Atbl.length; i++) {
            System.out.print("Atbl[" + i + "]の値の入力:");
            Atbl[i] = s.nextInt();
        }

        // Atbl配列の値をBtbl配列にコピー
        for (int i = 0; i < Btbl.length; i++) {
            Btbl[i] = Atbl[i];
        }

        // Atbl配列の要素を表示
        System.out.println("Atbl配列の要素:");
        for (int x = 0; x < Atbl.length; x++) {
            System.out.println("Atbl[" + x + "] = " + Atbl[x]);
        }

        // 区切り線を表示
        System.out.println("～～～～～～～～～");

        // Btbl配列の要素を表示
        System.out.println("Btbl配列の要素:");
        for (int y = 0; y < Btbl.length; y++) {
            System.out.println("Btbl[" + y + "] = " + Btbl[y]);
        }
        s.close();
    }
}
