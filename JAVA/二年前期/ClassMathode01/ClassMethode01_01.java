import java.util.Scanner;

public class ClassMethode01_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 会員情報を最大20人まで格納できる配列を用意
        Membership[] members = new Membership[20];

        // 登録する人数を入力
        System.out.print("登録する人数を入力=>");
        int num = s.nextInt();

        // 指定された人数分、データを入力
        for (int i = 0; i < num; i++) {
            System.out.println();
            System.out.println((i + 1) + "人目のデータを入力ください。");

            // 名前の入力
            System.out.print("名前を入力＝＞");
            String name = s.next();

            // 学校種別（1:小学校、2:中学校、3:高校）の入力
            System.out.print("学校番号(小学校＝1：中学校＝2：高校＝３)を入力＝＞");
            int school = s.nextInt();

            // 学年の入力
            System.out.print("学年を入力＝＞");
            int grade = s.nextInt();

            // 会員データを作成し、配列に格納
            members[i] = new Membership(name, school, grade);

            // 学校種別ごとの人数をカウント
            members[i].count();
        }
        //登録する人数を表示する
        System.out.println("---------会員情報を表示START---------");
        for(int i=0; i<num;i++) {
        	members[i].showInfo();
        }
        System.out.println("---------会員情報を表示END---------");
        // 各学校ごとの人数を表示
        System.out.println();
        System.out.println("---------学校ごとの人数表示START---------");
        System.out.println("小学校の人数：" + Membership.counte);
        System.out.println("中学校の人数：" + Membership.countj);
        System.out.println("高校の人数：" + Membership.counth);
        System.out.println("---------学校ごとの人数表示END---------");
        // 中学校の人数の％を求める
        Membership.calc();

        // Scannerを閉じる
        s.close();
    }
}
