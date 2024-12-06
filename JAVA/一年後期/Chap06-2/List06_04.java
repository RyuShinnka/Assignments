// 学生情報を保持するクラス
class StudentCard {
    int id; // 学籍番号
    String name; // 氏名

    // コンストラクタ
    StudentCard(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 学生情報を表示するメソッド
    void printInfo() {
        System.out.println("学籍番号：" + this.id);
        System.out.println("氏名：" + this.name);
    }
}

public class List06_04 {
    public static void main(String[] args) {
        // 学生情報を作成
        StudentCard a = new StudentCard(1234, "鈴木太郎");
        StudentCard b = new StudentCard(1235, "佐藤花子");

        // 学生情報を表示
        a.printInfo();
        b.printInfo();
    }
}
