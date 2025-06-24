// IT学科クラス（TSB_students を継承）
class IT_gakka extends TSB_students {
    int arugo;     // アルゴリズムの成績
    int java;      // JAVAの成績
    int web;       // WEBの成績
    String hyouka = "";  // 合否評価（合格／不合格）
    static int gougaku_count = 0;  // 合格者の人数をカウントする静的変数

    // コンストラクタ：親クラスの情報＋3科目の成績を初期化
    IT_gakka(String in_gakka, int in_gakuseki, String in_namae, int in_arugo, int in_java, int in_web){
        super(in_gakka, in_gakuseki, in_namae); // 親クラスのコンストラクタを呼び出す
        this.arugo = in_arugo;
        this.java = in_java;
        this.web = in_web;
    }

    // 生徒の詳細情報を表示するメソッド（親のshowInfoも使う）
    void showInfo() {
        super.showInfo(); // 学籍情報を表示
        System.out.println("アルゴリズムの成績："+ arugo);
        System.out.println("JAVAの成績："+ java);
        System.out.println("WEBの成績："+ web);
        System.out.println(hyouka + "です。"); // 合否も表示
    }

    // 合否を判定するメソッド（すべて60点以上なら合格）
    void goukaku() {
        if(arugo >= 60 && java >=60 && web >= 60) {
            IT_gakka.gougaku_count++; // 合格者をカウント
            hyouka = "合格";
        } else {
            hyouka = "不合格";
        }
    }
}
