import java.util.Scanner;

public class review_3 {
    public static boolean ifIs9999(int num) {
        if (num == 9999) {
            System.out.println("プログラムを終了します。");
            return true; // 9999が入力された場合、ループを終了
        }
        return false;
    }

    public static String keisan(int num, int qua) {
        String items;

        // 商品カテゴリの決定
        if (num >= 1000 && num <= 1999) {
            items = "文房具";
        } else if (num >= 2000 && num <= 2999) {
            items = "衣類";
        } else if (num >= 3000 && num <= 3999) {
            items = "電化製品";
        } else {
            items = "家具";
        }

        // 合計金額の計算
        int total;
        int price;
        if (num % 10 <= 2) {
        	price = 500;
            total = qua * price;
        } else if (num % 10 <= 5) {
        	price = 2500;
            total = qua * price;
        } else if (num % 10 <= 8) {
        	price = 5000;
            total = qua * price;
        } else {
        	price = 15000;
            total = qua * price;
        }

     // 結果を出力
        System.out.println("商品番号: " + num + ", 商品分類名: " + items + ", 単価: " + price + "円, 数量: " + qua + ", 金額: " + total + "円");
    
        return items; // カテゴリを返す（必要に応じて）
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("商品番号を入力=> ");
            int number = s.nextInt();

            // 9999が入力された場合はプログラムを終了
            if (ifIs9999(number)) {
                break; // プログラムを終了するためのブレーク
            }

            System.out.print("商品数量を入力=> ");
            int quantity = s.nextInt();

            // 商品情報の計算
            keisan(number, quantity);
            s.close(); 
        }
        
    }
}