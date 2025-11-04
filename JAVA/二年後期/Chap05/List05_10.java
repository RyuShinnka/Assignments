import java.util.ArrayList;
import java.util.Collections;
//Comparable<Point>インタフェースを実装
class Point implements Comparable<Point>{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
//引数で渡されたインスタンスと自分自身を比較して、
//	その差を戻すメソッドを定義します
	public int compareTo(Point p) {
//		フィールドのｘとｙを足した値で比較し、その差を戻り値とします
		return (this.x + this.y)- (p.x + p.y);
	}
}
public class List05_10 {
	public static void main(String args[]) {
		ArrayList<Point> pointList = new ArrayList<Point>();
		
		pointList.add(new Point(0, 8));
		pointList.add(new Point(1, 6));
		pointList.add(new Point(2, 9));
		pointList.add(new Point(3, 3));
		//sortメソッドの引数にコレクションを渡して、並べ替えを実行します
		Collections.sort(pointList);
		
		for(Point p: pointList) {
//並べ替えた結果を出力します・参考までにｘとｙを足した値も出力します
			System.out.println("("+ p.x+ ","+ p.y+ ")=>"+ (p.x+ p.y));
		}
	}
}
