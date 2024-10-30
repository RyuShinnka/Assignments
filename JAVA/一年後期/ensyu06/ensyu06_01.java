import java.util.Scanner;
public class ensyu06_01 {
	public static void main(String args[]) {
		int [][] TBLA= new int[4][3];
		int [][]TBLB= new int[3][4];
		int [][]TBLC= new int[4][4];
		Scanner s = new Scanner(System.in);
		//4行3列のTBLAの値をキーボードから入力の繰り返し
		for(int i = 0; i<TBLA.length;i++) {
			for(int j = 0;j< TBLA[i].length;j++) {
				System.out.print("TBLAの"+(i+1)+"行の"+(j+1)+"列の値を入力＝＞");
				TBLA[i][j] = s.nextInt();
			}
		}
		//3行4列のTBLBの値をキーボードから入力の繰り返し
		for(int i = 0; i<TBLB.length;i++) {
			for(int j = 0;j< TBLB[i].length;j++) {
				System.out.print("TBLBの"+(i+1)+"行の"+(j+1)+"列の値を入力＝＞");
				TBLB[i][j] = s.nextInt();
			}
		}
		//TBLCの配列はTBLAとTBLBの行列の積
		for(int i = 0; i < TBLC.length; i++) {
            for(int j = 0; j < TBLC[i].length; j++) {
                // TBLC[i][j]の計算: TBLAの第i行とTBLBの第j列の積
                for (int k = 0; k < 3; k++) { // TBLAの列数またはTBLBの行数
                    TBLC[i][j] += TBLA[i][k] * TBLB[k][j];
                }
            }
        }
		// 結果を表示
        System.out.println("TBLC：");
        for (int i = 0; i < TBLC.length; i++) {
            for (int j = 0; j < TBLC[i].length; j++) {
                System.out.print(TBLC[i][j] + "\t");
            }
            System.out.println();
        }
		
		
		s.close();
	}
}
