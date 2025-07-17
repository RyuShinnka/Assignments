import java.util.Random;
import java.util.Scanner;
public class ensyu04_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); // ランダム生成器を作成
		// 2桁の正の整数（10〜99）を生成
		int numRand = 10 + rand.nextInt(90);
		System.out.println("★☆★☆《数当てゲーム》★☆★☆");
		
		while(true) {
			System.out.print("整数値（10～99）を入力＝＞");
			int num = sc.nextInt();
			
			if(num > numRand) {
				System.out.println("入力した値より小さいですよ。");
			}else if(num < numRand){
				System.out.println("入力した値より大きいですよ。");
			}else if(num == numRand){
				System.out.println("おめでとうございます！当てました！");
				System.out.println("乱数は："+ numRand+ "です。");
				break;
			}else {
				System.out.println("入力エラー");
				System.out.println("");
			}
		}
		sc.close();
		
	}
}
