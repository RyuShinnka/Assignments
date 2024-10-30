import java.util.Scanner;

public class mogi_2 {
    public static void main(String[] args) {
        // Scannerを作成
        Scanner s = new Scanner(System.in);
        
        // 初期値として最大値と最小値を設定
        int max = -1;
        
        int min = 301;
        
        // 5回の繰り返し、各人のゲーム点を入力
        for (int i = 1; i <= 5; i++) {
            
            System.out.print("第" + i + "名のゲーム点を入力してください(ゲーム点は、0点～300点です)=>");
            
            // ゲーム点を入力
            int num = s.nextInt();
            
            // 入力された点数が最大値より大きい場合、最大値を更新する
            if (num > max) {
                max = num;
            }
            
            // 入力された点数が最小値より小さい場合、最小値を更新する
            if (num < min) {
                min = num;
            }
        }
        
        // 5名のゲーム点の最大値と最小値を画面に表示する
        System.out.println("5名のゲーム点の最大値は " + max + " 点です。");
        System.out.println("5名のゲーム点の最小値は " + min + " 点です。");
        s.close();
    }
}
