import java.util.Scanner;
public class ensyu05_03 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int sum =0;
		int avg =0;
		int count=0;
		while(true) {
			System.out.print("足し算するの整数を入力＝＞");
			int num =s.nextInt();
			if(num == 0) {
				System.out.println("0なので処理を終了します。");
				break;
			}
			if(num<0) {
				continue;
			}
			sum+=num;
			count++;
			avg=sum/count;
			System.out.println("合計は："+sum+"平均は："+avg);
		}
		s.close();
	}
}
