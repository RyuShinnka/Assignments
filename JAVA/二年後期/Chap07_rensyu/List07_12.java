import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class List07_12 {
	public static void main(String[] args) {
		try {
//			ファイル入力用のストリーム構築
			FileReader fr = new FileReader("D:/chap07/test.txt");
			BufferedReader br = new BufferedReader(fr);
//			ファイル出力用のストリームを構築
			FileWriter fw = new FileWriter("D:/chap07/test2.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			String s; //1行ずつ読み込んだ文字列を格納する
			int lineNumber = 1; //行番号のカウントをする
			while((s = br.readLine()) != null) { //ｓがnullまでの繰り返し
				bw.write(lineNumber+"行：\t"+ s+ "\r\n");
				lineNumber++;
			}
			br.close();
			bw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
