import java.util.Scanner;
public class ensyu06_03 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// 行数を入力
        System.out.print("行数を入力してください=> ");
        int rows = s.nextInt();
        
        // 行によって列数が異なる2次元配列の宣言
        int[][] array = new int[rows][];
        
        // 各行の列数と要素の値を入力
        for (int i = 0; i < rows; i++) {
        	System.out.println();
            System.out.print("行 " + (i+1) + " の列数を入力してください=> ");
            int cols = s.nextInt();
            
            // 列数が決定された行に新しい配列を割り当て
            array[i] = new int[cols];
            
            // 各要素の値を入力
            for (int j = 0; j < cols; j++) {
                System.out.print("array["+i+"]["+j+"] の値を入力してください=> ");
                array[i][j] = s.nextInt();
            }
        }
        
        // 配列の表示
        System.out.println("\n入力された2次元配列:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // 改行
        }
		s.close();
	}
}