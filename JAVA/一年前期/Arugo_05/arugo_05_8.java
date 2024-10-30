import java.util.Scanner;
public class arugo_05_8 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("1つ目の数値を入力してください: ");
        int num1 = s.nextInt();
        
        System.out.print("2つ目の数値を入力してください: ");
        int num2 = s.nextInt();
        
        int result = 0;
        int counter = 0;

        while (counter < num2) {
            result += num1;
            counter++;
        }
        s.close();
        System.out.println("結果: " + result);
    }
}
