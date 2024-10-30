import java.util.Scanner;

public class Section6_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 身長の範囲と間隔を入力してもらう
        System.out.print("何cmから: ");
        int h1 = s.nextInt();
        
        System.out.print("何cmまで: ");
        int h2 = s.nextInt();
        
        System.out.print("何cmごと: ");
        int interval = s.nextInt();

        // 入力された範囲内で標準体重を計算して表示する
        System.out.println("身長\t標準体重");
        for (int i = h1; i <= h2; i += interval) {
            double sw = (i - 100) * 0.9;
            System.out.println(i + "\t" +  sw);
        }

        s.close();
    }
}
