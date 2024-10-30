import java.util.Scanner;
public class array02_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("行数を入力してください");
		int h = s.nextInt();
		System.out.println("列数を入力してください");
		int l = s.nextInt();
		int[][] Atbl = new int [h][l];
		
		for(int i =0;i<Atbl.length;i++) {
					//行の場所 
			int var =1;
			for(int j =0;j<Atbl[i].length;j++) {
//								何の行の列の場所
				Atbl[i][j]=(int)Math.pow(var, i+1);
				var++;
			}
			
		}//表示
        for(int i=0;i<Atbl.length;i++) {//行
            for(int j=0;j<Atbl[i].length;j++) {
                System.out.print(Atbl[i][j]+"   ");
            }
            System.out.println();
        }
        
        
        s.close();
	}
}
