//①	クラス名　Section ３_１					
//	単価・数量をキーボードから入力し、金額を計算しなさい。（単価×数量＝金額）					
//	1万円未満の場合は、割引無しの金額を表示しなさい。					
//	金額が１万円以上2万円未満の場合は、５％ＯＦＦの金額を表示し、					
//	2万円以上３万円未満の場合は、			１０％ＯＦＦの金額を表示しなさい。		
//	3万円以上の場合は、２０％ＯＦＦの金額を表示しなさい。	

import java.util.Scanner;//Scannerをimportする
public class Section3_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Scannerをsを名する
		double result;//小数型　の変数resultを用意する
		System.out.println("単価を入力ください。");
		double dj = s.nextDouble();
		System.out.println("数量を入力ください。");
		double sl = s.nextDouble();
		double sum = dj * sl;//金額を計算
		if ( sum < 10000 ) {//判断する
			//trueの場合はここのコードを実行する
			System.out.println("割引無しの金額:"
				+ sum + "円です。");
		}else if( sum < 20000 ){//以上falseの場合、もう一回判断する
			//trueの場合はここのコードを実行する
			result = sum * 0.95;
			System.out.println("５％ＯＦＦの金額:"
					+ result + "円です。");
		}else if (sum < 30000) {//以上falseの場合、もう一回判断する
			//trueの場合はここのコードを実行する
			result = sum * 0.9;
			System.out.println("10％ＯＦＦの金額:"
					+ result + "円です。");
		}else {//以上falseの場合ここのコードを実行する
			result = sum * 0.8;
			System.out.println("20％ＯＦＦの金額:"
					+ (int)result + "円です。");
		}
		s.close();//Scannerを停止する
	}
	
}
