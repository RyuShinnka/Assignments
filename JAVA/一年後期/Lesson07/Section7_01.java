import java.util.Scanner;
public class Section7_01 {
	public static void check(int num) {
		switch (num) {
		case 1:
			System.out.println("良く出来ました。");
			break;
		
		case 2:
			System.out.println("もう少し頑張りましょう。");
			break;
		case 3:
			System.out.println("不合格です。");
			break;
		default:
			break;
		}
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Pythonの点数を入力=>");
		int py= s.nextInt();
		System.out.print("JAVAの点数を入力=>");
		int ja = s.nextInt();
		if(py >=60 && ja >=60) {
			check(1);
		}else if(py >=60 || ja >=60) {
			check(2);
		}else {
			check(3);
		}
		s.close();
	}
}
