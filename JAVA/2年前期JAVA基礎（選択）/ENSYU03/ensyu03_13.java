import java.util.Random;
import java.util.Scanner;
public class ensyu03_13 {
	public static void main(String[] args) {
		Random rand = new Random(); // ランダム生成器を作成
		Scanner sc = new Scanner(System.in);
		System.out.println("じゃんけんゲームをしましょう！");
		
		
		int count = 0;
		int player = 0;
		int computer = 0;
		while(true) {
			if(count != 0) {
				System.out.println();
				System.out.println("＝＝＝＝＝＝今までの勝敗結果＝＝＝＝＝＝");
				System.out.println("あなたの勝ち数："+ player);
				System.out.println("パソコンの勝ち数："+ computer);
				if(player >=3) {
					System.out.println("ゲーム終了！");
					System.out.println("おめでとうございます！あなたの勝ちです！");
					break;
				}else if(computer >=3){
					System.out.println("ゲーム終了！");
					System.out.println("残念です。パソコンの勝ちです。");
					break;
				}
			}
			System.out.println();
			System.out.print("0(グー),1(チョキ),2(パー)、いずれか入力して=>");
			int input = sc.nextInt();
			
			// 1桁の正の整数（0〜2）を生成
			int rand_input = rand.nextInt(3);
			
			if(input == 0 && rand_input == 1) {
				System.out.println();
				System.out.println("あなたの0(グー)の勝ちです！");
				player++;
			}else if(input == 0 && rand_input == 2) {
				System.out.println();
				System.out.println("パソコンの2(パー)の勝ちです。");
				computer++;
			}else if(input == 1 && rand_input == 0) {
				System.out.println();
				System.out.println("パソコンの0(グー)の勝ちです。");
				computer++;
			}else if(input == 1 && rand_input == 2) {
				System.out.println();
				System.out.println("あなたの1(チョキ)の勝ちです！");
				player++;
			}else if(input == 2 && rand_input == 0) {
				System.out.println();
				System.out.println("あなたの2(パー)の勝ちです！");
				player++;
			}else if(input == 2 && rand_input == 1) {
				System.out.println();
				System.out.println("パソコンの1(チョキ)の勝ちです。");
				computer++;
			}else {
				System.out.println();
				System.out.println("★☆★あいこです★☆★");
			}
			
			count++;
		}
		sc.close();
		
		
		
	}
}