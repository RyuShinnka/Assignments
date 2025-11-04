import java.util.HashSet;
import java.util.Iterator;

public class List05_06 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
//		iteratorメソッドでイテレータを取得します
		Iterator<String> it = set.iterator();
//		hasNextメソッドで要素が残っているかを調べ、残っているなら処理を続けます
		while(it.hasNext()) {
			String str = it.next();// nextメソッドで要素を取得します、イテレータは次の要素に移動します
			System.out.println(str);
		}
	}	
}
