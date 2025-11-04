import java.util.Scanner;
public class Math_mon01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] clac_num = new int [5]; // 入力された整数を格納する配列

		// 整数を5回入力
		for(int i =0; i< clac_num.length;i++) {
			System.out.print((i+1)+"つ目の整数を入力＝＞");
			clac_num[i] = sc.nextInt();
		}

		double [] sqrt_num = new double [5]; // 平方根を格納する配列

		// 各整数の平方根を計算（負数は絶対値の平方根を求める）
		for(int i =0; i< clac_num.length;i++) {
			if(clac_num[i] < 0) {
				sqrt_num[i] = Math.sqrt(Math.abs(clac_num[i]));
			}else {
				sqrt_num[i] = Math.sqrt(clac_num[i]);
			}
		}

		System.out.println();

		// 平方根を出力
		for(int i =0; i< sqrt_num.length;i++) {
			System.out.println((i+1)+"つ目の整数の平方根は"+ sqrt_num[i]);
		}

		sc.close(); // Scannerを閉じる
	}
}
