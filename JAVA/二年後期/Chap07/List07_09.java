import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class List07_09 {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("D:/java/triangle.ser");
			ObjectInputStream os = new ObjectInputStream(fs);
			Triangle tri = (Triangle)os.readObject();
			os.close();
			
			System.out.println(tri.p0.x + "," + tri.p0.y);
			System.out.println(tri.p1.x + "," + tri.p1.y);
			System.out.println(tri.p2.x + "," + tri.p2.y);
		}catch(IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
