//④	クラス名　Section 3_4									
//										
//キーボードから体重と身長を入力します。									
//体重はｋｇ単位で入力									
//身長はｃｍ単位で入力									
//int型のデータ処理を行いましょう。									
//体重が50ｋｇ以上70ｋｇ未満まで身長が160ｃｍ以上で180ｃｍ未満の人の場合は「平均的な人です」と表示									
//体重が50ｋｇ未満で身長が160ｃｍ未満の人は「少し小さいひとです。」と表示します。									
//体重が70ｋｇ以上で身長が180ｃｍ以上の人は「大柄なひとです。」と表示します。									
//この条件に当てはまらない人は、体重と身長を表示します。									

import java.util.Scanner;

public class Section3_4 {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);

        System.out.print("体重（kg）を入力してください：");
        int weight = s.nextInt();

        System.out.print("身長（cm）を入力してください：");
        int height = s.nextInt();

        if (weight >= 50 && weight < 70 && height >= 160 && height < 180) {
            System.out.println("平均的な人です");
        } else if (weight < 50 && height < 160) {
            System.out.println("少し小さい人です");
        } else if (weight >= 70 && height >= 180) {
            System.out.println("大柄な人です");
        } else {
            System.out.println("体重：" + weight + "kg, 身長：" + height + "cm");
        }

        s.close();
    
    }
}
