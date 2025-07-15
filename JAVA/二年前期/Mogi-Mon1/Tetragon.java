class Tetragon extends Shape implements Area {
	double length; //たての長さ
	double width;//横の長さ
	
	Tetragon(int no, double length, double width){
		super(no, "四角形");
		this.length = length;
		this.width = width;
	}
	public void draw() {
		super.showInfo();
		System.out.println("四角形の面積を求める計算式");
	    System.out.println("面積 = " + length + " × " + width);
	    for(int i = 0; i < length; i++) {
	        for(int j = 0; j < width; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
	
	public double getArea() {
		return length * width; //たての長さ×横の長さ
	}
}
