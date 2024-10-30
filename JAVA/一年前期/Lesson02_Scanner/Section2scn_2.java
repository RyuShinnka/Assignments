//
//②	クラス名　Section2scn_２				
//	キーボードからデータ（1500）を入力し、次のように表示する。				
//実行結果	「データを入力してください。」				
//	1500				
//	「入力した整数値は１５００ですね。」				

import java.util.Scanner;

public class Section2scn_2 {
	public static void main(String[] args) {
		Scanner nb = new Scanner(System.in);
		System.out.println("データを入力してください。");
		int data = nb.nextInt();
		System.out.println("入力した整数値は" + data + "ですね。");
		nb.close();
	}
}
