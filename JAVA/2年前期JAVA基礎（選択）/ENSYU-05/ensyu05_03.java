import java.util.Scanner;
public class ensyu05_03 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avr = 0;
        System.out.println("99999を入力すると終了します");
        while(true) {
        	System.out.print("整数値を入力＝＞");
        	int value = sc.nextInt();
        	if(value == 99999) {
        		System.out.println("\n ＝＝＝終了します＝＝＝");
        		break;
        	}
        	if(value < 0) {
        		continue;
        	}
        	sum += value;
        	avr++;
        }
        System.out.println("\n入力した負の数は加算しないので");
        System.out.println("合計値："+ sum);
        System.out.println("平均値："+ avr);
        
        sc.close();
    }
}
