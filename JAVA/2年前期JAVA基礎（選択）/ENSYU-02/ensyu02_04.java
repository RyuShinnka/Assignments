
public class ensyu02_04 {
	public static void main(String[] args) {
		String text1 = "あいうえお";
		String text2 = "かきくけこ";
		System.out.println("text1の文字列は："+ text1);
		System.out.println("text2の文字列は："+ text2);
		System.out.println("ここで入り替えます。");
		String temp = text1;
		text1 = text2;
		text2 = temp;
		System.out.println("text1の文字列は："+ text1);
		System.out.println("text2の文字列は："+ text2);
	}
}
