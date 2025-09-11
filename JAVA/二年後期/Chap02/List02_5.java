class SimpleClass{
	void doSomething() {
		int array[] = new int [3];
		array[10] = 99; //例外！
		System.out.println("doSomethingメソッドを終了します");
	}
}
public class List02_5 {
	public static void main(String args[]) {
		SimpleClass obj = new SimpleClass();
		try {
			obj.doSomething();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外をキャッチしました");
			e.printStackTrace(); //メソッドの呼び出し履歴を出力します
		}
	}
}
