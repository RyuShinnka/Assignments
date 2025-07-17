import java.util.Scanner;
public class ensyu05_02 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avr = 0;
        
        // 最初の入力
        System.out.print("整数値を入力＝>");
        int num = sc.nextInt();
        
        // 合計が1000を超えるまで合計と件数をカウント
        while(true) {
            sum += num;
            avr++;
            
            if(sum> 1000) {
            	break;
            }
            System.out.print("整数値を入力＝>");
            num = sc.nextInt();
		}
        // 平均を計算して表示
        avr = sum / avr;
        System.out.println("合計: " + sum);
        System.out.println("平均: " + avr);
        sc.close();
    }
}
