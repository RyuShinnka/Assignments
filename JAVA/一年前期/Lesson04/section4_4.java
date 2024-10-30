//論理演算子を使用する
//
//キーボードから入力された値（Ａ）を比較判定し、以下のように表示するプログラムを作成しなさい。
//
//Ａは２０以上で、35以下である時「正常値入力」と表示、それ以外は「入力エラー」と表示
//ただし、Ａが３０の時は、「取消の値です」と表示する
import java.util.Scanner;
public class section4_4 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("値を入力してください：");
        int A = s.nextInt();

        if (A >= 20 && A <= 35) {
            if (A == 30) {
                System.out.println("取消の値です");
            } else {
                System.out.println("正常値入力");
            }
        } else {
            System.out.println("入力エラー");
        }

        s.close();
    }
}
