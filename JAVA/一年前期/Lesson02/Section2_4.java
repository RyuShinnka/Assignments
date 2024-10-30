
public class Section2_4 {
	public static void main(String[] args) {
		double num1 = 3.9;
		int num2 = 9;
		int num3 = 11;
		double sum = num1 + num2 + num3;
		double hei = sum / 3;
		System.out.println("合計は" + sum + "平均は" + (sum / 3));
		System.out.println("平均は" + (int)hei);
		System.out.println("合計は" + (int)sum + "平均は" + (int)hei);
	}
}
