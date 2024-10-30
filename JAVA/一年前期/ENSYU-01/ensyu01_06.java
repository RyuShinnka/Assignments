import java.util.Scanner;
public class ensyu01_06 {
    public static void main(String[] args) {
        // 名前と日付を入力
        Scanner s = new Scanner(System.in);
        System.out.print("名前を入力＝＞");
        String name = s.next();
        System.out.print("今日の日付（年）を入力=>");
        int year = s.nextInt();
        System.out.print("今日の日付（月）を入力=>");
        int month = s.nextInt();
        System.out.print("今日の日付（日）を入力=>");
        int day = s.nextInt();
        
        // 結果を表示
        System.out.print("私の名前は" + name + "です。今日の日付は" + year + "年" + month + "月" + day + "日です");
        s.close();
    }
}
