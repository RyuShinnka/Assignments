//メソッドの定義：メソッド名は任意とする。											
//	引数有り・戻り値有り										
//											
//メソッドの処理内容											
//	引数で渡された値の乗算した値を配列に代入し、その配列を返す										
//	配列は10要素とする。										
//	例）TBL[10]		引数の値が２の時								
//		0	2	4	8	16	32	64	128	256	512
//	例）TBL[10]		引数の値が8の時								
//		0	8	16	32	64	128	256	512	1024	2048
//											
//メイン処理											
//	メソッドに引渡す値をキーボードから入力										
//	メソッドの戻り値の配列を見やすいように表示する。										
//											
import java.util.Scanner;
public class Section8_02 {
	// 配列に2の累乗を格納するメソッド
	public static int[] generateArray(int n) {
        int[] tbl = new int[10];
        
        // 各要素にインデックス * nの結果を代入
        for (int i = 0; i < tbl.length; i++) {
            tbl[i] = i * n;
        }
        
        return tbl;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("配列に使用する値を入力してください: ");
        int n = scanner.nextInt();
        
        int[] tbl = generateArray(n);
        
        System.out.println("結果の配列:");
        for (int value : tbl) {
            System.out.print(value + " ");
        }
        
        scanner.close();
    }
}
