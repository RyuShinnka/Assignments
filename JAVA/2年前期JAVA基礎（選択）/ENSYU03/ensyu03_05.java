import java.util.Scanner;
public class ensyu03_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("値を入力＝＞");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("正でない値が入力されました。");
		} else if(num % 5 != 0) {
			System.out.println("その値"+ num+"は、5で割り切れません");
		}else if(num % 5 == 0){
			System.out.println("その値"+ num+"は、5で割り切れます");
		}
		sc.close();
	}
}
