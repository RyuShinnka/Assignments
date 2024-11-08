public class List4_M02 {
    public static double getRectangleArea(double width, double height) {
        return  width * height;// 長方形の面積を戻る
    }

    public static void main(String[] args) {
        double result = getRectangleArea(5.0, 3.0);
        System.out.println("長方形の面積は："+(int)result);
    }
}
