// Office学科クラス（TSB_students を継承）
class Office_gakka extends TSB_students {
    int excel; // Excelの成績
    int word;  // Wordの成績
    String hyouka = ""; // 合否結果（合格 or 不合格）
    static int gougaku_count = 0; // 合格者数（静的変数）

    // コンストラクタ：親クラス＋2科目の成績を初期化
    Office_gakka(String in_gakka, int in_gakuseki, String in_namae, int in_excel, int in_word){
        super(in_gakka, in_gakuseki, in_namae);
        this.excel = in_excel;
        this.word = in_word;
    }

    // 情報表示メソッド（親のshowInfo＋独自情報）
    void showInfo() {
        super.showInfo();
        System.out.println("EXCELの成績："+ excel);
        System.out.println("WORDの成績："+ word);
        System.out.println(hyouka + "です。");
    }

    // 合否判定メソッド（60点以上なら合格）
    void goukaku() {
        if(excel >= 60 && word >=60) {
            Office_gakka.gougaku_count++; 
            hyouka = "合格";
        }
        else {
            hyouka = "不合格";
        }
    }
}
