import java.util.Scanner;

public class List06_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // 三角形の底辺と高さを入力
        System.out.print("底辺を入力＝＞");
        double base = s.nextDouble();
        System.out.print("高さを入力＝＞");
        double height = s.nextDouble();
        
        // SimpleCalcインスタンスを生成
        SimpleCalc keisan = new SimpleCalc(base, height);
        
        // クラスメソッドで三角形の面積を計算
        SimpleCalc.getTriangleArea(keisan.base, keisan.height);
        
        // クラスメソッドで計算結果を表示
        SimpleCalc.printInfo();
        
        s.close();
    }
}
