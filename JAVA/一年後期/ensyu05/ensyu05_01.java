import java.util.Scanner;
public class ensyu05_01 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int sum =0;
		int avg =0;
		while(true) {
			System.out.print("加算する整数の個数を入力＝＞");
			int kosuu = s.nextInt();
			if(kosuu == 0) {
				System.out.println("0なので処理を終了します。");
				break;
			}
			for(int i=1;i<(kosuu+1);i++) {
				System.out.print(i+"個目の整数を入力＝＞");
				sum+=s.nextInt();
			}
			avg=sum/kosuu;
			System.out.println("合計は："+sum+"平均は："+avg);
		}
		s.close();
	}
}
