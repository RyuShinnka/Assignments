
public class List06_03 {
	public static void main(String[] args) {
//		mainメソッドの中でPersonクラスの宣言をしています
		class Person1 implements SayHello{
			public void hello() {
				System.out.println("こんにちは");
			}
		}
		Person1 p = new Person1();
		Greeting.greet(p);
	}
}
