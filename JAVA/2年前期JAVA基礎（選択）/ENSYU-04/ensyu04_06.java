import java.util.Scanner;

public class ensyu04_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 表示する▲の個数を入力
        System.out.print("何個▲を表示しますか=>");
        int num = sc.nextInt();

        // 1個だけの場合は改行なし
        if (num == 1) {
            System.out.print("▲");
        }
        // 2個以上の場合
        else if (num > 1) {
            for (int i = 0; i < num; i++) {
                System.out.print("▲");
            }
            System.out.println(""); // 改行
        }

        sc.close();
    }
}
