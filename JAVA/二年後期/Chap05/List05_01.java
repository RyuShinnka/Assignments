import java.util.ArrayList;

public class List05_01 {
	public static void main(String[] args) {
//	文字列を格納するためのArrayListオブジェクトを生成します
		ArrayList<String> months = new ArrayList<String>();
		
		months.add("January"); //０番目
		months.add("February"); // 1番目
		months.add("March");// ２番目
		
		System.out.println("要素数　"+ months.size());
		for(int i= 0; i< months.size(); i++) {
			System.out.println(months.get(i));
		}
		
		months.remove(1); // 1番目の要素を取り除きます
		System.out.println("要素数　"+ months.size());
		for(int i= 0; i< months.size(); i++) {
			System.out.println(months.get(i));
		}
	}
}
