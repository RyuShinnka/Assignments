//抽象メソッドが1つだけなので、関数型インタフェースです
interface SimpleInterface{
	public int doSomething(int n);
}

public class List06_05 {
//	引数の型が関数型インタフェースなのでラムダ式を受け取れます
	static void printout(SimpleInterface i) {
		System.out.println(i.doSomething(2));
	}
	public static void main(String[] args) {
//		ラムダ式を引数に渡しています。処理の内容は「引数の値を１増やしたものを戻り値とする」というものです
		printout(n -> n +1);
	}
}
