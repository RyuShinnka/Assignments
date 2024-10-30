//③	クラス名　Section 3_3						
//	処理番号を入力して、各処理を行う。			
//	ｓｗｉｔｃｈ文を使用すること			
//	処理番号：１の時は、三角形の面積を求める						
//	処理番号：２の時は、台形の面積を求める						
//	処理番号：３の時は、円の面積を求める						
//	処理番号：４の時は、正方形の面積を求める						
//	処理番号が１から４以外の時は、「入力番号エラー」と表示する。						
//							
//	各処理に必要データは、キーボードから入力する。						
//	結果表示は、分かりやすく見やすく表示する事						

import java.util.Scanner;//Scannerをimportする

public class Section3_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//Scannerをsを名する
        System.out.print("処理番号を入力してください：");
        int num = s.nextInt();//キーボードから入力した整数をnumに代入

        switch (num) {//switch判断
            case 1:
                System.out.println("三角形の面積を求める処理を実行します。");
                
                break;//ブロックする
            case 2:
                
                System.out.println("台形の面積を求める処理を実行します。");
              
                break;
            case 3:
                System.out.println("円の面積を求める処理を実行します。");
               
                break;
            case 4:
                System.out.println("正方形の面積を求める処理を実行します。");
                
                break;
            default:
                System.out.println("入力番号エラー");
        }
        s.close();//Scannerを停止する
    }
}

