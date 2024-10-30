
public class Section8Array_02 {
	public static void main(String[] args) {
		//配列に値を初期化する
		int[][] atb1= {
			{1,2,3,4},
			{2,4,6,8},
			{3,6,9,10}
		};
		int[] ctb1 = new int[15];
		int index =0;//インデックス
		
//		Aｔｂｌの値を順にCtblに代入します。
		for(int i= 0; i< atb1.length;i++) {
			for(int j= 0; j< atb1[i].length; j++) {
				if(index < ctb1.length) {
					ctb1[index++]= atb1[i][j];
				}
			}
			
		}
		
//		Ctblを表示しましょう。
		System.out.println("ctb1:");
        for (int i = 0; i < ctb1.length; i++) {
            System.out.print(ctb1[i] + " ");
        }
	}
	
}
