import java.util.Scanner;

public class Section7_03 {
    // 商品番号から分類名を返すメソッド
    public static String bunnyafun(int syono) {
        String itemsName;
        if (syono / 1000 == 1) {
            itemsName = "電気製品";
        } else if (syono / 1000 == 2) {
            itemsName = "日用雑貨";
        } else if (syono / 1000 == 3) {
            itemsName = "食品";
        } else {
            itemsName = "衣類";
        }
        return itemsName;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int syono = 0;
            boolean kakunin = false;

            // 有効な入力が得られるまで繰り返し
            while (!kakunin) {
                System.out.print("商品番号を入力（1000～4999）ー＞");
                syono = s.nextInt();

                if (syono >= 1000 && syono <= 4999) {
                	kakunin = true; // 正しい範囲の入力であればループを抜ける
                } else {
                    System.out.println("入力が無効です。1000～4999の範囲で再度入力してください。");
                }
            }

            // 分類名を表示
            String itemsName = bunnyafun(syono);
            System.out.println("商品番号：" + syono + " の商品分類は：" + itemsName);
            break;
        }
        s.close();
    }
}
