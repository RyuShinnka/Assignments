public class kakunin05 {
	public static void main(String[] args) {
		int[][] data = new int [3][3];
		data[0][0] =10;
		data[1][0] =20;
		data[2][0] =30;
		int totalSum = 0;//総合計値
		int gyouSum = 0; // 行の合計値
		
		// 2列目と3列目の計算
        for (int i = 0; i < data.length; i++) {
            data[i][1] = data[i][0] + 10; // 2列目の値（値 + 10）
            data[i][2] = data[i][0] + 20; // 3列目の値（値 + 20）
        }

        // テーブルの表示と各行の合計計算
        
        System.out.println("値\t\t値+10\t値+20\t合計");
        for (int i = 0; i < data.length; i++) {
            gyouSum = data[i][0] + data[i][1] + data[i][2];
            totalSum += gyouSum;
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t\t" + gyouSum);
        }

        // 総合計の表示
        System.out.println("総合計: " + totalSum);
    

	}
}
