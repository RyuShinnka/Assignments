//応用問題１
//15個数字が格納されている1次元配列STR[15]
//数字を逆順に入れ替えた後表示しなさい。
public class arugo02_01 {
	public static void main(String args[]) {
		int [] str = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for(int x = 0; x<str.length / 2;x++) {
			// str.length / 2 しないと要素が再度入れ替わって元に戻ってしまう
			int temp = str[x];
			str[x] = str[(str.length-1) - x] ;//(str.length-1)は　15 - 1　だから　
			str[(str.length-1) - x] = temp;
		}
		System.out.println("逆順したSTRは:");
		System.out.print("STR[15]=");
		for (int i = 0; i<str.length;i++) {
			System.out.print(str[i]+",");
		}
	}

}
