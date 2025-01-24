import java.util.Scanner;

class Sell {
    int itemsNo; // 商品番号
    int qua; // 数量
    double price; // 単価
    double priceSum; // 金額

    // コンストラクタ: 商品番号と個数で初期化
    Sell(int itemsNo, int qua) {
        this.itemsNo = itemsNo;
        this.qua = qua;
        this.price = 0;
        this.priceSum = 0;
    }

    // 商品番号から単価を求めるメソッド
    void PriceMethod() {
        if (itemsNo == 101) {
            this.price = 2500;
        } else if (itemsNo == 102) {
            this.price = 3600;
        } else if (itemsNo == 103) {
            this.price = 2800;
        }
    }

    // 単価と数量から金額を計算するメソッド
    void SumMethod() {
        this.priceSum = price * qua;
    }

    // 金額が200以上の場合に1割引を適用するメソッド
    void DiscountMethod() {
        if (priceSum >= 200) {
            this.priceSum *= 0.9; // 10%割引
        }
    }

    // フィールドの値をすべて表示するメソッド
    void PrintMethod() {
        System.out.println("商品番号: " + itemsNo);
        System.out.println("個数: " + qua);
        System.out.println("単価: " + price);
        System.out.println("金額: " + priceSum);
        System.out.println("------------------------");
    }
}

public class section_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 伝票の数を入力
        System.out.print("伝票の数を入力 => ");
        int recipt = s.nextInt();
        Sell[] sales = new Sell[recipt];

        // 各伝票のデータを入力
        for (int i = 0; i < recipt; i++) {
            System.out.println("伝票 " + (i + 1) + " の情報を入力:");
            System.out.print("商品番号 (101, 102, 103) を入力 => ");
            int itemsNo = s.nextInt();
            System.out.print("商品個数を入力 => ");
            int qua = s.nextInt();

            sales[i] = new Sell(itemsNo, qua);
            sales[i].PriceMethod();
            sales[i].SumMethod();
            sales[i].DiscountMethod();
        }

        // 各伝票の情報を表示
        System.out.println("\n伝票の内容を表示:\n");
        for (int i = 0; i < recipt; i++) {
            sales[i].PrintMethod();
        }

        s.close();
    }
}
