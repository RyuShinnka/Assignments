import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class List07_03 {
	public static void main(String[] args) {
		try {
			File file = new File("D:/java/test.txt");
//			実行する旅にファイルの中身を空にして、ファイルの先頭から文字列を書き出します
//			ファイルの中身を空にせず、FileWriter fw = new FileWriter(file, true);
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<5; i++) {
				bw.write("["+i+"]");
				bw.newLine(); //改行
			}
			bw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
