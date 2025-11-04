// Runnableインターフェースを実装したクラス
class SimpleThread implements Runnable {
    // スレッドが実行する処理
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i); // 0〜99を出力
        }
    }
}
public class Chap03_rensyu3_1 {
    public static void main(String[] args) {
        SimpleThread st = new SimpleThread();     // Runnableオブジェクトを作成
        Thread t = new Thread(st);                // Threadに渡してスレッドを生成
        t.start();                                // スレッドを開始
    }
}
