// 抽象クラス：乗り物
abstract class Vehicle {
    protected int speed; // スピード（共通）

    // スピードを設定するメソッド
    public void setSpeed(int s) {
        speed = s;
        System.out.println("速度を" + speed + "にしました。");
    }

    // 抽象メソッド（各乗り物でオーバーライド）
    public abstract void show();
}


// 車クラス（Vehicleを継承）
class Car extends Vehicle {
    private int number;        // ナンバー
    private double gasoline;   // ガソリン量

    // コンストラクタ
    public Car(int number, double gasoline) {
        this.number = number;
        this.gasoline = gasoline;
        System.out.println("ナンバー" + this.number + "ガソリン量" + this.gasoline + "の車を作成しました。");
    }

    // 情報表示
    public void show() {
        System.out.println("車のナンバーは" + this.number + "です。");
        System.out.println("ガソリン量は" + this.gasoline + "です。");
        System.out.println("速度は" + this.speed + "です。");
    }
}


// 飛行機クラス（Vehicleを継承）
class Aircraft extends Vehicle {
    private int flightNumber; // 便名

    // コンストラクタ
    public Aircraft(int flightNumber) {
        this.flightNumber = flightNumber;
        System.out.println("便" + this.flightNumber + "の飛行機を作成しました。");
    }

    // 情報表示
    public void show() {
        System.out.println("飛行機の便は" + this.flightNumber + "です。");
        System.out.println("速度は" + this.speed + "です。");
    }
}


// メインクラス
public class Section08_1 {
    public static void main(String[] args) {

        // 車のインスタンス生成
        Car car = new Car(1234, 20.5);

        // 車の速度設定
        car.setSpeed(60);

        // 飛行機のインスタンス生成
        Aircraft aircraft = new Aircraft(232);

        // 飛行機の速度設定
        aircraft.setSpeed(500);

        System.out.println(); // 改行

        // 車の情報表示
        car.show();

        // 飛行機の情報表示
        aircraft.show();
    }
}
