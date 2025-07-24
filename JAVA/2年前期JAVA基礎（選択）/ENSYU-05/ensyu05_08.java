
public class ensyu05_08 {
	public static void main(String[] args) {
		double[] lst = new double[5];
		
		for(int i = 0; i< lst.length; i++) {
			lst[i] = (i+1) + ((i+1) * 0.1);
		}
		
//		表示
		for(int k = 0; k< lst.length; k++) {
			System.out.println("lst["+ k + "]" + "は"+ lst[k] + "です。");
		}
    }
}
