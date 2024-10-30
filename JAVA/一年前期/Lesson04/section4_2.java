//switch文を使用する
//
//月を1～12の整数値として読み込んで、それに対応する季節を表示するプログラム
//を作成しなさい。
//月はキーボードから入力する
//春：３～５

import java.util.Scanner;
public class section4_2 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("月を入力してください（1～12）：");
        int month = s.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春です");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏です");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋です");
                break;
            default:
            	 System.out.println("冬です");
        }

        s.close();
    }
}
