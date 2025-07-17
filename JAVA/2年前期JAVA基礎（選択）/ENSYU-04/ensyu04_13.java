import java.util.Scanner;
public class ensyu04_13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("何個☆表示する＝＞ ");
        int num = sc.nextInt();
        
        // 指定された数だけ☆を表示（5個ごとに改行）
        for(int i=1; i<=num; i++){
        	System.out.print("☆");
        	if( i % 5 == 0){
                System.out.println();
            }
            
        }
        sc.close();
	}
}
