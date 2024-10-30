
public class list3_17 {
	public static void main(String[] args) {
		int [] counts = {1,3,5,6,5,2};
		for(int i = 0; i < counts.length ; i++) {
			// ○○.length　配列に含まれる要素の数
			System.out.print(i + ":");
			for(int j = 0; j < counts[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
