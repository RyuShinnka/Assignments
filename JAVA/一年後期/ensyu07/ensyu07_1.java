import java.util.Scanner;
public class ensyu07_1 {
    // 整数を判定する
    public static int signof(int n) {
        int result;
        if (n < 0) {
            result = -1;
        } else if (n == 0) {
            result = 0;
        } else {
            result = 1;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        // 整数を入力
        System.out.print("整数を入力＝＞");
        int num = s.nextInt();
        
        // 符号判定を表示
        int result = signof(num);
        System.out.println(result);
        s.close();
    }
}
