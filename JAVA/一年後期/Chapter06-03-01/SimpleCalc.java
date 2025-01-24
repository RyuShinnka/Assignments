// P181 クラス定義ファイル
public class SimpleCalc {
	static double result;
    double base; // 三角形の底辺
    double height; // 三角形の高さ

    // コンストラクタ
    SimpleCalc(double base, double height) {
        this.base = base; // 底辺を設定
        this.height = height; // 高さを設定
    }

    // 三角形の面積を計算する静的メソッド
    static void getTriangleArea(double base, double height) {
        result = base * height / 2.0; // 底辺×高さ÷2で面積を計算
    }
    static void printInfo() {
    	System.out.println("三角形の面積は"
                + result + "です。");
    }
}
