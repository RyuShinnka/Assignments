import java.util.Scanner;
public class ensyu01_08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("△の底辺を入力＝＞");
		double base = s.nextDouble();
		System.out.print("△の高さを入力＝＞");
		double height = s.nextDouble();
		double area = base * height / 2;
		System.out.println("△の面積は "+ area + "です。");
		
		s.close();
	}
}
