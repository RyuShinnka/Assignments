import java.util.Scanner;
public class ensyu07_4 {
    // 1から指定された整数までの合計を計算
    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("nに代入したい整数を入力＝＞");
        int n = s.nextInt();
        
        // 合計を計算して表示
        int result = sum(n); 
        System.out.println("１から" + n + "までの全整数の和は：" + result);
        s.close();
    }
}
