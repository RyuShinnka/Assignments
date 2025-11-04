import java.util.Scanner;

public class Math_mon02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 半径を入力
        System.out.print("半径を入力＝＞");
        double r = sc.nextDouble();

        // 角度を入力
        System.out.print("角度を入力＝＞");
        double degree = sc.nextDouble();
        
        // 面積を計算（πr²）
        double area = Math.PI * Math.pow(r, 2);

        // 円周を計算（2πr）
        double circumference = 2 * Math.PI * r;
        
        // sin値を計算
        double sinValue = Math.sin(degree * Math.PI / 180.0);

        // 結果を出力
        System.out.println("半径 " + r + " の円の面積は " + area);
        System.out.println("半径 " + r + " の円周の長さは " + circumference);
        System.out.println("角度 " + degree + "° の sin 値は " + sinValue);

        sc.close();
    }
}
