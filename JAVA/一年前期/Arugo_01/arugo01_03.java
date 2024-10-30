/* 春名さんのフローチャート */
import java.util.Scanner;
public class arugo01_03 {
//	public static void main(String[] args) {
//		char M1 = 'A';
//		char M2 = 'B';
//		char M3 = 'C';
//		char M4 = 'D';
//		char M5 = 'E';
//		char W = M1;
//		M1 = M2;
//		M2 = M4;
//		M4 = M5;
//		M5 = W;
//		M4 = M1;
//		M2 = M4;
//		M1 = M2;
//		System.out.println(M1);
//		System.out.println(M2);
//		System.out.println(M3);
//		System.out.println(M4);
//		System.out.println(M5);
//	}
	
	//以下は自分のプログラミングした

//	問題３
//	単価と数量をキーボードから入力し、金額を計算します。消費税
//	10 ％を加えて税込み額を表示しましょう。
	public static void main(String[] args) {
		Scanner price = new Scanner(System.in);
		System.out.println("商品の単価を入力してください。（円）");
		int dj = price.nextInt();
		System.out.println("商品の数量を入力してください。（個）");
		int sl = price.nextInt();
		int sq = dj*sl;
		System.out.println("税抜きの総額は：" + sq );
		double sh = sq * 0.1 + sq ;
		System.out.println("税込み（10％）の総額は：" + sh );
		price.close();
	}

}
