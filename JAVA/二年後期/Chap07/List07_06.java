import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class List07_06 {
	public static void main(String[] args) {
		try {
			File file = new File("D:/java/test.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s= br.readLine()) != null) {
				System.out.println(s+ "を読み込みました");
			}
			br.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
