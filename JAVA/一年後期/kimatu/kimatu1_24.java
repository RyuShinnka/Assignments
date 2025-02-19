import java.util.Scanner;
public class kimatu1_24 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("会員登録人数＝＞");
		int end = stdin.nextInt();
		Member[] m_tbl = new Member[end];
		for(int i=0; i<end;i++) {
			System.out.println("\nーー"+(i+1)+"会員入力ーー");
			System.out.print("会員指名＝＞");
			String k_name = stdin.next();
			System.out.print("クラス＝＞");
			String k_rank = stdin.next();
			System.out.print("年齢＝＞");
			int k_age = stdin.nextInt();
			
			m_tbl[i] = new Member(k_name,k_rank,k_age);
			m_tbl[i].feeGet();
		}
		for(int x =0;x<end;x++) {
			m_tbl[x].printmehtod();
		}
		int h_no;
		int no;
		int id;
		do {
			System.out.print("変更（名前・１：コース・２：年齢３・：変更無・４）＝＞");
			no = stdin.nextInt();
			if(no == 4) {
				break;
			}else {
				do {
					System.out.print("修正する人の会員番号＝＞");
					h_no = stdin.nextInt();
					id = Member.Member_add_check(m_tbl,h_no);
				}while(id == -1);
				
				switch(no) {
				case 1:
					System.out.print("修正する人氏名＝＞");
					String i_name = stdin.next();
					m_tbl[id].Changename(i_name);
					m_tbl[id].printmehtod();
					break;
				case 2:
					System.out.print("修正するコース＝＞");
					String i_rank = stdin.next();
					m_tbl[id].Changerank(i_rank);
					m_tbl[id].printmehtod();
					break;
				case 3:
					System.out.print("修正する年齢＝＞");
					int i_age = stdin.nextInt();
					m_tbl[id].Changeage(i_age);
					m_tbl[id].printmehtod();
					break;
				}
			}
		}while(no != 4);
		
		for(int y =0;y<end;y++) {
			Member.sum_fee += m_tbl[y].fee;
		}
		System.out.print("本日の新規会費合計："+Member.sum_fee);
		stdin.close();
		
	}
}
