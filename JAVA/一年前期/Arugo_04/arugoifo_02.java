//	分岐処理応用　問題2
//商品の単価と数量をキーボードから入力し、単価が10,000円以上であり数量が5,000個以上の場合は、30％引きです。単価が10,000円未満の時は、20％引きです。数量が5,000個未満の時も20％引きです。
//単価が10,000円未満であり数量が5,000個未満の時は、割引無の金額となります。
//割引した金額を表示しましょう。


import java.util.Scanner;
public class arugoifo_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dj,sl;
		double result;
//		商品の単価を入力
        System.out.print("商品の単価を入力してください：");
		dj=s.nextInt();
//		商品の数量を入力
		System.out.print("商品の数量を入力してください：");
		sl=s.nextInt();

		s.close();
		
		// 割引計算
        if (dj >= 10000 && sl >= 5000) {
            result = dj * sl * 0.7; // 30%引き
            System.out.print("金額は：" + result);
        } else if (dj >= 10000 || sl >= 5000) {
            result = dj * sl * 0.8; // 20%引き
            System.out.print("金額は：" + result);
        } else {
            result = dj * sl; // 割引なし
            System.out.print("金額は：" + result);
        }
	}
}
