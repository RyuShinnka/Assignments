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
        String genderText = (this.gender == 1) ? "男子" : "女子";
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
        
        // 会員情報を管理する配列を作成
        PeopleCard[] peopleCards = new PeopleCard[3];

        // 3人分の会員情報を入力
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "人目の名前を入力＝＞");
            String name = s.next();
            System.out.print((i + 1) + "人目の会員番号（1000～3999）を入力＝＞");
            int memberNum = s.nextInt();
            System.out.print((i + 1) + "人目の性別（男性：1、女性：2）を入力＝＞");
            int gender = s.nextInt();
            System.out.print((i + 1) + "人目の年齢を入力＝＞");
            int age = s.nextInt();

            // 会員情報を作成
            PeopleCard person = new PeopleCard(name, memberNum, gender, age);
            // 会員番号が範囲外の場合は再入力
            while (!person.CheckNoMethod()) {
                System.out.println("会員番号入力エラー、もう一度正しく入力してください。");
                System.out.print((i + 1) + "人目の会員番号（1000～3999）を入力＝＞");
                memberNum = s.nextInt();
                person.ChangeMethod(memberNum);
            }

            // 配列に格納
            peopleCards[i] = person;

            System.out.println("ーーーーーーーーーー");
        }

     // 各会員の情報を表示
        for (int i = 0; i < peopleCards.length; i++) {
            peopleCards[i].PrintMethod();
        }

        s.close();
    }
}
