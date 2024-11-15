class studentCard{
	int id;
	String name;
}
public class List05_01 {
	public static void main(String[] args) {
		studentCard a = new studentCard();
		a.id = 1234;
		a.name = "鈴木太郎";
		
		studentCard b = new studentCard();
		b.id = 1235;
		b.name = "佐藤花子";
		
		System.out.println("aのidの値は"+a.id);
		System.out.println("aのnameの値は"+a.name);
		System.out.println("bのidの値は"+b.id);
		System.out.println("bのnameの値は"+a.name);
	}
}
