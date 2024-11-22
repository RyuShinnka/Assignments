import java.util.Scanner;

public class List05_Mon02 {
    // メソッドの処理: 5人分の3教科の点数を表示する
    static void printScores(scores[] students) {
    	System.out.println("---３教科の点数---");
        for (int i = 0; i < students.length; i++) {
//            System.out.println("学生 " + (i + 1) + " の点数:");
            System.out.println(students[i].java+"  \t" + students[i].py+"  \t" + students[i].arugo);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // クラス型配列を作成: 5要素
        scores[] students = new scores[5];
        
        // キーボードから3教科の点数を5人分入力する
        for (int i = 0; i < students.length; i++) {
            students[i] = new scores(); // 各要素を初期化
            System.out.println("学生 " + (i + 1) + " の点数を入力:");
            System.out.print("  Java=> ");
            students[i].java = s.nextInt();
            System.out.print("  Python=> ");
            students[i].py = s.nextInt();
            System.out.print("  アルゴリズム=> ");
            students[i].arugo = s.nextInt();
        }

        // 表示するメソッドを呼び出し
        printScores(students);

        s.close();
    }
}
