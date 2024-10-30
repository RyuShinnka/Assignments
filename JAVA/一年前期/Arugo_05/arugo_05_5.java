import java.util.Scanner;
public class arugo_05_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("総人数を入力してください");
		int atp= s.nextInt();//総人数
		int ind=1;//インデックス
		int age=0;//年齢
		
		//各年齢
		int age3=0,age12=0,age18=0,age59=0,age80=0,age81=0;
		
		int ne=0;//総金額
		while(ind <= atp) {
			System.out.println("年齢を入力してください");
			age = s.nextInt();
			if(age<=3) {
				age3++;
				ne+=0;
			}else if(age<=12) {
				age12++;
				ne+=500;
			}else if(age<=18) {
				age18++;
				ne+=800;
			}else if(age<=59) {
				age59++;
				ne+=1000;
			}else if(age<=80) {
				age80++;
				ne+=700;
			}else {
				age81++;
				ne+=300;
			}
			ind++;
		}
		System.out.println("3歳以下の人数："+age3);
		System.out.println("4～12歳の人数："+age12);
		System.out.println("13～18歳の人数："+age18);
		System.out.println("18～59歳の人数："+age59);
		System.out.println("60～80歳の人数："+age80);
		System.out.println("81歳以上の人数："+age81);
		System.out.println("総金額は："+ne);
		s.close();
	}
}
