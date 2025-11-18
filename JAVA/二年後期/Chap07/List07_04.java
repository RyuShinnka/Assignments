import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class List07_04 {
	public static void main(String[] args) {
		try {
			File file = new File("D:/java/test.txt");
//			実行する旅にファイルの中身を空にして、ファイルの先頭から文字列を書き出します
//			ファイルの中身を空にせず、FileWriter fw = new FileWriter(file, true);
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
//			BufferedWriterオブジェクトにPrintWriterオブジェクトを連結します
			PrintWriter pw = new PrintWriter(bw);
			for(int i=0;i<5; i++) {
//				PrintWriterオブジェクトのprintlnメソッドを使って出力します
				pw.println("["+i+"]");
			}
			pw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
