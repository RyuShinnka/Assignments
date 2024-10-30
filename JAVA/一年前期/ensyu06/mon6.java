import java.util.Scanner;
public class mon6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,w;
		System.out.println("＊の個数を入力してください");
		n = s.nextInt();
		System.out.println("何個目改行したいですか");
		w = s.nextInt();
		for(int i = 0 ; i< n; i++) {
			if(i==w) {
				System.out.println("");
			}
			System.out.print("*");
		}
		s.close();
	}
}
