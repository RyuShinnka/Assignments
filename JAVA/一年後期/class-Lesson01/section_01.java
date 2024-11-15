//Javaプロジェクト名			Class-Lesson01
//クラス宣言とフィールド宣言			
//問題1			
//	＜クラス宣言　StudentCard＞		
//	クラスの宣言を行う。		
//	フィールド宣言は下記の内容とする、変数名は任意		
//	名前	String型	
//	身長	int型	
//	体重	int型	
//			
//	＜メインクラス名：section_01＞		
//	２人のデータを実態化し、結果を表示する		
//	身長はｃｍ単位・体重はｋｇ単位とする		
//			
//	下記の値を代入		
//	１人目	各自の名前	
//		各自の身長	
//		各自の体重	
//			
//	２人目	鈴木次郎	
//		170	ｃｍ
//		65	ｋｇ
class StudentCard{
	String name;
	int height;
	int weight;
}
public class section_01 {
	public static void main(String[] args) {
		StudentCard a = new StudentCard();
		a.name = "シンカ";
		a.height = 178;
		a.weight = 60;
		
		StudentCard b = new StudentCard();
		b.name = "鈴木次郎";
		b.height = 170;
		b.weight = 65;
		
		System.out.println(a.name+"の身長は"+a.height+"cm,体重は"+a.weight+"kgです。");
		System.out.println(b.name+"の身長は"+b.height+"cm,体重は"+b.weight+"kgです。");
	}
}
