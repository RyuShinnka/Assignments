import java.util.Scanner;

public class section_07 {
	static class Seiseki{
		int studentNo;
		String name;
		int score;
		
		public Seiseki(int studentNo,String name,int score){
			this.studentNo = studentNo;
			this.name = name;
			this.score = score;
		}
		
		public int GetNoMethod() {
			return this.score;
		}
		
		public void PrintMethod() {
			System.out.println("――――――――――");
			System.out.println("｜学籍番号："+this.studentNo);
			System.out.println("｜名前："+this.name);
			System.out.println("｜成績点："+this.score);
			System.out.println("――――――――――");
		}
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Seiseki[] students = new Seiseki [10]; 
		System.out.print("人数を入力＝＞");
		int member = s.nextInt();
		for(int i=0;i<member;i++) {
			System.out.print((i+1)+"人目の学籍番号を入力＝＞");
			int studentNo = s.nextInt();
			System.out.print((i+1)+"人目の名前を入力＝＞");
			String name = s.next();
			System.out.print((i+1)+"人目の成績点を入力＝＞");
			int score = s.nextInt();
			students[i] = new Seiseki(studentNo,name,score);
		}
		int maxIdx = 0;
		for(int i=0;i<member;i++) {
			if(students[i].GetNoMethod() > students[maxIdx].GetNoMethod()) {
				maxIdx = i;
			}
		}
		// 最高点の人の情報を表示
        System.out.println("------最高点の人の情報------");
        students[maxIdx].PrintMethod();
        s.close();
	
	
	}
}
