class Polyline extends Shape implements Area{
	int length;
	Polyline(int no, int length){
		super(no, "直線");
		this.length = length;
		
	}
	public void draw() {
		super.showInfo();
		System.out.println("直線を描く");
	}
	public double getArea() {
		return length;
	}
}
