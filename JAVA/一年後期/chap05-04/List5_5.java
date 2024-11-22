//
//P-151参照とメソッド
//
//
class studentCard{
	int id;
	String name;
}
public class List5_5 {
	static void printCardInfo(studentCard card) {
		System.out.println("学籍番号："+card.id);
		System.out.println("氏名："+card.name);
	}
	static void clearCardInfo(studentCard card) {
		card.id = 0;
		card.name = "未定";
	}
	public static void main(String[] args) {
		studentCard a = new studentCard();
		a.id =1234;
		a.name = "鈴木太郎";
		
		printCardInfo(a);
		clearCardInfo(a);
		printCardInfo(a);
	}
}
//実行結果：
//学籍番号：1234
//氏名：鈴木太郎
//学籍番号：0
//氏名：未定
