

//P-55


import java.util.Scanner;

public class List2_15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("あなたの名前は？");
		String name = in.next();
		System.out.println(name + "さん、こんにちは！");
		System.out.println("あなたの年齢は？");
		int age = in.nextInt();
		System.out.println(age + "歳です。");
		System.out.println("小数点付き実数＝＞");
		double fff = in.nextDouble();
		System.out.println("小数点付きの値は" + fff );
		in.close();
	}
}
