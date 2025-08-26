class Polyline extends Shape{
	int length;
	Polyline(int no, int length){
		super(no);
		this.length = length;
		
	}
	public void draw() {
		super.showInfo();
		System.out.println("直線を描く");
		System.out.println("ーを"+length+"個分描く");
		for(int i = 0; i<length;i++) {
			System.out.print("ー");
		}
		System.out.println();
	}

}