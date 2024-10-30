public class Section6_4 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            // 空白を出力するループ
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // *を出力するループ
            for (int k = 0; k < (4 - i) * 2 - 1; k++) {
                System.out.print("*");
            }
            // 次の行へ移動
            System.out.println();
        }
    }
}
