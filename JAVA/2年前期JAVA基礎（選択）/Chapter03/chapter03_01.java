import java.util.Scanner;

public class chapter03_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("年齢を入力＝＞");
        int nenrei = s.nextInt(); // 年齢
        int ryoukin = 0; // 料金

        if (nenrei < 13) {
            ryoukin = 300;
        } else if (nenrei < 21) {
            ryoukin = 800;
        } else if (nenrei < 36) {
            ryoukin = 1000;
        } else if (nenrei < 61) {
            ryoukin = 1200;
        } else {
            ryoukin = 500;
        }

        System.out.println("料金は：" + ryoukin + "円");
        s.close();
    }
}
