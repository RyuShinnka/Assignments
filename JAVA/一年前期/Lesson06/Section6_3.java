import java.util.Scanner;

public class Section6_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("整数値入力: ");
            int number = s.nextInt();

            if (number == 0) {
                break; // 入力が0の場合、ループを終了
            }

            sum += number;
            count++;
        }

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("合計=" + sum);
            System.out.println("平均=" + (int) avg);
        } else {
            System.out.println("数値が入力されていません。");
        }

        s.close();
    }
}
