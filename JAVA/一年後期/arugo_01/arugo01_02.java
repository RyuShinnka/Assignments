//配列問題２
//配列型：Arrye[10]があります。
//キーボードから値を入力しArrye[　]の０番地から値を代入していきます。
//ただし、入力された値が1から100以外の値は、Arrye[　]には代入しません。
//Arrye［　］に値が全て代入されたら、配列の値を表示します。
import java.util.Scanner;
public class arugo01_02 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int [] arrye= new int [10];
		int i =0;
		while(i < arrye.length) {
			System.out.print("1から100入力(それ以外の値は代入しません)");
			int num = s.nextInt();
			// 1から100の範囲であるかを確認
            if (num >= 1 && num <= 100) {
                arrye[i] = num;  // 値を配列に代入
                i++;  // 次の配列位置へ
            } else {
                System.out.println("入力された値が1から100以外の値は代入しません");
            }
		}
		// 配列の値を表示
        System.out.print("Arrye[10] = [");
        for (int j = 0; j < arrye.length; j++) {
            System.out.print(arrye[j]);
            if (j < arrye.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
		s.close();
	}
}
