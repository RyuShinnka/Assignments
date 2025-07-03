import java.util.Random;
public class ensyu03_12 {
	public static void main(String[] args) {
		Random rand = new Random(); // ランダム生成器を作成
		// 1桁の正の整数（0〜2）を生成
		int num = rand.nextInt(3);
		if(num ==0) {
			System.out.println("グー");
		}else if(num == 1){
			System.out.println("チョキ");
		}else {
			System.out.println("パー");
		}
	}
}
