//⑤	クラス名　Section 3_5				
//	5人で動物園に行きます。5人分の入園料を計算し表示します。				
//	年齢の値は代入して処理します。				
//	Aさんは65歳です、Bさんは25歳、Cさんは12歳				
//	Dさんは3歳、Eさんは40歳です。				
//	年齢を代入して一人一人処理を行うプログラム				

public class Section3_5 {
	public static void main(String[] args) {
        int a=65;
        int b=25;
        int c=12;
        int d=3;
        int e=40;
        int total=0;//5人分の入園料を計算
        //Aさん
        if(a>=60) {
            total+=300;
        }else if(a>=20&&a<60) {
            total+=1000;
        }else if(a>=5&&a<20) {
            total+=500;
        }else {
            total+=0;
        }
        //Bさん
        if(b>=60) {
            total+=300;
        }else if(b>=20&&b<60) {
            total+=1000;
        }else if(b>=5&&b<20) {
            total+=500;
        }else {
            total+=0;
        }
        //Cさん
        if(c>=60) {
            total+=300;
        }else if(c>=20&&c<60) {
            total+=1000;
        }else if(c>=5&&c<20) {
            total+=500;
        }else {
            total+=0;
        }
        //Dさん
        if(d>=60) {
            total+=300;
        }else if(d>=20&&d<60) {
            total+=1000;
        }else if(d>=5&&d<20) {
            total+=500;
        }else {
            total+=0;
        }
        //Eさん
        if(e>=60) {
            total+=300;
        }else if(e>=20&&e<60) {
            total+=1000;
        }else if(e>=5&&e<20) {
            total+=500;
        }else {
            total+=0;
        }
        System.out.println("5人分の入園料は合計で " + total + " 円です。");
    }
}
