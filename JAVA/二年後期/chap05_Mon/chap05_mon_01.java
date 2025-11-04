//① String 型の ArrayList を colorList という変数名で生成してください。
//② colorList に”red”,”green”,”blue”,”white”を追加してください。
//③ 繰返し文を用いて「番目の色は**です。」と出力してください

import java.util.ArrayList;
public class chap05_mon_01 {
	public static void main(String args[]) {
		ArrayList<String> colorList = new ArrayList<String>();
		//末尾に追加
		colorList.add("red");  //0
		colorList.add("green"); //1
		colorList.add("blue"); //2
		colorList.add("white");//3
		colorList.add("black");//4
		
		for(int i=0;i<colorList.size();i++){
			System.out.println((i+1)+ "番目の色は"+ colorList.get(i)+ "です。");
		}
	}
}
