public class List4_M03 {
    public static String getMessage(String name) {
    	return "こんにちは"+name+"さん"; //引数で渡されたnameの値を入れって戻す
    }

    public static void main(String[] args) {
    	String name = "JAVA太郎";
        System.out.println(getMessage(name));
    }
}
