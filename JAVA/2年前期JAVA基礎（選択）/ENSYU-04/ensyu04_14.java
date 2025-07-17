import java.util.Scanner;
public class ensyu04_14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int avr = 0;
        System.out.print("何個加算しますか=>");
        int plus = sc.nextInt();
        int[] lst = new int [plus];
        
        // 値を入力し、正の値だけ加算
        for(int i = 0; i< plus;i++) {
        	System.out.print("整数値"+ (i+1)+ "=>");
        	lst[i] = sc.nextInt();
        	if(lst[i] < 0) {
        		System.out.println("負の数は加算しません。");
        	}else {
        		sum += lst[i];
        		avr++;
        	}
        }
        // 平均を計算
        avr = sum / avr;
    	
    	System.out.println("合計は："+ sum + "です。");
    	System.out.println("平均は："+ avr + "です。");
        
        sc.close();
	}

}
