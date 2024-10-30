public class Section5_4 {
    public static void main(String[] args) {
        // 縦が10横が10の表示を行う
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("＊\t");
            }
            System.out.println();
        }
    }
}
