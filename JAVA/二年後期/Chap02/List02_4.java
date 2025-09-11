public class List02_4 {
	public static void main(String args[]) {
		int a = 4;
		int b = 0;
		
		try {
			int c = a / b;
			System.out.println("cの値は"+ c);
		}
		catch (ArithmeticException e){//ゼロで除算をした場合に投げられる例外をキャッチします。
			System.out.println("例外をキャッチしました");
			System.out.println(e);
			return;
		}
		finally {//メソッドを終了する前に必ず実行されます
			System.out.println("finallyブロックの処理です");
		}
		System.out.println("プログラムを終了します");
	}
}
