
public class list3_17 {
	public static void main(String[] args) {
		int [][] scores = {
				{1,2,3},
				{3,6,9},
				{3,3,9}
		};
		for(int i=0; i< scores.length;i++) {
			for(int j =0; j < scores[i].length;j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
