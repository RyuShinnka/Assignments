// P-97　２次元配列の例題
public class list3_16 {
	public static void main(String[] args) {
		int [][] scores1 = new int [3][3];
		//1行目の代入
		scores1[0][0]=9;
		scores1[0][1]=13;
		scores1[0][2]=39;
		//2行目の代入
		scores1[1][0]=1;
		scores1[1][1]=2;
		scores1[1][2]=3;
		//3行目の代入
		scores1[2][0]=4;
		scores1[2][1]=5;
		scores1[2][2]=6;
		
		for(int i=0; i< scores1.length;i++) {
			for(int j =0; j<scores1[i].length;j++) {
				System.out.print(""+scores1[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
