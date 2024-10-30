//④	クラス名　Section2scn_4	
//	整数型の変数を３つ用意し、それぞれにキーボードから値を入力し、下記の演算を行い表示する。	
//		整数1+整数２＝
//		整数２－整数３＝
//		整数３×整数１＝
//		整数１÷整数２＝
import java.util.Scanner;

public class Section2scn_4 {
	public static void main(String[] args) {
		Scanner calculator = new Scanner(System.in);
		System.out.println("整数1を入力してください。");
		int num1 = calculator.nextInt();
		System.out.println("整数2を入力してください。");
		int num2 = calculator.nextInt();
		System.out.println("整数3を入力してください。");
		int num3 = calculator.nextInt();
		System.out.println("整数1=" + num1 + " 整数2=" + num2 + " 整数3=" + num3);
		int plus = num1 + num2;
		System.out.println("整数1+整数２＝" + plus);
		int mimus = num2 - num3;
		System.out.println("整数２－整数３＝" + mimus);
		int times = num3 * num1;
		System.out.println("整数３×整数１＝" + times);
		double division = num1 / num2;
		System.out.println("整数１÷整数２＝" + (int)division);
		calculator.close();
	}
}

//実行結果	「整数１を入力」	
//15	
//「整数２を入力」	
//6	
//「整数３を入力」	
//7	
//整数1=１５　　整数２＝６　　整数３＝７	
//整数1+整数２＝２１	
//整数２－整数３＝－１	
//整数３×整数１＝１０５	
//整数１÷整数２＝２	
