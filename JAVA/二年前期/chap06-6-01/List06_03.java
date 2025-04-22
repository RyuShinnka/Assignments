import java.util.Scanner;

public class List06_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StudentCard[] gakuseiList = new StudentCard[3]; // 3人分

        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "人目の学籍番号を入力＝＞");
            int bangou = s.nextInt();

            System.out.print((i + 1) + "人目の氏名を入力＝＞");
            String namae = s.next();

            System.out.print((i + 1) + "人目の成績点を入力＝＞");
            int seiseki = s.nextInt();

            // 学生情報を作成して配列に格納
            gakuseiList[i] = new StudentCard(bangou, namae, seiseki);
            gakuseiList[i].goukeiNiKasaneru();
        }

        // 各学生の情報を表示
        for (int i = 0; i < 3; i++) {
            System.out.println("★" + (i + 1) + "人目の情報");
            gakuseiList[i].johoHyouji();
            System.out.println();
        }

        // 合計表示
        System.out.println("三人の成績点の合計は：" + StudentCard.seisekiGoukei);

        s.close();
    }
}
