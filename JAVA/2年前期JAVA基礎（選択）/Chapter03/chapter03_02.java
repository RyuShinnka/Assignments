import java.util.Scanner;

public class chapter03_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 入力
        System.out.print("年齢を入力＝＞");
        int nenrei = s.nextInt();
        System.out.print("コースを入力（A / B）＝＞");
        String koosu = s.next();

        int ryoukin = 0;

        // コースによって分岐
        switch (koosu) {
            case "A":
                if (nenrei < 13) {
                    ryoukin = 2500;
                } else if (nenrei >= 60) {
                    ryoukin = 3000;
                }
                break;

            case "B":
                if (nenrei > 12 && nenrei < 60) {
                    ryoukin = 3500;
                } else if (nenrei >= 60) {
                    ryoukin = 4000;
                }
                break;

            default:
                System.out.println("入力エラー：コースはAまたはBを入力してください。");
                s.close();
                return;
        }

        // 結果表示
        if (ryoukin == 0) {
            System.out.println("入力エラー：該当する料金がありません。");
        } else {
            System.out.println("料金は：" + ryoukin + "円");
        }

        s.close();
    }
}
