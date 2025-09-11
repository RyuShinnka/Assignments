public class List02_3 {
	public static void main(String args[]) {
		int a = 4;
		int b = 0;
		
		try {//例外が投げられる可能性があるので、tryブロックで囲んでいます。
			int c = a / b; //例外！！！！
			System.out.println("cの値は"+ c);
		}
		catch (ArithmeticException e){//ゼロで除算をした場合に投げられる例外をキャッチします。
			System.out.println("例外をキャッチしました");
			System.out.println(e);
		}
		System.out.println("処理を正常に終了します");
	}
}
