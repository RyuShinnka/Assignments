//3から4の倍数だけを合計して、合計した値が100以上になるまで繰り返す
//合計した値を表示しなしなさい。
public class arugo_05_3 {
	public static void main(String[] args) {
		int sum=0;
		int count=3;
		for(int i=count; sum <=100;i++) {
			if(i % 4 ==0 ) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
