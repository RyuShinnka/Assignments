public class ensyu07_04 {

    // 1からnまでの和を求めるメソッド（メソッド名：sumTo）
    public static int sumTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // n の値を指定
        int n = 10;
        System.out.println("n = " + n);

        // sumTo メソッドを呼び出して結果を表示
        int result = sumTo(n);
        System.out.println("1から" + n + "までの和は " + result);
    }
}
