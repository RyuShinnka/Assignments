import java.util.Scanner;

public class kakunin02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
     	// 入力
        System.out.print("学籍番号を入力してください (240100〜240200の範囲): ");
        int student_no = s.nextInt();
        // 学籍番号のチェック
        if (student_no < 240100 || student_no > 240200) {
            System.out.println("入力エラー");
            return;
        }
        
        System.out.print("氏名を入力してください: ");
        String name = s.next();

        System.out.print("年齢を入力してください: ");
        int age = s.nextInt();

        System.out.print("学年を入力してください (1〜4): ");
        int grade = s.nextInt();
        // 出力
        System.out.println("学籍番号: " + student_no + " " + grade + "学年");
        System.out.println("氏名: " + name + "さん " + age + "才");
	
        s.close();
	}	
}
