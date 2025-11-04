import java.util.ArrayList;
public class List05_03 {
	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		
//		引数で渡した整数が自動的にIntegerオブジェクトに変換されます
		integerList.add(50); //　０番目
		integerList.add(100);//　1番目
		
//		戻り値のIntegerオブジェクトが自動的にint型に変換されます
		int i0 = integerList.get(0);
		int i1 = integerList.get(1);
		
		System.out.println(i0);
		System.out.println(i1);
	}
}
