import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class List07_08 {
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.p0 = new Point(0, 0);
		tri.p1 = new Point(10, 0);
		tri.p2 = new Point(5, 10);
		
		try {
			FileOutputStream fs = new FileOutputStream("D:/java/triangle.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(tri);
			os.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
