// Itstudent クラスは StudentCard クラスを継承（サブクラス）
class Itstudent extends StudentCard {
    String gakka;        // 学科名
    String nationality;  // 国籍

    // コンストラクタ：学籍番号・氏名・学科名・国籍を初期化
    Itstudent(int num, String name, String gakka, String nationality) {
        super(num, name);             // 親クラスのコンストラクタを呼び出す
        this.gakka = gakka;
        this.nationality = nationality;
    }

    // 学生情報を表示するメソッド（オーバーライド）
    void printInfo() {
        System.out.println();
        System.out.println("ーーーー　学生情報　－－－－");
        System.out.println("学 科 名：" + this.gakka);   // 学科名を表示
        super.printInfo();                                // 親クラスの情報（学籍番号・氏名）を表示
        System.out.println("　国　籍：" + this.nationality); // 国籍を表示
    }
}
