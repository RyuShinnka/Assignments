import java.util.Scanner;

// 会員情報を管理するクラス
class PeopleCard {
    String name; // 名前
    int memberNum; // 会員番号
    int gender; // 性別 (1: 男子, 2: 女子)
    int age; // 年齢

    // コンストラクタ
    PeopleCard(String name, int memberNum, int gender, int age) {
        this.name = name;
        this.memberNum = memberNum;
        this.gender = gender;
        this.age = age;
    }

    // 会員番号が正しい範囲内かチェック
    boolean CheckNoMethod() {
        if (this.memberNum >= 1000 && this.memberNum <= 3999) {
            return true;
        } else {
            return false;
        }
    }

    // 会員番号を変更
    void ChangeMethod(int num) {
        this.memberNum = num;
    }

    // 会員情報を表示
    void PrintMethod() {
        String genderText;
        if (this.gender == 1) {
            genderText = "男子";
        } else {
            genderText = "女子";
        }
        System.out.println();
        System.out.println("―――――――――");
        System.out.println("名前：" + this.name);
        System.out.println("会員番号：" + this.memberNum);
        System.out.println("性別：" + genderText);
        System.out.println("年齢：" + this.age);
    }
}

public class section_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 一人目の情報を入力
        System.out.print("一人目の名前を入力＝＞");
        String nameP1 = s.next();
        System.out.print("一人目の会員番号（1000～3999）を入力＝＞");
        int memberNumP1 = s.nextInt();
        System.out.print("一人目の性別（男性：1、女性：2）を入力＝＞");
        int genderP1 = s.nextInt();
        System.out.print("一人目の年齢を入力＝＞");
        int ageP1 = s.nextInt();
        PeopleCard p1 = new PeopleCard(nameP1, memberNumP1, genderP1, ageP1);

        // 会員番号が範囲外の場合は再入力
        while (true) {
            if (p1.CheckNoMethod() == false) {
                System.out.println("会員番号入力エラー、もう一度正しく入力してください。");
                System.out.print("一人目の会員番号（1000～3999）を入力＝＞");
                memberNumP1 = s.nextInt();
                p1.ChangeMethod(memberNumP1);
            } else {
                break;
            }
        }

        System.out.println("ーーーーーーーーーー");

        // 二人目の情報を入力
        System.out.print("二人目の名前を入力＝＞");
        String nameP2 = s.next();
        System.out.print("二人目の会員番号（1000～3999）を入力＝＞");
        int memberNumP2 = s.nextInt();
        System.out.print("二人目の性別（男性：1、女性：2）を入力＝＞");
        int genderP2 = s.nextInt();
        System.out.print("二人目の年齢を入力＝＞");
        int ageP2 = s.nextInt();
        PeopleCard p2 = new PeopleCard(nameP2, memberNumP2, genderP2, ageP2);

        // 会員番号が範囲外の場合は再入力
        while (true) {
            if (p2.CheckNoMethod() == false) {
                System.out.println("会員番号入力エラー、もう一度正しく入力してください。");
                System.out.print("二人目の会員番号（1000～3999）を入力＝＞");
                memberNumP2 = s.nextInt();
                p2.ChangeMethod(memberNumP2);
            } else {
                break;
            }
        }

        System.out.println("ーーーーーーーーーー");

        // 三人目の情報を入力
        System.out.print("三人目の名前を入力＝＞");
        String nameP3 = s.next();
        System.out.print("三人目の会員番号（1000～3999）を入力＝＞");
        int memberNumP3 = s.nextInt();
        System.out.print("三人目の性別（男性：1、女性：2）を入力＝＞");
        int genderP3 = s.nextInt();
        System.out.print("三人目の年齢を入力＝＞");
        int ageP3 = s.nextInt();
        PeopleCard p3 = new PeopleCard(nameP3, memberNumP3, genderP3, ageP3);

        // 会員番号が範囲外の場合は再入力
        while (true) {
            if (p3.CheckNoMethod() == false) {
                System.out.println("会員番号入力エラー、もう一度正しく入力してください。");
                System.out.print("三人目の会員番号（1000～3999）を入力＝＞");
                memberNumP3 = s.nextInt();
                p3.ChangeMethod(memberNumP3);
            } else {
                break;
            }
        }

        // 各会員の情報を表示
        p1.PrintMethod();
        p2.PrintMethod();
        p3.PrintMethod();
        s.close();
    }
}
