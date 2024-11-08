public class List4_M01 {
	public static void printHello(int count) {
		String print ="";
		// "Hello" を指定回数だけ連結
        for (int i = 0; i < count; i++) {
            print += "Hello ";
        }
        System.out.println(print);
	}
	public static void main(String[] args) {
		printHello(3);
	}
}
