import java.util.Scanner;
class TestCard{
	int studentNo;
	int javaScore;
	int pythonScore;
	boolean pass;
	
	TestCard(int studentNo,int javaScore,int pythonScore){
		this.studentNo = studentNo;
		this.javaScore = javaScore;
		this.pythonScore = pythonScore;
	}
	void ResultMethod() {
		if(this.javaScore >= 60 && this.pythonScore >= 60) {
			this.pass = true;
		}else {
			this.pass = false;
		}
	}
	void PrintMethod() {
		String passText;
		if(this.pass == true) {
			passText = "合格";
		}else {
			passText = "不合格";
		}
		System.out.println("学籍番号："+this.studentNo);
		System.out.println("Javaの点数："+this.javaScore);
		System.out.println("Pythonの点数："+this.pythonScore);
		System.out.println("合否："+ passText);
		
	}
}
public class section_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("一人目の学籍番号を入力＝＞");
		int studentNo1 = s.nextInt();
		System.out.print("一人目のJavaの点数を入力＝＞");
		int javaScore1 = s.nextInt();
		System.out.print("一人目のPythonの点数を入力＝＞");
		int pythonScore1 = s.nextInt();
		TestCard a = new TestCard(studentNo1,javaScore1,pythonScore1);
		System.out.println("----------------------------");
		System.out.print("二人目の学籍番号を入力＝＞");
		int studentNo2 = s.nextInt();
		System.out.print("二人目のJavaの点数を入力＝＞");
		int javaScore2 = s.nextInt();
		System.out.print("二人目のPythonの点数を入力＝＞");
		int pythonScore2 = s.nextInt();
		TestCard b = new TestCard(studentNo2,javaScore2,pythonScore2);
		a.ResultMethod();
		a.PrintMethod();
		b.ResultMethod();
		b.PrintMethod();
		s.close();
	}
}
