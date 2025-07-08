import java.util.Scanner;

// 抽象クラス
abstract class School {
    public abstract void show();
    public abstract void wariaiMethod();
}

// 学科 Gakka
class Gakka extends School {
    private String gakkaName;
    private int lastYear;
    private int thisYear;

    public Gakka(String gakkaName, int lastYear, int thisYear) {
        this.gakkaName = gakkaName;
        this.lastYear = lastYear;
        this.thisYear = thisYear;
    }

    public int getThisYear() {
        return thisYear;
    }

    public void show() {
        System.out.println("＜" + gakkaName + "＞");
        System.out.println("前年度入学者数：" + lastYear);
        System.out.println("今年度入学者数：" + thisYear);
    }

    public void wariaiMethod() {
        double rate = (double) thisYear / lastYear * 100;
        System.out.println(gakkaName + "の入学者数の前年比は " + String.format("%.1f", rate) + "% です。");
    }
}

// 就職率）
class Koho extends School {
    private String senkouName;
    private int nyugakusha;      // 今年度入学者数
    private int naiteisha;       // 今年度の就職内定者数

    public Koho(String senkouName, int nyugakusha, int naiteisha) {
        this.senkouName = senkouName;
        this.nyugakusha = nyugakusha;
        this.naiteisha = naiteisha;
    }

    public void show() {
        System.out.println("＜" + senkouName + "＞");
        System.out.println("今年度の入学者数：" + nyugakusha);
        System.out.println("今年度の就職内定者数：" + naiteisha);
    }

    public void wariaiMethod() {
        double rate = (double) naiteisha / nyugakusha * 100;
        System.out.println(senkouName + "の就職率は " + String.format("%.1f", rate) + "% です。");
    }
}

// メインクラス
public class Section08_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"情報処理", "WEBクリエイター", "経理", "グローバルビジネス"};
        int[] lastYearNyugaku = {20, 10, 60, 80};

        Gakka[] gakkas = new Gakka[names.length];
        Koho[] kohos = new Koho[names.length];

        System.out.println("【キーボードから入力】");

        for (int i = 0; i < names.length; i++) {
            System.out.println("\n◆ " + names[i]);

            System.out.print("今年度の入学者数を入力：");
            int thisYear = sc.nextInt();

            System.out.print("今年度の就職内定者数を入力：");
            int thisYearNaitei = sc.nextInt();

            gakkas[i] = new Gakka(names[i], lastYearNyugaku[i], thisYear);
            kohos[i] = new Koho(names[i], thisYear, thisYearNaitei); 
        }

        System.out.println("\n====================");
        System.out.println("《入学者数 前年比》");
        for (int i = 0; i < gakkas.length; i++) {
            gakkas[i].show();
            gakkas[i].wariaiMethod();
            System.out.println();
        }

        System.out.println("《就職率》");
        for (int i = 0; i < kohos.length; i++) {
            kohos[i].show();
            kohos[i].wariaiMethod();
            System.out.println();
        }

        sc.close();
    }
}
