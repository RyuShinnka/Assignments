//③	クラス名　Section2scn_3				
//	BMIの計算をして、表示しなさい。				
//	身長と体重をキーボードから入力します。				
//	BMIの計算式は、体重ｋｇ÷（身長ｍ×身長ｍ）です。				
//	BMIは小数点切り捨てで表示する				

import java.util.Scanner;

public class Section2scn_3 {
	public static void main(String[] args) {
		Scanner nh = new Scanner(System.in);
		System.out.println("身長を教えてください。");
		double height = nh.nextDouble();
		System.out.println("体重を教えてください。");
		double weight = nh.nextDouble();
		double bmi = weight / (height * height);
		System.out.println("あなたのBMIは：" + (int)bmi + "です。");
		nh.close();
	}
}
