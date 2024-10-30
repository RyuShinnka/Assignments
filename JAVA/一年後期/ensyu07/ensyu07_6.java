import java.util.Scanner;

public class ensyu07_6 {
    // 月から季節を判定する関数
    public static String printSeason(int m) {
        String season;
        if (m >= 3 && m <= 5) {
            season = "春";
        } else if (m >= 6 && m <= 8) {
            season = "夏";
        } else if (m >= 9 && m <= 11) {
            season = "秋";
        } else {
            season = "冬";
        }
        return season;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        boolean check = true;
        int month = 0;

        // 1～12の範囲の入力を確認
        while (check) {
            System.out.println("1～12を入力＝＞");
            month = s.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("入力エラー、もう一度入力してください。");
            } else {
                check = false;
            }
        }
        
        // 季節を判定して表示
        String result = printSeason(month);
        System.out.println(month + "月は、" + result + "の季節です");
        s.close();
    }
}
