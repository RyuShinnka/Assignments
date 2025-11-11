//greetメソッドの引数を指定する場所でクラスの宣言をしてしまっています
public class List06_04 {
	public static void main(String[] args) {
		Greeting.greet(new SayHello() {
			public void hello() {//helloメソッドの宣言です
				System.out.println("こんにちは");
			}
		});
//		ラムダ式を使うと次の1行を記述するだけで済みます。
//		Greeting.greet( () -> {System.out.println("こんにちは");});
	}
}
