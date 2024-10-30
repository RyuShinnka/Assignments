import java.util.Scanner;
public class ensyu01_07 {
    public static void main(String[] args) {
        // 整数値を入力
        Scanner s = new Scanner(System.in);
        System.out.print("整数値（4桁）を入力＝＞");
        int num = s.nextInt();
        // 最下位桁を除いた値と最下位桁を計算
        int f3 = num / 10;
        int l1 = num % 10;
        
        // 結果を表示
        System.out.println("最下位桁を除いた値は" + f3 + "です。");
        System.out.println("最下位桁は" + l1 + "です。");
        s.close();
    }
}
