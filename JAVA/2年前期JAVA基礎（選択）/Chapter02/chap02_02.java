import java.util.Scanner;

public class chap02_02 {
    public static void main(String[] args) {
        // Scannerを使用してユーザーから入力を受け取る
        Scanner s = new Scanner(System.in);
        
        // 身長の入力を受け取る
        System.out.print("身長＝＞");
        double height = s.nextDouble();

        // 体重の入力を受け取る
        System.out.print("体重＝＞");
        double weight = s.nextDouble();
        
        // BMIを計算する式
        double BMI = weight / (height * height);

        // 計算結果を整数にキャストして表示
        int intBMI = (int)BMI;
        System.out.print("あなたのBMIは");
        System.out.println(intBMI + "です。");
        
        // Scannerを閉じる
        s.close();
    }
}
