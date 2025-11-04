
public class rensyu2_3 {
	public static void main(String[] args) {
		try {
//			例外処理Aの場合
			int[] scores = new int[3];
			for(int i=0;i<5;i++) {
				scores[i] = i;
			}
			
//例外処理Bの場合
//			int num = 3 / 0;
			System.out.println("処理が正常に行われました");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("例外処理A");
		}catch(Exception e){
			System.out.println("例外処理B");
		}
		System.out.println("プログラムを終了します");
	}
}
