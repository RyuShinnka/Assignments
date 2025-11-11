class Outer{
	private String message = "Outerクラスのprivate名インスタンス変数です";
	
	void doSomething() {
		class Inner{
//			内部クラスの宣言です
			void print() {
				System.out.println("Innerクラスのprintメソッドが呼ばれました");
				// 外部クラスのprivateなインスタンス変数を参照しています
				System.out.println(message);
			}
		}
//		内部クラスのインスタンスを生成しています
		Inner inner = new Inner();
		inner.print();
	}
}
public class List06_01 {
	public static void main(String[] args) {
//		外部クラスのインスタンスを生成しています
		Outer outer = new Outer();
		outer.doSomething();
	}
}
