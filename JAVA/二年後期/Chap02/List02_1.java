
public class List02_1 {
	public static void main(String args[]) {
		int a = 4;
		int b = 0;
		int c = a / b; //例外！
		
//		例外が投げられて以降の処理は実行されません
		System.out.println("cの値は"+ c);
		System.out.println("処理を正常に終了します");
	}
}
