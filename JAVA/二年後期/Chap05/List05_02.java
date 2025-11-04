import java.util.ArrayList;
public class List05_02 {
	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		
//		Integerオブジェクトを生成して格納する
		integerList.add(Integer.valueOf(50)); //　０番目
		integerList.add(Integer.valueOf(100));//　1番目
		
//		Integerオブジェクトを取り出します
		Integer integer0 = integerList.get(0);
		Integer integer1 = integerList.get(1);
		
//		Integerオブジェクトから整数値を取り出します
		int i0 = integer0.intValue();
		int i1 = integer1.intValue();
		
		System.out.println(i0);
		System.out.println(i1);
	}
}
