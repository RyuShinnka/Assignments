import java.util.Scanner;

public class Section8_03 {
	// メソッド1：商品番号と数量から金額を計算する
    public static int calcsum(int num, int qua) {
        int price;

        // 商品番号の1桁目で単価を決定
        int category = (num / 1000);
        switch (category) {
            case 1:
                price = 500;
                break;
            case 2:
                price = 2500;
                break;
            case 3:
                price = 5000;
                break;
            case 4:
                price = 15000;
                break;
            default:
                return -1; // エラーを示す
        }

        return price * qua;
    }

    // メソッド2：商品番号のエラーチェック
    public static boolean check(int num) {
        return num >= 1000 && num <= 4999;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("商品番号を入力（9999で終了）＝＞");
            int num = s.nextInt();
            
            // 終了条件
            if (num == 9999) {
                System.out.println("プログラムを終了します。");
                break;
            }

            // 商品番号のエラーチェック
            if (!check(num)) {
                System.out.println("無効な商品番号です。1000～4999の範囲で再入力してください。");
                continue;
            }

            // 商品分類名の取得
            String name = switch (num / 1000) {
                case 1 -> "文房具";
                case 2 -> "衣類";
                case 3 -> "電化製品";
                case 4 -> "家具";
                default -> "不明";
            };

            // 数量の入力
            System.out.print("数量を入力してください＝＞");
            int qua = s.nextInt();

            // 金額の計算
            int sum = calcsum(num, qua);
            int price = sum / qua;
            System.out.println("商品番号: " + num);
            System.out.println("商品分類名: " + name);
            System.out.println("単価: " + price + "円");
            System.out.println("数量: " + qua);
            System.out.println("金額: " + sum + "円"); 
        }

        s.close();
    }
}
