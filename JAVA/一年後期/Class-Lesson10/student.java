class Student {
    static double avg = 0; // 平均点
    static int sum = 0; // 成績点の合計
    static int count = 0; // 人数カウント

    int studentId; // 学籍番号 (1000～)
    String name; // 氏名
    int score; // 成績点 (0～100)
    int rank; // 順位

    // コンストラクタ
    Student(int studentId, String name, int score) {
        this.studentId = studentId;
        this.name = name;
        this.score = score;
        count++;
        sum += score;
    }

    // クラスメソッド: 成績点の平均を求める
    static double 平均を求める(Student[] students) {
        avg = (double) sum / count;
        return avg;
    }

    // クラスメソッド: 平均点以上の人数を求める
    static int 平均点以上の人数を求める(Student[] students) {
        int num = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].score >= avg) {
                num++;
            }
        }
        return num;
    }

    // インスタンスメソッド: 成績順位を計算し、順位を配列として返す
    int[] getRanks(Student[] students) {
        int n = students.length;
        int[] ranks = new int[n];
        for (int i = 0; i < n; i++) {
            ranks[i] = 1; // 初期順位を1に設定
            for (int j = 0; j < n; j++) {
                if (students[j].score > students[i].score) {
                    ranks[i]++; // 高い成績があれば順位を下げる
                }
            }
            students[i].rank = ranks[i]; // 順位をフィールドに代入
        }
        return ranks;
    }

    // インスタンスメソッド: 学生情報を表示
    static void printInfo(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("学籍番号: " + students[i].studentId);
            System.out.println("氏名: " + students[i].name);
            System.out.println("成績点: " + students[i].score);
            System.out.println("順位: " + students[i].rank);
            System.out.println("----------------------");
        }
    }
}
