import java.util.Scanner;
class scores{
	int java;
	int py;
	int arugo;
}

public class List05_Mon01 {
	static void keisan(int num1,int num2,int num3) {
		int sum = num1+num2+num3;
		int avg = sum /3;
		System.out.println("3教科の合計は："+sum);
		System.out.println("3教科の平均は："+avg);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Javaの点数を入力＝＞");
		scores a = new scores();
		a.java = s.nextInt();
		System.out.print("Pythonの点数を入力＝＞");
		a.py = s.nextInt();
		System.out.print("アルゴリズムの点数を入力＝＞");
		a.arugo = s.nextInt();
		
		keisan(a.java,a.py,a.arugo);
		s.close();
	}
}
