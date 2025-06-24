class TSB_students {
    String gakka;     // 学科名（IT / office）
    int gakuseki;     // 学籍番号
    String namae;     // 氏名

    // コンストラクタ（初期化処理）
    TSB_students(String in_gakka, int in_gakuseki, String in_namae){
        this.gakka = in_gakka;
        this.gakuseki = in_gakuseki;
        this.namae = in_namae;
    }

    // 生徒情報を出力するメソッド
    void showInfo() {
        System.out.println();
        System.out.println("学科番号："+ gakka);
        System.out.println("学籍番号："+ gakuseki);
        System.out.println("氏名："+ namae);
    }
}
