import java.util.Scanner;
public class ensyu01_08 {
    public static void main(String[] args) {
        // 底辺と高さを入力
        Scanner s = new Scanner(System.in);
        System.out.print("底辺を入力（小数点数）＝＞");
        double d = s.nextDouble();
        
        System.out.print("高さを入力（小数点数）＝＞");
        double h = s.nextDouble();
        
        // 三角形の面積を計算
        double m = (d * h) / 2;
        // 結果を表示
        System.out.println("三角形の面積は " + m + " です。");
        s.close();
    }
}
