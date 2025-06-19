import java.util.Scanner;
public class ensyu01_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Aの値を入力＝＞");
		double A = s.nextDouble();
		System.out.print("Bの値を入力＝＞");
		double B = s.nextDouble();
		double sum = A + B;
		double avg = sum / 3;
		System.out.println(A+" + "+B+" = "+ sum);
		System.out.println(sum + " ÷ 2 = "+ avg);
		s.close();
	}
}
