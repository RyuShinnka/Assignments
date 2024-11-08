//応用問題１
//15個数字が格納されている1次元配列STR[15]
//数字を逆順に入れ替えた後表示しなさい。
public class arugo02_01 {
	public static void main(String args[]) {
		int [] str = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println("逆順したSTRは:");
		System.out.print("STR[15]=");
    for(int i = str.length -1 ;i >=0 ;i--){
      System.out.print(str[i]+" ");
      if(str[i] == 1) {
	System.out.print("]");
     }else {
	System.out.print(",");
	}
    }
}

}
