import java.util.Scanner;
public class kimatu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 円の半径
        System.out.print("円形の半径＝＞");
        double r = sc.nextDouble();

        // 台形の上底
        System.out.print("台形の上底＝＞");
        double top = sc.nextDouble();

        // 台形の下底
        System.out.print("台形の下底＝＞");
        double bottom = sc.nextDouble();

        // 台形の高さ
        System.out.print("台形の高さ＝＞");
        int h = sc.nextInt();
        
     // Shape 配列にまとめる
        Shape[] shapes = {
            new Circle(2, r),                  // 円形
            new Polygon(4, top, bottom, h), // 台形
            new Polyline(1, 10),               // 直線
            new Rectangle(3, 4, 6),            // 四角形
            new Triangle(5, 7)                 // 三角形
        };

        //  draw()
        for (Shape s : shapes) {
            s.draw();
        }
        
        sc.close();
	} 
}