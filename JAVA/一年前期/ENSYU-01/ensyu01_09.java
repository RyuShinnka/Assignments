import java.util.Scanner;
public class ensyu01_09 {
    public static void main(String[] args) {
        // 半径を入力
        Scanner s = new Scanner(System.in);
        System.out.print("球の半径を入力＝＞");
        double hk = s.nextDouble();
        
        // 表面積と体積を計算
        double bmj = 4 * hk * hk * 3.1416;
        double tj = (4.0 / 3.0) * hk * hk * hk * 3.1416;
        
        // 結果を表示
        System.out.println("この球の表面積は：" + bmj);
        System.out.println("この球の体積は：" + tj);
        s.close();
    }
}
