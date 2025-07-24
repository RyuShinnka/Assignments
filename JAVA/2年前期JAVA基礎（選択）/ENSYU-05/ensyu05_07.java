
public class ensyu05_07 {
	public static void main(String[] args) {
		int[] lst = new int[5];
		
		for(int i = 5; i> 0; i--) {
			lst[5 - i] = i;
		}
		
//		表示
		for(int k = 0; k< lst.length; k++) {
			System.out.println("lst["+ k + "]" + "は"+ lst[k] + "です。");
		}
    }
}
