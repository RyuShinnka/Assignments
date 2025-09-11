public class ensyu07_07 {

    // 指定した文字Cをn個表示するメソッド
    static void putChars(char C, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(C);
        }
    }
    // putChars()を使って'*'をn個表示するメソッド
    static void putStars(int n) {
        putChars('*', n);
    }

    // メインメソッド：直角三角形を表示する
    public static void main(String[] args) {
        System.out.println("\n＝＝直角三角形を表示します＝＝\n");

        int height = 6; // 三角形の高さ

        for (int i = 1; i <= height; i++) {
            putStars(i); // i個の'*'を表示
            System.out.println(); // 改行
        }
    }
}
