import java.util.Random;

public class ensyu02_01 {
	public static void main(String[] args) {
		Random rand = new Random(); // ランダム生成器を作成
		// 1桁の正の整数（1〜9）を生成
		int num1 = 1 + rand.nextInt(9);
		System.out.println("1桁の正の整数値をランダムに生成：" + num1);
		// 1桁の負の整数（-9〜-1）を生成
		int num2 = -9 + rand.nextInt(9);
		System.out.println("1桁の負の整数値をランダムに生成：" + num2);
		// 2桁の正の整数（10〜99）を生成
		int num3 = 10 + rand.nextInt(90);
		System.out.println("2桁の正の整数値をランダムに生成：" + num3);
	}
}
