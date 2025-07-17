import java.util.Scanner;
public class ensyu04_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("何ｃｍから＝＞");
        int start = sc.nextInt();
        System.out.print("何ｃｍまで＝＞");
        int end = sc.nextInt();
        System.out.print("何ｃｍごと＝＞");
        int step = sc.nextInt();
     // 指定範囲内で身長と標準体重を表示
        System.out.println("身長  体重");
        for (int i = start; i <= end; i += step) {
            double weight = (i - 100) * 0.9;
            System.out.println(i + "  " + weight);

        }
        sc.close();
    }
}