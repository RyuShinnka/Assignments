import java.util.LinkedList;

public class List05_09 {
	public static void main(String args[]) {
		LinkedList<String> stack = new LinkedList<String>();
		
		stack.push("(1)");//先頭に要素を追加
		System.out.println("スタックの状態："+ stack);
		stack.push("(2)");//先頭に要素を追加
		System.out.println("スタックの状態："+ stack);
		stack.push("(3)");//先頭に要素を追加
		System.out.println("スタックの状態："+ stack);
		stack.push("(4)");//先頭に要素を追加
		System.out.println("スタックの状態："+ stack);
		
		while(!stack.isEmpty()){
//			popメソッドで要素を1つ取り出し（先頭から）
			System.out.println("要素の取り出し："+ stack.pop());
//			スタックが空の時にはnullが戻り値になります
			System.out.println("スタックの状態："+ stack);
		}
	}
}
