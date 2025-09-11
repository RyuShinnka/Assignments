public class ensyu07_02 {

    // 3つのint値の最小値を返すminメソッド
    public static int min(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        // 例として3つの整数を用意
        int A = 39;
        System.out.println("A="+ A);
        int B = -9;
        System.out.println("B="+ B);
        int C = 23;
        System.out.println("C="+ C);

        // minメソッドを呼び出して結果を表示
        int result = min(A, B, C);
        System.out.println("最小値は: " + result);
    }
}
