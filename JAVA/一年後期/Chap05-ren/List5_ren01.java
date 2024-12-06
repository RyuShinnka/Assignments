
public class List5_ren01 {
	public static void printInfo(Person p) {
		System.out.println(p.name+"の年齢は"+p.age+"歳です");
	}
	public static void main(String[] args) {
		Person a = new Person();
		a.name = "高橋太郎";
		a.age = 19;
		Person b = new Person();
		b.name = "小林花子";
		b.age = 18;
		
		printInfo(a);
		printInfo(b);
	}
}
