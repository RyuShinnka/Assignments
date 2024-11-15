//〇	プログラム応用問題4				
//〇	文字列：	TBL1[10]　,　ban			
//〇	整数値：ZAIKO[10] , Y				
//〇	boolean値：　X				
//●	入力(ban)　,　入力(Z)				
//●	Y ←　0　,　X　＝　True				
//■	X　＝　True				
//	▲TBL1[Y] = ban				
//		▲	ZAIKO[Y] － Z ＞＝0			
//			ZAIKO[Y] = ZAIKO[Y] － Z			
//			出力("足りない数"+Z－ZAIKO[Y] )			
//		▼				
//	　　●X ＝False				
//	▼				
//	● Y ←　Y　+　1				
//■					
import java.util.Scanner;
public class arugo02_04 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int[] TBL1 = {1, 3, 4, 5, 9, 6, 2, 4, 11, 15};
		int[] ZAIKO = {2500,3000,1500,200,650,1400,863,945,780,600};
		int ban,y,z;
		boolean check = true;
		y = 0;
		System.out.print("商品番号を入力＝＞");
		ban = s.nextInt();
		System.out.print("出庫数を入力＝＞");
		z = s.nextInt();
		while(check) {
			if(TBL1[y] == ban) {
				if((ZAIKO[y] - z) >= 0){
					ZAIKO[y] = ZAIKO[y] - z;
					System.out.println(z+"個出庫しました！ 残り："+ZAIKO[y]+"個です。");
					System.out.println("---在庫一覧---");
					System.out.print("ZAIKO[ ] = ");
					for(int i = 0;i<ZAIKO.length;i++) {
						System.out.print(ZAIKO[i]+" ");
					}
				}else {
					System.out.println("出庫出来ません、在庫数は："+ZAIKO[y]+"個ので、足りない数は："+(z - ZAIKO[y])+"個です。");
					System.out.println("---在庫一覧---");
					System.out.print("ZAIKO[ ] = ");
					for(int j = 0;j<ZAIKO.length;j++) {
						System.out.print(ZAIKO[j]+" ");
					}
				}
				check = false;
			}
			y++;
		}
		s.close();
		
	}
}
