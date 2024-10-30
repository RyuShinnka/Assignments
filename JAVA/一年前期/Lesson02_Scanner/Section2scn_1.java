import java.util.Scanner;
public class Section2scn_1 {
	public static void main(String[] args) {
		Scanner xb = new Scanner(System.in);
		System.out.println("整数を入力してください：");
		int num1 = xb.nextInt();
		System.out.println("入力した整数は：" + num1 + "です。");
		System.out.println("小数点数を入力してください：");
		double num2 = xb.nextDouble();
		System.out.println("入力した小数点数は：" + num2 + "です。");
		System.out.println("文字列を入力してください：");
		String name = xb.next();
		System.out.println("入力した文字列は："+ name + "です。");
		xb.close();
	}
}
