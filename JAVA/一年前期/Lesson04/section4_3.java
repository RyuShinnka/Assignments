//入れ替え処理1
//
//3つの整数値を読み込んで昇順（小さい順）にソートするプログラムを作成しなさい。
//min1  min2  min3の変数に整数値（任意）を代入し、入替処理をして下記のように結果を表示する
//
//min１：１番小さい値
//min２：２番目に小さい値
//min３：３番目に小さい値

import java.util.Scanner;

public class section4_3 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 整数値の入力
        System.out.print("整数値1を入力してください：");
        int num1 = s.nextInt();

        System.out.print("整数値2を入力してください：");
        int num2 = s.nextInt();

        System.out.print("整数値3を入力してください：");
        int num3 = s.nextInt();

        // 入れ替え処理
        int temp;

        if (num2 < num1) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num3 < num1) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // 結果の表示
        System.out.println("min1：" + num1);
        System.out.println("min2：" + num2);
        System.out.println("min3：" + num3);

        s.close();
    }
}
