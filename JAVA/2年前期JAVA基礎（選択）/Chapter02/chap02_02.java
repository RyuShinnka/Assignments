import java.util.Scanner;

public class chap02_02 {
    // BMIに基づいて体型を判定するメソッド
    public static void hantei(int bmi) {
        
    }

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
        int intBMI = (int) BMI;
        System.out.print("あなたのBMIは");
        System.out.print(intBMI + "です。");

        // BMIに基づいて体型を判定して表示
        if (intBMI > 27) {
            System.out.println("肥満型ですね");
        } else if (intBMI > 19) {
            System.out.println("普通型ですね");
        } else {
            System.out.println("やせ型ですね");
        }
        
        // Scannerを閉じる
        s.close();
    }
}
