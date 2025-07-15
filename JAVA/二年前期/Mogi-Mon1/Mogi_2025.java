public class Mogi_2025 {
	public static void main(String[] args) {
		Area[] shapes = new Area[3];
		
		Shape line = new Polyline(1, 10);
		shapes[0] = new Circle(2, 2.5);
		shapes[1] = new Tetragon(3, 4.0, 6.0);
		shapes[2] = new Polygon(4, 6, 10, 5);
		line.draw();
		System.out.println("ーーーーーーーーーー");
		
		for(int i = 0;i <3; i++) {
			((Shape)shapes[i]).draw();
			double area = shapes[i].getArea();
			System.out.println("面積："+ area);
		}
		
	} 
}
