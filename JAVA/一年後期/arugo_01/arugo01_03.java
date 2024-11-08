//配列問題３
//2次元配列型　TBL2［4][3］に整数型の値が入っています。
//1行ごとの合計を求め表示する
//配列全ての値の合計を求め表示する
//表示は複数回表示にならないように、最後に表示されるようにする。
public class arugo01_03 {
	public static void main(String args[]) {
		int [][] TBL2= {
				{1,1,1},
				{2,2,2},
				{3,3,3},
				{0,0,0}
		};
		int sum = 0;
		for(int i= 0;i< TBL2.length;i++) {
			for(int j=0;j<TBL2[i].length;j++) {
				sum += TBL2[i][j];
			}
		}
		System.out.println("配列全ての値の合計は："+sum);
	}
}
