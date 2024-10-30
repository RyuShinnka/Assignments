import java.util.Scanner;

public class Section8Array_3 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		//配列を初期化する
		int[] atb1 = new int[5];
		
		// キーボードから値を代入
		for(int i= 0; i< atb1.length; i++) {
			System.out.print(i+1+"つ目の整数を入力してください：");
			atb1[i] = s.nextInt();
			System.out.println("");
		}
		// 値を昇順に並べ替える
		for(int i = 0; i< atb1.length -1; i++) {
			for(int j = 0; j< atb1.length - 1 - i; j++) {
				if (atb1[j] > atb1[j + 1]) {
                    // 値を交換する
                    int temp = atb1[j];
                    atb1[j] = atb1[j + 1];
                    atb1[j + 1] = temp;
				}
		// 結果を表示
		
			}
		}
		System.out.println("昇順に並べ替えたAtbl:");
		for(int i = 0;i < atb1.length; i++) {
			System.out.print(atb1[i]+" ");
		}
		s.close();
	}
	
}
