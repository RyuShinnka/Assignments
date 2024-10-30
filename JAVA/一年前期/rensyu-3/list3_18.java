import java.util.Scanner;
public class list3_18 {
	public static void main(String[] args) {
		int kazu,gokei,tosi,cnt,ryoukin,c1,c2,c3,c4,c5,c6;
		Scanner s = new Scanner(System.in);
		gokei=0;
		cnt=0;
		ryoukin=0;
		c1=0;
		c2=0;
		c3=0;
		c4=0;
		c5=0;
		c6=0;
		System.out.print("総人数を入力してください　ー＞");
		kazu = s.nextInt();
		for(int i = 1; i <= kazu;i++) {
			System.out.print("年齢を入力してください　ー＞");
			tosi = s.nextInt();
			if(tosi <=3 ) {
				c1+=1;
				ryoukin+=0;
			}else if(tosi <= 12){
				c2+=1;
				ryoukin+=500;
			}else if(tosi <= 18) {
				c3+=1;
				ryoukin+=800;
			}else if(tosi <= 60) {
				c4+=1;
				ryoukin+=1000;
			}else if(tosi <= 80) {
				c5+=1;
				ryoukin+=700;
			}else {
				c6+=1;
				ryoukin+=300;
			}
			gokei+=ryoukin;
			cnt++;
		}
		System.out.println("総額は　＞"+gokei);
		System.out.println("3歳以下："+c1);
		System.out.println("12歳以下："+c2);
		System.out.println("１８歳以下"+c3);
		System.out.println("６０歳以下"+c4);
		System.out.println("８０歳以下"+c5);
		System.out.println("81以上"+c6);
		s.close();
	}
}
