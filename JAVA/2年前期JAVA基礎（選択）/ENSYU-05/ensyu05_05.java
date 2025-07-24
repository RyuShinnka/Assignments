import java.util.Random;
import java.util.Scanner;
public class ensyu05_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); // ランダム生成器を作成
		// 2桁の正の整数（0〜99）を生成
		int numRand = 1 + rand.nextInt(9);
		System.out.println("★☆★☆《数当てゲーム》★☆★☆");
		int times = 1;
		while(times <= 5) {
			System.out.print("\n整数値（0～99）を入力＝＞");
			int num = sc.nextInt();
			
			if(num > numRand) {
				System.out.println("入力した値より小さいですよ。");
				System.out.println("入力できる回数：残り"+ (5 - times)+ "回です。");
			}else if(num < numRand){
				System.out.println("入力した値より大きいですよ。");
				System.out.println("入力できる回数：残り"+ (5 - times)+ "回です。");
			}else if(num == numRand){
				System.out.println("おめでとうございます！当てました！");
				System.out.println("乱数は："+ numRand+ "です。");
				times = 0;
				break;
			}else {
				System.out.println("入力エラー");
				System.out.println("");
			}
			times++;
		}
		if(times >= 5) {
			System.out.println("\n　＝＝＝ゲーム終了＝＝＝");
			System.out.println("残念、正解は："+ numRand+ "です。");
		}
		sc.close();
    }
}
