import java.util.Scanner;

public class Section8Array_4 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
//		キーボードから行数と列数を入力します。
		System.out.println("行数を入力してください：");
		int gyou = s.nextInt();
		System.out.println("列数を入力してください：");
		int retsu = s.nextInt();
		
//		入力された行数と列数の２次元配列を定義します。
		int[][] data = new int[gyou] [retsu];
//		1行目、１から1増える値を代入
		for(int i= 0;i< data[0].length; i++) {
			data[0][i] +=i+1;
		}
//		2行目、1行目の値を2乗した値を代入
		for(int i=0;i< data[0].length;i++) {
			data[1][i]=(int)(Math.pow(data[0][i],2));
		}
//		3行目、1行目の値を3乗した値を代入
		for(int i=0;i< data[0].length;i++) {
			data[2][i]=(int)(Math.pow(data[0][i],3));
		}
		
		//結果を表示
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        
	}
		s.close();
	}
	
}
