public class mon_08 {
	public static void main(String[] args) {
		int [][] TBL2 = {
				{20,30,50},
				{12,45,32},
				{80,75,35},
				{23,65,78}
		};
		for(int i =0;i<TBL2.length;i++) {
			for(int j=0; j<TBL2[i].length;j++) {
				System.out.print(TBL2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
