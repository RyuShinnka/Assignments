import java.util.Scanner;

public class arugo04_03 {

    public static void main(String[] args) {
        // 出席番号が入った配列table
        int[] table = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};

        // 名前が入った配列array
        String[] array = {"田中", "鈴木", "佐藤", "高橋", "伊藤", "山本", "中村", "小林", "加藤", "山田"};

        // 出席番号をキーボードから入力
        Scanner s = new Scanner(System.in);
        System.out.print("出席番号を入力してください: ");
        int input = s.nextInt();
        s.close();
        // シーケンシャルサーチ
        for (int idx = 0; idx < table.length; idx++) {
            if (table[idx] == input) {
                System.out.println("出席番号 " + input + " の名前は " + array[idx] + " です。");
            }
        }
        
    }
}