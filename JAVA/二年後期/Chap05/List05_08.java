import java.util.LinkedList;
import java.util.Queue;

public class List05_08 {
	public static void main(String args[]) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("(1)"); //末尾に追加
		System.out.println("キューの状態："+ queue);
		queue.offer("(2)");
		System.out.println("キューの状態："+ queue);
		queue.offer("(3)");
		System.out.println("キューの状態："+ queue);
		queue.offer("(4)");
		System.out.println("キューの状態："+ queue);
		
		while(!queue.isEmpty()){
//			pollメソッドで要素を1つ取り出し（先頭から）
			System.out.println("要素の取り出し："+ queue.poll());
//			キューが空の時にはnullが戻り値になります
			System.out.println("キューの状態："+ queue);
		}
	}
}
