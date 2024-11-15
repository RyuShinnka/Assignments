class studentCard{
	int id;
	String name;
}
public class List05_01 {
//	List05_01 P140
//	public static void main(String[] args) {
//		studentCard a = new studentCard();
//		a.id = 1234;
//		a.name = "鈴木太郎";
//		
//		studentCard b = new studentCard();
//		b.id = 1235;
//		b.name = "佐藤花子";
//		System.out.println("aのidの値は"+a.id);
//		System.out.println("aのnameの値は"+a.name);
//		System.out.println("bのidの値は"+b.id);
//		System.out.println("bのnameの値は"+b.name);
//	}
//	List05-02 P143
	public static void main(String[] args) {
		studentCard a = new studentCard();
		studentCard b = new studentCard();
		studentCard c = b;
		a.id = 1234;
		a.name = "鈴木太郎";
		
		b.id = 1235;
		b.name = "佐藤花子";
		
		System.out.println("aのidのは"+a.id+",nameは"+a.name);
		System.out.println("bのidのは"+b.id+",nameは"+b.name);
		System.out.println("cのidのは"+c.id+",nameは"+c.name);
		System.out.println("==========================================");
		
		c.id = 1236;
		c.name = "山田二郎";
		
		System.out.println("aのidのは"+a.id+",nameは"+a.name);
		System.out.println("bのidのは"+b.id+",nameは"+b.name);
		System.out.println("cのidのは"+c.id+",nameは"+c.name);
	}
}
