import java.util.Scanner;
public class ensyu05_04 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSum = 0; // 合計用の変数

        // 最大10グループ
        for (int i = 0; i < 10; i++) {
            System.out.println("※第" + (i + 1) + "グループ");

            // 各グループは最大5個まで
            for (int j = 0; j < 5; j++) {
                System.out.print("整数＝＞");
                int num = sc.nextInt();

                // 入力終了（99999 は合計に含めない）
                if (num == 99999) {
                    System.out.println("合計は" + totalSum + "です。");
                    sc.close();
                    return; //全体終了
                }

                // グループ終了（88888 は加算しない）
                if (num == 88888) {
                    break;
                }

                // 合計に加算
                totalSum += num;
            }
        }

        // 10グループ入力完了時
        System.out.println("合計は" + totalSum + "です。");
        sc.close();
    }
}
