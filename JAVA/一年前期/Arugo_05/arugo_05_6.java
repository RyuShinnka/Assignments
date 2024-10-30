//キーボードから入力した値を足し加えて、合計が 300 を超えるまで繰り返す。ただし、入力された値が偶数の場
//合のみ合計していく事。その足し加えた偶数の数もカウントしておき最後に表示しましょう。
import java.util.Scanner;
public class arugo_05_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		int sum=0;
		int cnt=0;
		
		while(sum<=300) {
			System.out.println("数値を入力してください:");
			num= s.nextInt();
			
			if( num % 2 ==0) {
				sum+=num;
				cnt++;
			}
		}
        System.out.println("偶数の合計値: " + sum);
        System.out.println("偶数の数: " + cnt);
		s.close();
	}
	}
