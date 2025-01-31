import java.util.Scanner;
public class section_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("登録する学生の人数を入力 ");
        int 人数 = s.nextInt();
        Student[] 配列 = new Student[人数];
        
        // 学生情報の入力
        for (int i = 0; i < 人数; i++) {
        	System.out.println("\n学生 " + (i + 1) + " の情報を入力");
            System.out.print("学籍番号 (1000～) ");
            int 学籍番号 = s.nextInt();
            System.out.print("氏名-> ");
            String 氏名 = s.next();
            System.out.print("成績点 (0～100) ");
            int 成績点 = s.nextInt();
            
            配列[i] = new Student(学籍番号, 氏名, 成績点);
        }
        
        // 平均点を計算
        double avg = Student.平均を求める(配列);
        // 学生情報を表示
        System.out.println("\n登録された学生情報");
        Student.printInfo(配列);
        
        // 平均点を表示
        System.out.println("平均点: " + avg);
        // 平均点以上の人数を表示
        System.out.println("平均点以上の学生数: " + Student.平均点以上の人数を求める(配列));
        
        s.close();
	}
}
