//配列問題４
//キーボードから入力された値を、奇数又は偶数の判断をし、
//それぞれの奇数の入力数と偶数の入力数をカウントし、表示する
//入力される値の範囲は無く、０が入力された時終了する。
import java.util.Scanner;
public class arugo01_04 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num;
		int count1=0;
		int count2=0;
		while(true) {
			System.out.print("整数を入力（０の場合はプログラム終了）＝＞");
			num = s.nextInt();
			if(num == 0) {
				System.out.println("0だから、プログラム終了");
				break;
			}else if(num % 2 ==0) {
				count2++;
			}
			else {
				count1++;
			}
		}
		System.out.println("入力した奇数の数は："+count1);
		System.out.println("入力した偶数の数は："+count2);
		s.close();
	}
}
