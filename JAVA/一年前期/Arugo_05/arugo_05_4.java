//1日10円貯金をします。
//2日目は5円加えた15円を貯金します。
//3日目は5円増やして20円を貯金します。
//このまま5円増やして貯金していくと5万円超える日は何日でしょうか
//何日で5万円を超えるか日数を表示しましょう。
public class arugo_05_4 {
	public static void main(String[] args) {
		int cnt=0;
		int sum=10;//1日目の貯金
		int days=1;//日
		while(cnt<50000) {
			sum+=5;//毎日の貯金は5円増やす
			cnt+=sum;	//貯金の総額
			days++;
		}
		System.out.print(days);
	}
}
