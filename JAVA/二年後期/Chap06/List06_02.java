//抽象メソッドの宣言
interface SayHello{
	public void hello();
}
class Greeting{
//SayHelloインタフェースを実装するオブジェクトを引数で受け取ります
	static void greet(SayHello s) {
		s.hello();
	}
}
//SayHelloインタフェースを実装しています
class Person implements SayHello{
	public void hello() {//helloメソッドをオーバーライドします
		System.out.println("	こんにちは");
	}
}
public class List06_02 {
	public static void main(String[] args) {
		Person p = new Person();
//		PersonオブジェクトはSayHelloインタフェースを実装しているので、greetメソッドに渡すことができます
		Greeting.greet(p);
	}
}
