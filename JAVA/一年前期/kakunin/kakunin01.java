import java.util.Scanner;

public class kakunin01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 1.準備 学生の情報の配列を宣言
		int[] student_no = new int[3];//学生ナンバー
		int[] java_s = new int[3];//Javaの点数
		int[] python_s = new int [3];//pythonの点数
		double[] avg = new double[3];//平均値
		char[] hyoka = new char [3];//評価
        int max_avg = 0;//最高値
        int min_avg = 0;//最低値
		
		
		//　2.  各学生の情報を入力
		for(int i = 0; i<3 ; i++) {
			System.out.print("学籍番号を入力してください (100-300): ");
			student_no[i] = s.nextInt();
			System.out.print("Javaの点数を入力してください (0-100): ");
			java_s[i] = s.nextInt();
			System.out.print("Pythonの点数を入力してください (0-100): ");
			python_s[i] = s.nextInt();
			
			//平均
			avg[i] = (java_s[i] + python_s[i]) / 2.0;
			
			//			平均を基づいて評価
			if(avg[i]>=81) {
				hyoka[i]='A';
			}else if(avg[i]>=61) {
				hyoka[i]='B';
			}else if(avg[i]>=41) {
				hyoka[i]='C';
			}else{
				hyoka[i]='D';
			}
		};
		// 最高平均点と最低平均点
        for (int i = 1; i < 3; i++) {
            if (avg[i] > avg[max_avg]) {
                max_avg = i;
            }
            if (avg[i] < avg[min_avg]) {
                min_avg = i;
            }
        }
     // 最高平均点と最低平均点（配列を使わない）
        /*　int max = -1;
         * 	int min = 101;
         * 	if(max<avg){
         * 		max=avg;
         * }
         * if(min>avg){
         * 		min=avg;		
         * }
         * 
         * */
        // 結果を表示
        System.out.println("\n結果:");
        for (int i = 0; i < 3; i++) {
            System.out.println("学籍番号:"+student_no[i]+", Java点:"+java_s[i]+", Python点: "+python_s[i]+", 平均点:" + avg[i] + ", 評価: "+ hyoka[i]);
        }

        // 最高平均点と最低平均点を表示
        System.out.println("最高平均点: 学籍番号"+student_no[max_avg]+"  の "+avg[max_avg]);
        System.out.println("最低平均点: 学籍番号"+student_no[min_avg]+"  の "+avg[min_avg]);
        s.close();
		
	}
}
