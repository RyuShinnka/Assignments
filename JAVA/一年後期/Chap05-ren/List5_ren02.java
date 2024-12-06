public class List5_ren02 {
	public static boolean ageCheck(Person p,int i) {
		if(p.age > i) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Person a = new Person();
		a.name = "高橋太郎";
		a.age = 19;
		Person b = new Person();
		b.name = "小林花子";
		b.age = 18;
		
		boolean result=ageCheck(b,20);
		System.out.println(b.name+"さんは20歳超えますか？"+result);
	}
}
