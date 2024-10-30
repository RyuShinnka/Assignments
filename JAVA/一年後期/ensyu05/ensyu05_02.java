import java.util.Scanner;
public class ensyu05_02 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int sum =0;
		int avg =0;
		int count=0;
		while(sum<1000) {
			System.out.print("足し算するの整数を入力＝＞");
			sum+=s.nextInt();
			count++;
			avg=sum/count;
			System.out.println("合計は："+sum+"平均は："+avg);
		}
		System.out.print("合計が1000を超えたので、終了します");
		s.close();
	}
}
