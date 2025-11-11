import java.util.ArrayList;

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
//	xとｙの値を出力します
	void printInfo() {
		System.out.println("("+ this.x + ", "+ this.y + ")");
	}
}
public class List06_06_forEach {
	public static void main(String[] args) {
//		Pointオブジェクトを格納するためのArrayListオブジェクトを生成します
		ArrayList<Point> pointList = new ArrayList<Point>();
//		ArrayListに４つのPointオブジェクトを格納します
		pointList.add(new Point(0, 8));
		pointList.add(new Point(1, 6));
		pointList.add(new Point(2, 9));
		pointList.add(new Point(3, 3));

		pointList.sort((p0, p1) -> (p0.x + p0.y) - (p1.x + p1.y));
		pointList.forEach(p -> p.printInfo());
	}
}
