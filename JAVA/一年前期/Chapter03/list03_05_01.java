import java.util.Scanner;

public class list03_05_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("値を入力してください: ");
        int A = scanner.nextInt();
//三項演算子
//（条件演算子とも呼ばれます）を使ってif...else if...elseを変わります。
        String result = (A == 30) ? "取消の値です" : 
                        (A >= 20 && A <= 35) ? "正常値入力" : "入力エラー";

        System.out.println(result);
        scanner.close();
    }
}
