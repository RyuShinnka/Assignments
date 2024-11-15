//アルゴリズム-プログラム応用問題3
//〇	プログラム応用問題３	
//〇	文字列：	TBL1[10]　,　ban
//〇	整数値：TBL2[10] , Y	
//●	入力(ban)	
//●	Y ←　0	
//■	Y ＜　10	
//	▲TBL1[Y] = ban	
//		●	出力(TBL2[Y])
//		●	Y = 10
//	▼	
//	● Y ←　Y　+　1	
//■		
import java.util.Scanner;
public class arugo02_03 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int[] TBL1 = {1, 3, 4, 5, 9, 6, 2, 4, 11, 15};
		int[] TBL2 = {2500,3000,1500,200,650,1400,863,945,780,600};
		int ban;
		int kin,Y;
		boolean check;
		System.out.print("商品番号を入力＝＞");
		ban = s.nextInt();
		kin = 0;
		Y = 0;
		check = true;
		while(check) {
			if(TBL1[Y] == ban) {
				kin = TBL2[Y];
				check = false;
			};
			Y++;
			
		}
		System.out.println("入力した商品番号"+ban+"の単価は："+kin);
		s.close();
	}
}
