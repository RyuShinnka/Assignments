//p106 重複がないセットコレクション
import java.util.HashSet;
public class List05_05 {
	public static void main(String[] args) {
//		文字列を格納するHashSetオブジェクトを生成します
		HashSet<String> set = new HashSet<String>();
		
//		setに要素を追加します
		System.out.println(set.add("Jan"));
		System.out.println(set.add("Feb"));
		System.out.println(set.add("Feb"));// false-2回目のFebは追加されません
		System.out.println(set.add("Mar"));
		System.out.println(set.add("Apr"));
		
//		setに格納されている要素を出力します
		System.out.println(set);
//		Janという文字列がsetに含まれているかを調べます
		System.out.println(set.contains("Jan")); //true
//		Junという文字列がsetに含まれているかを調べます
		System.out.println(set.contains("Jun")); // false
	}
}
