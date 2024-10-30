import java.util.Scanner;
public class ensyu06_02 {
	public static void main(String args[]) {
		int [][] seiseki= new int[6][2];
		String[] kanji= {"国語","数学"};
		Scanner s = new Scanner(System.in);
		int []gamokuAvg=new int[2];
		int []gakuseiAvg = new int[6];
		int count=0;
		int result=0;
		//6行2列の成績の値をキーボードから入力の繰り返し
		for(int i = 0; i<seiseki.length;i++) {
			for(int j = 0;j< seiseki[i].length;j++) {
				System.out.print((i+1)+"人目の"+kanji[j]+"の成績を入力＝＞");
				seiseki[i][j] = s.nextInt();
			}
		}
		//科目ごとの平均点を求め表示する
		for(int i = 0; i < gamokuAvg.length;i++) {
			for(int j = 0; j<seiseki[i].length;j++) {
				result += seiseki[j][i];
				count++;
			}
			gamokuAvg[i] = result/count;
			System.out.println(kanji[i]+"の平均点は："+gamokuAvg[i]);
		}
		//学生ごとの平均点を求め表示する
		result=0;
		count=0;
		for(int i = 0; i < gakuseiAvg.length;i++) {
			for(int j = 0; j<seiseki[i].length;j++) {
				result += seiseki[i][j];
				count++;
			}
			gakuseiAvg[i] = result/count;
			System.out.println((i+1)+"人目の成績の平均点は："+gakuseiAvg[i]);
		}
		
		s.close();
	}
}
