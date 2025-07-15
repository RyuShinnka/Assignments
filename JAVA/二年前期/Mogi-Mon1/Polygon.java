class Polygon extends Polyline implements Area {
    int topBase;
    int bottomBase;

    Polygon(int no, int topBase, int bottomBase, int height) {
        super(no, height); 
        this.name = "台形"; 
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    public void draw() {
        super.showInfo(); 
        System.out.println("台形の面積を求める計算式");
        System.out.println("( " + topBase + " + " + bottomBase + " ) × " + length + " ÷ 2");
    }

    public double getArea() {
        return (topBase + bottomBase) * length / 2.0; 
    }
}
