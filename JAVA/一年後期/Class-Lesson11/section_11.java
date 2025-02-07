import java.util.Scanner;
public class section_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("登録する人数を入力->");
        int num = s.nextInt();
        Data[] members = new Data[num];
        for (int i = 0; i < num; i++) {
            System.out.println("第" + (i + 1) + "人目の登録情報を入力して　↓");
            System.out.print("名前->");
            String name = s.next();
            System.out.print("級->");
            int grade = s.nextInt();
            System.out.print("学年->");
            int year = s.nextInt();

            members[i] = new Data(name, grade, year);
            // 級を判定してキャップの色を代入
            members[i].setCapColor(members);
        }
        // すべてのメンバーを表示する
        System.out.println("---------すべてのメンバー情報---------");
        for (int i = 0; i < num; i++) {
            members[i].printInfo();
        }
        
        // １、赤いキャップの生徒情報を表示する
        System.out.println("---------赤いキャップの生徒情報---------");
        for (int i = 0; i < num; i++) {
            if (members[i].capColor == "赤") {
                members[i].printInfo();
            }
        }
        // ２、６年生の人数を表示する
        int count = Data.grade6Count(members);
        
        System.out.println("６年生の人数: " + count);
        System.out.println("------------------");

        // ３、青いキャップの生徒状況を表示する
        System.out.println("---------青いキャップの生徒状況---------");
        System.out.println("青のキャップの人数: " + Data.blueCapCount);
        System.out.println("青のキャップの割合: " + (double) Data.blueCapCount / ((Data.memberId % 10)+1));
        System.out.println("青のキャップの人数の判定結果: " + Data.hyoka(members));
        s.close();
    }
}