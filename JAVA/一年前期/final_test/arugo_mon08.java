import java.util.Scanner;

public class arugo_mon08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[][] data = new int[5][3];
        int[] TBL = new int[5];
        
        // データの入力
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("data[" + i + "][" + j + "]の値を入力してください＝＞");
                data[i][j] = s.nextInt();
                TBL[i] += data[i][j]; // 行ごとの合計を計算
            }
        }
        System.out.println("---------TBL[5]を表示する----------");
        // 合計の表示
        for (int i = 0; i < TBL.length; i++) {
            System.out.println("TBL[" + i + "]の値は：" + TBL[i]);
        }
        
        s.close();
    }
}
