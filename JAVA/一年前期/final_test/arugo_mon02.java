// アルゴリズム期末試験
// 問題2
import java.util.Scanner;

public class arugo_mon02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("整数を入力してください＝＞");
        int num = s.nextInt(); // キ－ボ－ドから入力された整数
        
        // 3の倍数でもあり4の倍数でもある
        if (num % 3 == 0 && num % 4 == 0) {
            System.out.println("入力可能性整数"); 
        } 
        // 3の倍数または4の倍数どちらかの時
        else if (num % 3 == 0 || num % 4 == 0) {
            System.out.println("入力チェックが必要"); 
        } else {
            System.out.println("入力不可"); 
        	}
        s.close();
    }
}
