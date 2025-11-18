import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class chap7_mon_out {
	public static void main(String[] args) {
		try {
			File file = new File("D:/java/test7.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s;
			int index = 1;
			while((s= br.readLine()) != null) {
				System.out.println(index+ "月の売上は："+s+"円です");
			}
			br.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
