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
public class List06_en_04_1 {
	public static void main(String[] args) {
//		Pointオブジェクトを格納するためのArrayListオブジェクトを生成します
		ArrayList<Point> pointList = new ArrayList<Point>();
//		ArrayListに４つのPointオブジェクトを格納します
		pointList.add(new Point(0, 8));
		pointList.add(new Point(1, 6));
		pointList.add(new Point(2, 9));
		pointList.add(new Point(3, 3));
//		ラムダ式 ｘの値とｙの値を入れ替える
		pointList.forEach(p -> {int tmp = p.y; p.y = p.x; p.x = tmp;});
		
//		ラムダ式 ｙの値が大きい順に並べ替える
		pointList.sort((p0, p1) -> p1.y - p0.y);
//		出力
		for (Point p : pointList) {
			p.printInfo();
		}
	}
}
