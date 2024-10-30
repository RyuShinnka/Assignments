
public class list03_03 {
	public static void main(String[] args) {
		int age = 10;
		if(age < 4 ) {
			System.out.println("入場料は無料です。");
		}else if( age < 13 ){
			System.out.println("子供料金で入場できます。");
		}else {
			System.out.println("大人料金が必要です。");
		}
	}
}
