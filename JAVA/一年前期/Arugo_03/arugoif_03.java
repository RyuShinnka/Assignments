import java.util.Scanner;
public class arugoif_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("商品の単価を入力してください");
		double sp = s.nextDouble();//商品の単価
		System.out.println("商品の数量を入力してください");
		double dj = s.nextDouble();//商品の数量
		double jg;//金額
		double zh;//2割きした金額
		jg = sp * dj;
		if(jg >= 10000) {
			zh = jg * 0.8;
			System.out.println("2割きした金額は：" + (int)zh + "円");
		}else {
			System.out.println("金額は：" + (int)jg + "円");
		}
		s.close();
	}
}
