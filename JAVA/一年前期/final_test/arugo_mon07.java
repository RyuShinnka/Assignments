// アルゴリズム期末試験
// 問題7

public class arugo_mon07 {
    public static void main(String[] args) {
        int[] TBL = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
        int sum = 0; // 合計値
        int count = 0; // カウント
        int avg = 0; // 平均値

        // 配列のインデックス4から12まで
        for (int i = 4; i < 13; i++) {
            sum += TBL[i];
            count++;
        }
        avg = sum / count;
        

        // 合計値と平均値を出力
        System.out.println("合計値：" + sum);
        System.out.println("平均値：" + avg);
    }
}
