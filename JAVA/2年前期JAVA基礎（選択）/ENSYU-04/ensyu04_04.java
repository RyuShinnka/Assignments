import java.util.Scanner;
public class ensyu04_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 2つの整数を入力
        System.out.print("1つ目の整数を入力=>");
        int num1 = sc.nextInt();

        System.out.print("2つ目の整数を入力=>");
        int num2 = sc.nextInt();

     // num1 <= num2 の場合
        if (num1 <= num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.print(i);
            }
        }
        // num2 < num1 の場合
        else {
            for (int i = num2; i <= num1; i++) {
                System.out.print(i);
            }
        }

        sc.close();
	}
}
