public class chap02_01 {
    public static void main(String[] args) {
        // 三角形の底辺と高さを定義
        double base = 3.5;
        double height = 5.6;

        // 三角形の面積を計算（小数）
        double result = base * height / 2;

        // 小数を整数に変換（キャスト）
        int intResult = (int) result;

        // 結果を表示
        System.out.println("三角形の面積＝" + intResult + "cm²");
    }
}
