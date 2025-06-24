import java.util.Scanner;

public class ouyou_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        TSB_students[] students = new TSB_students[5]; 

        // 5人分の情報を入力
        for(int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println("第"+ (i+1)+"目の生徒情報を入力してください");

            System.out.print("学籍番号を入力=>");
            int gakuseki  = s.nextInt(); // 学籍番号の入力

            System.out.print("学科名を入力（IT/office）=>");
            String gakka = "";
            // IT か office のみ有効
            while(true) {
                gakka = s.next();
                if(gakka.equals("IT") || gakka.equals("office")) {
                    break;
                } else {
                    System.out.print("入力エラー。ITかofficeを入力=>");
                }
            }

            System.out.print("氏名を入力=>");
            String namae = s.next(); // 氏名の入力

            // IT学科の処理
            if(gakka.equals("IT")) {
                System.out.print("アルゴリズムの成績を入力=>");
                int arugo = s.nextInt();

                System.out.print("JAVAの成績を入力=>");
                int java = s.nextInt();

                System.out.print("WEBの成績を入力=>");
                int web = s.nextInt();

                // IT_gakkaオブジェクトを生成し、配列に格納
                students[i] = new IT_gakka(gakka, gakuseki, namae, arugo, java, web);

                // 合格判定
                ((IT_gakka)students[i]).goukaku();

            } else { // office学科の処理
                System.out.print("Excelの成績を入力=>");
                int excel = s.nextInt();

                System.out.print("Wordの成績を入力=>");
                int word = s.nextInt();

                // Office_gakkaオブジェクトを生成し、配列に格納
                students[i] = new Office_gakka(gakka, gakuseki, namae, excel, word);

                // 合格判定
                ((Office_gakka)students[i]).goukaku();
            }
        }

        System.out.println();
        System.out.println("=========IT学科のデータを表示=========");

        // IT学科の学生データを出力
        for(int i = 0; i < students.length; i++) {
            if (students[i] instanceof IT_gakka) {
                students[i].showInfo();
            }
        }
        System.out.println("==================");

        System.out.println();
        System.out.println("=========オフィス学科のデータを表示=========");

        // Office学科の学生データを出力
        for(int i = 0; i < students.length; i++) {
            if (students[i] instanceof Office_gakka) {
                students[i].showInfo();
            }
        }
        System.out.println("==================");

        System.out.println();
        System.out.println("=========各学科の合格者の人数=========");
        // 合格者の人数を表示
        System.out.println("IT学科の合格者は"+ IT_gakka.gougaku_count +"人います。");
        System.out.println("オフィス学科の合格者は"+ Office_gakka.gougaku_count +"人います。");

        s.close(); 
    }
}
