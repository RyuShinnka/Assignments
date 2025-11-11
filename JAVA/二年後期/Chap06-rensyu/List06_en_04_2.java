import java.util.ArrayList;
import java.util.function.Consumer;

class Point1{
	int x;
	int y;
	
	Point1(int x, int y){
		this.x = x;
		this.y = y;
	}
//	xとｙの値を出力します
	void printInfo() {
		System.out.println("("+ this.x + ", "+ this.y + ")");
	}
}
public class List06_en_04_2 {
	public static void main(String[] args) {
//		Pointオブジェクトを格納するためのArrayListオブジェクトを生成します
		ArrayList<Point1> pointList = new ArrayList<Point1>();
//		ArrayListに４つのPointオブジェクトを格納します
		pointList.add(new Point1(0, 8));
		pointList.add(new Point1(1, 6));
		pointList.add(new Point1(2, 9));
		pointList.add(new Point1(3, 3));
//		ラムダ式を使わない: ｘの値とｙの値を入れ替える
		pointList.forEach(new Consumer<Point1>() {
			public void accept(Point1 p) {
				int tmp = p.y;
				p.y = p.x;
				p.x = tmp;
			}
		});
		
//		ラムダ式を使わない: ｙの値が大きい順に並べ替える
		pointList.sort(new java.util.Comparator<Point1>() {
			public int compare(Point1 p0, Point1 p1) {
				return p1.y - p0.y;
			}
		});
//		出力
		for (Point1 p : pointList) {
			p.printInfo();
		}
	}
}
