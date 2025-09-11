public class ensyu07_03 { 

    // 3つのint値の中央値を返すmedメソッド
    public static int med(int x, int y, int z) {
        if ((x >= y && x <= z) || (x <= y && x >= z)) {
            return x;
        } else if ((y >= x && y <= z) || (y <= x && y >= z)) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        // 例として3つの整数を用意
        int X = 39;
        System.out.println("X = " + X);
        int Y = -9;
        System.out.println("Y = " + Y);
        int Z = 23;
        System.out.println("Z = " + Z);

        // medメソッドを呼び出して結果を表示
        int result = med(X, Y, Z);
        System.out.println("中央値は: " + result);
    }
}
