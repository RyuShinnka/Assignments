import java.util.Scanner;
public class ensyu02_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.print("姓を入力＝＞");
		String lastname = s.next();
		System.out.print("名を入力＝＞");
		String firstname = s.next();
		System.out.println("こんにちは"+ lastname+"姓 "+firstname+"名さんですね。");
		s.close();
		
	}
}
