class Polygon extends Polyline implements AreaMethod {
    double topBase;
    double bottomBase;

    Polygon(int no, double topBase, double bottomBase, double height) {
        super(no, (int)height); 
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    public void draw() {
        super.showInfo(); 
        System.out.println("台形の面積を求める計算式");
        System.out.println("( " + topBase + " + " + bottomBase + " ) × " + (double)length + " ÷ 2");
        System.out.println("面積：" + getArea());
    }

    public double getArea() {
        return (topBase + bottomBase) * length / 2.0; 
    }
}