import java.util.Scanner;
public class chap02_01 {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        // 三角形の底辺と高さを入力
    	System.out.print("底辺を入力＝＞");
        double base = s.nextDouble();
        System.out.print("高さを入力＝＞");
        double height = s.nextDouble();

        // 三角形の面積を計算
        double result = base * height / 2;

        // 小数を整数に変換
        int intResult = (int) result;

        // 結果を表示
        System.out.print("三角形の面積は");
        System.out.println(intResult + "cm²");
        
        s.close();
    }
}
