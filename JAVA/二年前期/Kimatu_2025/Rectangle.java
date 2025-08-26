class Rectangle  extends Polyline {
	int width;
	
	Rectangle(int no, int height, int width){
		super(no, height);
		this.width = width;
	}
	public void draw() {
		super.showInfo();
		System.out.println("四角形を描く");
	    System.out.println("縦： " + length + " 　横： " + width);
	    for(int i = 0; i < length; i++) {
	        for(int j = 0; j < width; j++) {
	            System.out.print("□");
	        }
	        System.out.println();
	    }
	}
}