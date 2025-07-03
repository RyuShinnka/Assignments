import java.util.Scanner;
public class ensyu03_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("正の整数値を入力＝＞");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("正でない値が入力されました。");
		} else if(num % 3 == 0) {
			System.out.println("その値"+ num+"は、3で割り切れます");
		}else if(num % 3 == 1){
			System.out.println("その値"+ num+"は、3で割った余りは1です。");
		}else if(num % 3 == 2) {
			System.out.println("その値"+ num+"は、3で割った余りは2です。");
		}
		sc.close();
	}
}
