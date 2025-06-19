import java.util.Scanner;
public class ensyu01_06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("名前を入力＝＞");
		String name = s.next();
		System.out.print("今年の年を入力＝＞");
		String year = s.next();
		System.out.print("月分を入力＝＞");
		String month = s.next();
		System.out.print("日を入力＝＞");
		String day = s.next();
		
		String result = "私の名前は"+name+"です。今日の日付は"+year+"年"+month+"月"+day+"日です。";
		System.out.println(result);
		s.close();
	}
}
