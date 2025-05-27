class StudentCard {
    int num;       // 学籍番号
    String name;   // 学生氏名

    // コンストラクタ：学籍番号と氏名を初期化
    StudentCard(int num, String name) {
        this.num = num;
        this.name = name;
    }

    // 学生情報を出力するメソッド
    void printInfo() {
        System.out.println("学籍番号：" + this.num);
        System.out.println("学生氏名：" + this.name);
    }
}
