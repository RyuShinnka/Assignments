//②	クラス名　Section 3_2						
//	変数Ａ・Ｂ・Ｃにそれぞれ値を代入し
//　（A＝5．6　　B＝9．9　　C＝3．2）						
//	最大値と最小値を表示しなさい。						

public class Section3_2 {
    public static void main(String[] args) {
        double a = 5.6;//変数a代入
        double b = 9.9;//変数b代入
        double c = 3.2;//変数c代入
        
        //Math.maxを使って最大値をmaxに代入
        double max = Math.max(a, Math.max(b, c));
        //Math.minを使って最小値をminに代入
        double min = Math.min(a, Math.min(b, c));
        //最大値と最小値を出力
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
    }
}

