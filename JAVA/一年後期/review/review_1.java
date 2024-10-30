import java.util.Scanner;
public class review_1 {
	public static String Nofunction(int num) {
		String[] list = {
			"テニス",
			"野球",
			"バレーボール",
			"新体操"
		};
		return list[num];
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 3;i++) {
			System.out.println((i+1)+"人目の名前とグループ名を表示します");
			System.out.print("名前を入力=>");
			String name = s.next();
			System.out.print("グループ番号を入力 (1-4)=>");
			int number = s.nextInt();
			String groupName = Nofunction(number-1);
			System.out.println("名前は："+name+",グループ名は："+groupName);
			System.out.println("-------------------------------------");
		}
		s.close();
	}
}
