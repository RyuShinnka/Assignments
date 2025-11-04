package class_life;

public class Shops {
    int shop_id;         // 店舗ID
    String shop_name;    // 店舗名
    double uriage;       // 売上額
    double mokuhyo;      // 目標額
    int tasseiritu;      // 達成率

    // コンストラクタ: 店舗情報の初期化
    public Shops(int id, String name, double uri, double moku){
        this.shop_id = id;
        this.shop_name = name;
        this.uriage = uri;
        this.mokuhyo = moku;
        this.tasseiritu = 0; // 初期達成率は0
    }

    // 達成率の計算
    public void calc() {
        this.tasseiritu = (int)((this.uriage / this.mokuhyo) * 100);
    }

    // 達成率に基づく評価
    public void hyouka() {
        String hyouka = "";
        if(this.tasseiritu >= 100) {
            hyouka = "優秀";
        } else if(this.tasseiritu >= 80) {
            hyouka = "良好";
        } else if(this.tasseiritu >= 50) {
            hyouka = "頑張りましょう";
        } else {
            hyouka = "問題有り";
        }
        System.out.println("達成率の評価：" + hyouka);
    }

    // 店舗情報の表示
    public void display() {
        System.out.println("=========");
        System.out.println("店番: " + this.shop_id);
        System.out.println("店名: " + this.shop_name);
        System.out.println("売上額: " + (int)this.uriage);
        System.out.println("目標額: " + (int)this.mokuhyo);
        System.out.println("達成率: " + this.tasseiritu + "%");
    }
}
