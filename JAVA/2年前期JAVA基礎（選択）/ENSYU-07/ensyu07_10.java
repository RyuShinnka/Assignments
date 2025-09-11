import java.util.Random;
import java.util.Scanner;

public class ensyu07_10 {

    // 出題と正解を返すメソッド
    static int showQuestion(int x, int y, int z, int pattern) {
        int answer = 0;

        switch (pattern) {
            case 1:
                System.out.printf("%d+%d+%d = ", x, y, z);
                answer = x + y + z;
                break;
            case 2:
                System.out.printf("%d+%d-%d = ", x, y, z);
                answer = x + y - z;
                break;
            case 3:
                System.out.printf("%d-%d+%d = ", x, y, z);
                answer = x - y + z;
                break;
            case 4:
                System.out.printf("%d-%d-%d = ", x, y, z);
                answer = x - y - z;
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\n＊＊＊暗記力トレーニング＊＊＊\n");

        while (true) {
            int x = rand.nextInt(900) + 100; // 100〜999
            int y = rand.nextInt(900) + 100;
            int z = rand.nextInt(900) + 100;
            int pattern = rand.nextInt(4) + 1;

            int correctAnswer = showQuestion(x, y, z, pattern);
            int userAnswer = sc.nextInt();

            // 間違っていたら
            if (userAnswer != correctAnswer) {
                System.out.println("違いますよ！");
                System.out.println(showQuestion(x, y, z, pattern)+ correctAnswer);
            }
            if(userAnswer == correctAnswer) {
            	System.out.println("正解！");
            }
            // 正解だったら、次の問題へ
            System.out.print("もう一度トライ？ Yes = 1 ／ No = 0 ＝＞ ");
            int retry = sc.nextInt();
            if (retry != 1) {
                break;
            }
            System.out.println(); // 改行
        }

        sc.close();
    }
}
