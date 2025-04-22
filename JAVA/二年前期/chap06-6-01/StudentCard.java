// 学生情報クラス
class StudentCard {
    int gakusekiBangou; // 学籍番号
    String namae;       // 氏名
    int bangou;         // 自動番号
    int seiseki;        // 成績点
    static int bangouCount = 0; // 番号カウンター
    static int seisekiGoukei = 0; // 成績点の合計

    // コンストラクタ
    GakuseiJoho(int gakusekiBangou, String namae, int seiseki) {
        this.gakusekiBangou = gakusekiBangou;
        this.namae = namae;
        this.seiseki = seiseki;
        this.bangou = GakuseiJoho.bangouCount++;
    }

    // 学生情報を表示するメソッド
    void johoHyouji() {
        System.out.println("番号：" + this.bangou);
        System.out.println("学籍番号：" + this.gakusekiBangou);
        System.out.println("氏名　　：" + this.namae);
        System.out.println("成績点　：" + this.seiseki);
    }

    // 成績点を合計に加えるメソッド
    void goukeiNiKasaneru() {
        GakuseiJoho.seisekiGoukei += this.seiseki;
    }
}
