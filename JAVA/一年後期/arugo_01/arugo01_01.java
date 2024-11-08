//配列問題１
//配列型　TBL［10］に整数値が入っています。
//この整数値が７の倍数の時は、TBL［添え字］を表示します。
//7の倍数が何個あったか、数を求め表示します。
//配列の値全てチェックしていきます。
public class arugo01_01 {
	public static void main(String args[]) {
		int[] TBL = {1,2,3,4,5,6,7,8,9,70};
		int count =0;
		System.out.print("TBL = [");
		for(int i = 0; i< TBL.length;i++) {
			
			if(TBL[i] % 7 ==0) {
				count++;
				System.out.print("添え字");
			}else {
				System.out.print(TBL[i]);
			}
			if(TBL[i] == 70) {
				System.out.print("]");
			}else {
				System.out.print(",");
			}
		}
		System.out.println( );
		System.out.println("7の倍数は"+count+"個ありますよ");
		
	}
}
