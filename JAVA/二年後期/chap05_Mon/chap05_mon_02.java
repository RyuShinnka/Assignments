import java.util.ArrayList;
import java.util.Scanner;
class Student {
	 private String name;
	 private int[] scoreAry;
	 public String getName() {
	 return name;
 }
 public void setName(String name) {
	 this.name = name;
 }
 public int[] getScoreAry() {
	 return scoreAry;
 }
 public void setScoreAry(int[] scoreAry) {
	 this.scoreAry = scoreAry;
 	}
 }

public class chap05_mon_02{
	 public static final String[] SUBJECTS = { "国語", "数学", "英語" };
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		// 生徒リスト（Student 型の ArrayList）
		 ArrayList<Student> students = new ArrayList<>();
		 
		// 生徒数の入力
		 System.out.print("生徒数を入力=> ");
		 int n = sc.nextInt();
		 
	        // 各生徒のデータ入力
	        for (int i = 0; i < n; i++) {
	            System.out.print((i + 1) + "人目の名前: ");
	            String name = sc.next();

	            // SUBJECTS.length を使用して配列サイズを自動調整
	            // 科目数を増減しても自動的にループ回数と配列サイズが変わる
	            int[] scores = new int[SUBJECTS.length];
	            for (int j = 0; j < SUBJECTS.length; j++) {
	                System.out.print(SUBJECTS[j] + "の点数: ");
	                scores[j] = sc.nextInt();
	            }

	            Student st = new Student();
	            st.setName(name);
	            st.setScoreAry(scores);
	            students.add(st);
	        }

	        // 一覧表の表示
	        System.out.println();
	        System.out.println("======生徒毎の合計点一覧表の表示======");
	        System.out.print("名前\t");
	        for (String sub : SUBJECTS) {
	            System.out.print(sub + "\t");
	        }
	        System.out.println("合計");

	        // 科目ごとの合計・平均を計算する部分
	        // SUBJECTS.length に合わせて自動で合計配列を作成
	        int[] subjectSums = new int[SUBJECTS.length];

	        for (Student st : students) {
	            System.out.print(st.getName() + "\t");
	            int[] sa = st.getScoreAry();
	            int sum = 0;
	            for (int j = 0; j < SUBJECTS.length; j++) {
	                System.out.print(sa[j] + "\t");
	                sum += sa[j];
	                subjectSums[j] += sa[j]; // 科目ごとの合計を集計
	            }
	            System.out.println(sum);
	        }

	        // 科目ごとの平均
	        System.out.println();
	        System.out.println("======科目ごとの平均点======");
	        for (int j = 0; j < SUBJECTS.length; j++) {
	            double avg = (double) subjectSums[j] / students.size();
	            System.out.println(SUBJECTS[j] + "：" + avg);
	        }

	        sc.close();
	}
}
