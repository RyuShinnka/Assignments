import java.util.Scanner;
public class section_03 {
	static class Member{
		String className;
		String name;
		int rank;
//		コンストラクタ宣言
		public Member(String className, String name, int rank){
			this.className = className;
			this.name = name;
			this.rank = rank;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("一人目のクラス名(A,B,C)を入力＝＞");
		String className1 = s.next();
		System.out.print("一人目の名前を入力＝＞");
		String name1 = s.next();
		System.out.print("一人目のランクを入力＝＞(1～20までの整数)");
		int rank1 = s.nextInt();
		Member a = new Member(className1,name1,rank1);
		
		System.out.println("----------------------------");
		System.out.print("二人目のクラス名を入力＝＞");
		String className2 = s.next();
		System.out.print("二人目の名前を入力＝＞");
		String name2 = s.next();
		System.out.print("二人目のランクを入力＝＞(1～20までの整数)");
		int rank2 = s.nextInt();
		Member b = new Member(className2,name2,rank2);
		
		System.out.println("一人目のデータ：");
		System.out.println("クラス名："+a.className);
		System.out.println("名前："+a.name);
		System.out.println("ランク："+a.rank);
		
		System.out.println("二人目のデータ：");
		System.out.println("クラス名："+b.className);
		System.out.println("名前："+b.name);
		System.out.println("ランク："+b.rank);
		s.close();
	}
}
