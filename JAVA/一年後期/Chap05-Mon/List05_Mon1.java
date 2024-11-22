import java.util.Scanner;

// 各教科の点数 クラス
class scores {
    int java;
    int py;
    int arugo;
}

public class List05_Mon01 {
    // 合計と平均を計算するメソッド
    static void keisan(scores a) {
        int sum = a.java + a.py + a.arugo;
        int avg = sum / 3;
        System.out.println("3教科の合計は：" + sum);
        System.out.println("3教科の平均は：" + avg);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 点数を入力
        System.out.print("Javaの点数を入力＝＞");
        scores a = new scores();
        a.java = s.nextInt();
        System.out.print("Pythonの点数を入力＝＞");
        a.py = s.nextInt();
        System.out.print("アルゴリズムの点数を入力＝＞");
        a.arugo = s.nextInt();

        // 合計と平均を計算して表示
        keisan(a);
        
        s.close();
    }
}
