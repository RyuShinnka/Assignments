class TestCard{
//		クラスフィールド宣言
		int ID = 0;
		int scores = 0;
//		1．コンストラクト
		TestCard(){
			ID = 0;
			scores = 0;
		}
//		2.コンストラクト
		TestCard(int ID,int scores) {
			this.ID = ID;
			this.scores = scores;
		}
//		3.コンストラクト
		TestCard(int ID) {
			this.ID = ID;
			scores = 0;
		}
	}
public class section_04 {

	public static void main(String[] args) {
		TestCard test1 = new TestCard();
		TestCard test2 = new TestCard(24199,99);
		TestCard test3 = new TestCard(23999);
		// 各インスタンスの情報を表示
		System.out.println("ID:"+test1.ID+", 成績点："+test1.scores);
		System.out.println("ID:"+test2.ID+", 成績点："+test2.scores);
		System.out.println("ID:"+test3.ID+", 成績点："+test3.scores);
		
	}
}
