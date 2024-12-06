// 学生情報を保持するクラス
class StudentCard {
    static int counter = 0; // インスタンス生成回数をカウントするクラス変数
    int id; // 学籍番号
    String name; // 氏名

    // コンストラクタ
    StudentCard(int id, String name) {
        System.out.println("StudentCardクラスのコンストラクタが呼び出されました");
        this.id = id;
        this.name = name;
        StudentCard.counter++; // インスタンス生成時にカウンタを増加
    }
}
