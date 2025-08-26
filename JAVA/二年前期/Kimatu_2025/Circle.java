class Circle extends Shape implements AreaMethod{
	final double pi = 3.14;
	double radius;
	
	Circle(int no, double radius){
		super(no);
		this.radius = radius;
	}
	
	public void draw() {
		super.showInfo();
		System.out.println("円の面積を求める計算式");
		System.out.println("(" + radius + " × " + radius + ")" + " × " + "π");
		System.out.println("面積：" + getArea());
	}
	public double getArea() {
		return radius * radius * pi;
	}
}