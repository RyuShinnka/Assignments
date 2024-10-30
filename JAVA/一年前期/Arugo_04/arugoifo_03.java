//	分岐処理応用　問題3

import java.util.Scanner;
public class arugoifo_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age, m;

        // 年齢別の入力
        System.out.print("年齢グループを入力してください（10代と60代以上は'1'、20代と30代は'2'、40代と50代は'3'）：");
        age = s.nextInt();

        // 既婚か未婚の入力
        System.out.print("既婚は1を、未婚は2を入力してください：");
        m = s.nextInt();

        // 支給金額の決定
        if (age == 1) {
            if (m == 1) {
            	System.out.print("30000円です");
            } else {
            	System.out.print("10000円です");
            }
        } else if (age == 2) {
            if (m == 1) {
            	System.out.print("50000円です");
            }else {
            	System.out.print("20000円です");
            }
        } else if (age == 3) {
            if (m == 1) {
            	System.out.print("70000円です");
            } else{
            	System.out.print("40000円です");
            } 
		s.close();
        }
	}
}
