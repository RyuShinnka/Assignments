
public class array02_01 {
	public static void main(String[] args) {
		//2次元配列の初期化
		int[][] Atb1 = {
				{3,6,9,11},
				{13,19,23,29},
				{33,39,99,130}
		};
//		1次元配列の定義
		int [] Ctb1=new int[20];
//		配列の値を代入
		int x = 0;
		for(int i = 0; i <Atb1.length; i++) {
			for(int j=0;j<Atb1[i].length;j++) {
				Ctb1[x]=Atb1[i][j];
				x++;
			}
		}
//		Ctb1を表示
		for(int i=0;i<12;i++) {
			System.out.print(Ctb1[i]+" ");
		}
	}
}
