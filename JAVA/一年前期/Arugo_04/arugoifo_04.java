//	分岐処理応用　問題4



import java.util.Scanner;
public class arugoifo_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double w,h,bmi;
		// 体重の入力
        System.out.print("体重を入力してください（kg）：");
        w = s.nextDouble();
        
        // 身長の入力
        System.out.print("身長を入力してください（m）：");
        h = s.nextDouble();
        
        // BMIの計算
        bmi = w / (h * h);
        
        if(bmi < 18.5) {
        	System.out.print("瘦せ");
        }else if(bmi < 25) {
        	System.out.print("普通");
        }else if(bmi < 30) {
        	System.out.print("肥満1度");
        }else if(bmi < 35) {
        	System.out.print("肥満2度");
        }else if(bmi < 40) {
        	System.out.print("肥満3度");
        }else {
        	System.out.print("肥満4度");
        }
        s.close();
	}
}
