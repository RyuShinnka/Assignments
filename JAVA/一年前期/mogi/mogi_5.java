public class mogi_5 {
    public static void main(String[] args) {
        // 2次元配列の初期化
        int[][] TBL2 = {
            {5, 3, 2, 1, 4, 0, 0},
            {4, 5, 4, 5, 5, 0, 0},
            {3, 2, 5, 4, 3, 0, 0},
            {2, 3, 3, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0}
        };
        
        //列の合計
        for(int i=0; i < 4;i++) {
        	for(int j= 0;j<5;j++) {
        		TBL2[i][5] += TBL2[i][j];
        	}
        }
        //列の平均
        for(int i=0; i < 4;i++) {
        	TBL2[i][6] = (int)Math.round((double)TBL2[i][5] /5);
        }
        //行の合計
        for(int i=0; i < 4;i++) {
        	for(int j= 0;j<7;j++) {
        		TBL2[4][j] += TBL2[i][j];
        	}
        }
        //結果を表示
        System.out.println("問1\t問2\t問3\t問4\t問5\t合計\t平均");
        for (int i = 0; i < TBL2.length; i++) {
            for (int j = 0; j < TBL2[i].length; j++) {
                System.out.print(TBL2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
