import java.util.Scanner;
public class ensyu04_15 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("段数 => ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            // スペースの出力
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

            // 数字の出力
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(i);
            }

            // 改行
            System.out.println();
        }
        sc.close();
	}

}
