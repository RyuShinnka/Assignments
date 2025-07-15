class Circle extends Shape implements Area{
	final double pi = 3.14;
	double radius;
	
	Circle(int no, double radius){
		super(no, "円形");
		this.radius = radius;
	}
	
	public void draw() {
		super.showInfo();
		System.out.println("円の面積を求める計算式");
		System.out.println("(" + radius + " × " + radius + ")" + " × " + "π");
	}
	public double getArea() {
		return radius * radius * pi;
	}
}
