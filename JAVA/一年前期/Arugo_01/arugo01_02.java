/* アキラさんのフローチャート */
public class arugo01_02 {
//	public static void main(String[] args) {
//		int A = 5;
//		int B = 6;
//		int C = 20;
//		int D = 45;
//		int E = 30;
//		int F = 10;
//		int G = 2;
//		int ans = B + A;
//		ans = C * ans;
//		ans = A / D + ans;
//		ans = G / F + E - ans;
//		System.out.println(ans);
//		
//	}
	
	//以下は自分のプログラミングした
//	
//	問題２
//	次の計算を１処理１計算として計算結果を表示しましょう。
//	計算の優先順位を考えて順に行います。
//	計算結果を変数に代入していきます。
//	計算式：
//	（5+6)*20+45/5-(30+10/2)
	public static void main(String[] args) {
		int s1 = 5;
		int s2 = 6;
		int s3 = 20;
		int s4 = 45;
		int s5 = 30;
		int s6 = 10;
		int s7 = 2;
		int ans1 = 0;
		int ans2 = 0;
		int ans3 = 0;
		ans1 = s1 + s2;
		System.out.println(ans1);
		ans2 = s6 / s7;
		System.out.println(ans2);
		ans2 = ans2 + s5;
		System.out.println(ans2);
		ans1 = ans1 * s3;
		System.out.println(ans1);
		ans3 = s4 / s1;
		System.out.println(ans3);
		ans1 = ans1 + ans3;
		System.out.println(ans1);
		ans1 = ans1 - ans2;
		System.out.println(ans1);
		
	}
}

