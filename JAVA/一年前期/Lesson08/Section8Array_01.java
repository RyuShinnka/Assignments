
public class Section8Array_01 {
	public static void main(String[] args) {
		//配列に値を初期化する
		int[] atb1 = {1,3,5,7,9};
		int[] btb1 = {2,4,6,8,0};
		int[] ctb1 = new int [10];
		
		//ctblにatblとbtblの値を交互に代入する
		// 値を交互に代入する
        for (int i = 0; i < 5; i++) {
        	ctb1[2 * i] = atb1[i];
        	ctb1[2 * i + 1] = btb1[i];
        }

        // 結果の表示
        System.out.println("Ctbl:");
        for (int i = 0; i < ctb1.length; i++) {
            System.out.print(ctb1[i] + " ");
            }
	}
	
}
