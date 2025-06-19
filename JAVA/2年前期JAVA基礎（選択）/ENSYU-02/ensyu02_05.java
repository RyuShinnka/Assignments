import java.util.Random;

public class ensyu02_05 {
	public static void main(String[] args) {
		Random rand = new Random(); 
		// 1桁の正の整数（0〜9）を生成
		int num1 = rand.nextInt(10);
		System.out.println("今日のラッキーナンバーは" + num1+ "番です。");

	}
}
