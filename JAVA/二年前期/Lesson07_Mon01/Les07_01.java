import java.util.Scanner;

public class Les07_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("ーーーーー個人情報を入力してくださいーーーーー");

        // 学籍番号を入力
        System.out.print("学籍番号を入力＝＞");
        int num = s.nextInt();

        // 氏名を入力
        System.out.print("名前を入力＝＞");
        String name = s.next();

        // 学科名を入力
        System.out.print("学科名を入力＝＞");
        String gakka = s.next();

        // 国籍を入力
        System.out.print("国籍を入力＝＞");
        String nationality = s.next();

        System.out.println("ーーーーー個人情報を入力完成しましたーーーーー");

        // 入力された情報で Itstudent インスタンスを生成
        Itstudent stu = new Itstudent(num, name, gakka, nationality);

        // 学生情報を出力
        stu.printInfo();

        // Scanner を閉じる
        s.close();
    }
}
