//配列の全要素の和を求めて表示（拡張for文）		
//配列名：Ａｒｒａｙ２[5]		
//	配列の初期化の記述	
//	double[]  Ａｒｒａｙ２= { 1.2,1.8,3.5,4.2,8.0 };	
//		
//配列Ａｒｒａｙの全要素を表示した後に合計を表示する

public class Array01_2 {
	public static void main(String[] args) {
		double sum =0.0;
		// double型の配列を初期化
        double [] Array2 = {
        		1.2,1.8,3.5,4.2,8.0
        };
        for(int i =0 ; i< Array2.length;i++) {
        	// 各要素の値をsumに加算
        	sum+=Array2[i];
        	// 現在の要素の値を表示
        	System.out.print(Array2[i]+" ");
        }
        // 合計を表示
        System.out.println("\nArray2配列の合計は："+sum);
    }
}
