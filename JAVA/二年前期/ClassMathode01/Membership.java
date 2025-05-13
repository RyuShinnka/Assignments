class Membership {
    static int number = 1000; // 会員番号の初期値（1000からスタートし、1人登録ごとに+1）
    static int counte = 0;    // 小学生の人数カウント
    static int countj = 0;    // 中学生の人数カウント
    static int counth = 0;    // 高校生の人数カウント

    String name;   // 氏名
    int school;    // 学校区分（1: 小学校, 2: 中学校, 3: 高校）
    int grade;     // 学年
    int num;       // 個別に割り振られた会員番号

    // コンストラクタ：名前・学校区分・学年を初期化し、個別の会員番号を割り当てる
    Membership(String n, int s, int g) {
        this.name = n;
        this.school = s;
        this.grade = g;
        this.num = Membership.number++; // 個別の会員番号を設定してからインクリメント
    }

    // 会員情報を表示するメソッド
    void showInfo() {
    	System.out.println();
        System.out.println("会員番号：" + num); // 個別の会員番号を表示
        System.out.println("名前：" + this.name);

        // 学校区分を表示
        if (this.school == 1) {
            System.out.println("小学校生です。");
        }
        if (this.school == 2) {
            System.out.println("中学校生です。");
        }
        if (this.school == 3) {
            System.out.println("高校生です。");
        }

        // 学年を表示
        System.out.println("学年：" + this.grade + "年です。");
    }

    // 学校別の人数をカウントするメソッド
    void count() {
        if (this.school == 1) {
            Membership.counte++;
        } else if (this.school == 2) {
            Membership.countj++;
        } else {
            Membership.counth++;
        }
    }

    // 中学生の割合を計算して表示するクラスメソッド
    static void calc() {
    	 System.out.println();
        double sum = Membership.counte + Membership.countj + Membership.counth;
        int result = (int)((Membership.countj * 100) / sum); // 中学生の割合（整数％）
        System.out.println("中学生の人数は" + result + "％です。");
    }
}
