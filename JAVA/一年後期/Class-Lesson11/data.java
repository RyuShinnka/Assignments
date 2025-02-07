class Data {
    static int blueCapCount = 0; // 青キャップの人数
    static int memberId = 1000; // 会員番号の初期値

    int id; // 会員番号
    String name; // 氏名
    int grade; // 級
    String capColor; // キャップの色
    int year; // 学年

    // コンストラクタ
    Data(String name, int grade, int year) {
        this.id = memberId++; //会員番号：	登録順1000～　連番で登録		
        this.name = name;
        this.grade = grade;
        this.capColor = ""; // 初期値は空文字
        this.year = year;
    }
//    ①クラスメソッド
    static String hyoka(Data[] members) {
    	double ratio = (double) blueCapCount / ((memberId % 10)+1);
        if (ratio > 0.4) {
            return "優秀";
        } else if (ratio >= 0.3) {
            return "普通";
        } else {
            return "指導";
        }
    }
//    3	クラスメソッド名６年生の人数を求め戻り値とする
    public static int grade6Count(Data [] members) {
    	int count = 0;
    	for(int i = 0; i < members.length;i++) {
    		if(members[i].grade == 6) {
    			count++;
            }
    	}
    	return count;
    }

    
    // インスタンスメソッド: 個人情報を表示
    void printInfo() {
        System.out.println("会員番号: " + id);
        System.out.println("会員氏名: " + name);
        System.out.println("級: " + grade);
        System.out.println("キャップの色: " + capColor);
        System.out.println("学年: " + grade);
        System.out.println("----------------------");
    }
//  インスタンスメソッド:級を判定してキャップの色を代入
    void setCapColor(Data[] members) {
    	if(grade == 1 || grade == 2) {
    		capColor = "青";
    		Data.blueCapCount++;
    	}else if(grade >= 3 &&grade <= 5) {
    		capColor = "黄色";
    	}else if(grade >= 6 &&grade <= 8) {
    		capColor = "赤";
    	}
    }
 

}