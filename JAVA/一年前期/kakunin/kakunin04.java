
public class kakunin04 {
	public static void main(String[] args) {
		//配列を初期化
		int [] TBL = {
				100,95,23,45,87,63,10,40,60,85	
		} ;
		int sum=0;
		double avg=0;
		int cnt=0;
		int max= TBL[0];
		int min= TBL[0];
		
		// 合計値を求める
		for(int i=0;i<TBL.length;i++) {
			sum+=TBL[i];
			cnt++;
		}
		// 平均値を求める
		avg=sum/cnt;
		
		// 最大値と最小値を求める
		
		for (int i = 0; i < TBL.length; i++) {
            if (TBL[i] > max) {
                max = TBL[i];
            }
            if (TBL[i] < min) {
                min = TBL[i];
            }
        }
		// 結果を表示
        System.out.println("配列 TBL の値: ");
        for (int i = 0; i < TBL.length; i++) {
            System.out.print(TBL[i] + " ");
        }
        System.out.println("合計値: " + sum);
        System.out.println("平均値: " + avg);
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
	}
}
