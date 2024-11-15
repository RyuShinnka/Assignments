class studentCard{
	int id;
	String name;
}
public class List05_03 {
	public static void main(String[] args) {
		studentCard[] cards = new studentCard[3];
		cards[0] = new studentCard();
		cards[0].id = 1234;
		cards[0].name = "鈴木太郎";
		
		cards[1] = new studentCard();
		cards[1].id = 1235;
		cards[1].name = "佐藤花子";
		
		cards[2] = new studentCard();
		cards[2].id = 1236;
		cards[2].name = "山田二郎";
		
		for(int i=0;i<cards.length;i++) {
			System.out.println("cards["+i+"]のidは"+cards[i].id+"、nameは"+ cards[i].name);
		}
	}
}
