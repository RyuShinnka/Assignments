
class Member {
	static int m_kazu = 24000;
	static long sum_fee = 0;
	
	int m_no;
	String name;
	String rank;
	int age;
	int fee;
	
	Member(String in_name, String in_rank, int in_age){
		this.m_no = Member.m_kazu++;
		this.name = in_name;
		this.rank = in_rank;
		this.age = in_age;
		this.fee =0;
	}
	static int Member_add_check(Member[] t_add,int t_no) {
		int index = -1;
		for(int i = 0; i< t_add.length; i++) {
			if(t_no == t_add[i].m_no) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("一致する番号が有りません");
		}
		return (index);
	}
	void feeGet() {
		switch(this.rank) {
		case "A":
			this.fee = 8000;
			break;
		case "B":
			this.fee = 10000;
			break;
		case "C":
			this.fee = 12000;
			break;
		case "D":
			this.fee = 6500;
			break;
		}
	}
	void Changename(String ch_name) {
		this.name = ch_name;
	}
	void Changerank(String ch_Rank) {
		this.rank = ch_Rank;
		feeGet();
	}
	void Changeage(int ch_age) {
		this.age = ch_age;
	}
	void printmehtod() {
		System.out.println("ーーー会員情報ーーー");
		System.out.println("会員番号："+this.m_no);
		System.out.println("会員氏名："+this.name);
		System.out.println("コース："+this.rank);
		System.out.println("年齢："+this.age);
		System.out.println("月会費："+this.fee);
	}
}
