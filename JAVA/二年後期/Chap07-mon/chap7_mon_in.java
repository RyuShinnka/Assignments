import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class chap7_mon_in {
	public static void main(String[] args) {
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(in);
			File file = new File("D:/java/test7.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("１月から6月までの売上を入力してください");
			for(int i=0;i<6;i++) {
				System.out.print((i+1)+"月の売上:");
				String line = reader.readLine();
				int val = Integer.parseInt(line);
				bw.write(val+"\r\n");
			}
			System.out.println("入力完成しました");
			bw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
