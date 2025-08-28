import java.util.Scanner;
public class ensyu06_04 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("クラス数を入力＝＞");
        int ks = s.nextInt();
        int [][] seiseki = new int[ks][2];
        int classAvg = 0;
        int allAvg = 0;
        int result = 0;
        int allStu = 0;
        int sum = 0;

        System.out.println("");
        // 各クラスの人数と全員の点数を入力
        for (int i = 0; i < ks; i++) {
            System.out.print("クラス" + (i + 1) + "の人数を入力＝＞");
            seiseki[i][0] = s.nextInt();  // 人数
            System.out.print("クラス" + (i + 1) + "の全員の点数を入力＝＞");
            seiseki[i][1] = s.nextInt();  // 合計点
        }
        System.out.println("");
        // 各クラスの合計点と平均点を求める
        for (int i = 0; i < ks; i++) {
            result = seiseki[i][1];  // クラスの合計点
            classAvg = result / seiseki[i][0];  // クラスの平均点
            System.out.println("クラス" + (i + 1) + "の合計点は：" + result + "； 平均点は：" + classAvg + "です。");

            allStu += seiseki[i][0];  // 全体の生徒数を合計
            sum += seiseki[i][1];  // 全体の得点を合計
        }

        // 全体の平均点を求める
        allAvg = sum / allStu;
        System.out.println("全体の合計点は：" + sum + "； 平均点は：" + allAvg + "です。");
        
        s.close();
    }
}