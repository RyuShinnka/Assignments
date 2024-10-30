//10から60までの奇数の合計を求めるフローチャートを書きなさい。
//2で割った時に余りが1の整数が奇数
public class arugo_05_2 {
	public static void main(String[] args) {
		int sum=0;
		int count=10;
		for(int i = count;i<=60;i++) {
			if(i % 2 == 1) {
			sum+=i;
			}
		}
		System.out.println(sum);
	}
}
