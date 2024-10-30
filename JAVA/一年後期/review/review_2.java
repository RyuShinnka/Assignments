import java.util.Scanner;

public class review_2 {
    
    // 2次元配列を作成するメソッド
    public static int[][] Array2(int rows, int cols, int start, int puls) {
        int[][] array = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = start + (i * cols + j) * puls;
            }
        }
        
        return array;
    }
    
    // 2次元配列を表示するメソッド
    public static void displayArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " "); // 直接出力
            }
            System.out.println(); // 行の終わりで改行
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // 入力
        System.out.print("行数を入力=> ");
        int rows = s.nextInt();
        
        System.out.print("列数を入力=> ");
        int cols = s.nextInt();
        
        System.out.print("始まりの値を入力=>");
        int start = s.nextInt();
        
        System.out.print("次の値に加える数を入力=>");
        int puls = s.nextInt();
        
        // 2次元配列を作成
        int[][] array = Array2(rows, cols, start, puls);
        
        // 2次元配列を表示
        displayArray(array);
        
        s.close();
    }
}