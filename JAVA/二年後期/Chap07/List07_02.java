import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class List07_02 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader  = new BufferedReader(in);
		try {
			String line = reader.readLine();
//			標準入力から受け取った文字列をdouble型の数値に変換します
			double val = Double.parseDouble(line);
			System.out.println("入力された値の平方根は"+ Math.sqrt(val));
			reader.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("");
	}
}
