public class mon4_15 {
    public static void main(String[] args) {

        // 幅3.14、高さ9.1592の長方形を生成し、面積を表示
        Rectangle rArea = new Rectangle(3.14, 9.1592);
        System.out.println("長方形の面積は：" + rArea.getArea());

        // 同じ寸法で三角形の面積を計算して表示
        Rectangle tArea = new Rectangle(3.14, 9.1592);
        double tAreaResult = tArea.getTriangleArea();
        System.out.println("三角形の面積は：" + tAreaResult);

        // 半径3.9の円の面積を計算して表示
        Rectangle circleArea = new Rectangle(3.9);
        double circleAreaResult = circleArea.getCircleArea();
        System.out.println("円の面積は：" + circleAreaResult);
    }
}
