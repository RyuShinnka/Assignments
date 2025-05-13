import java.util.Scanner;

class Bank {
    static int number = 21000; // 初期口座番号（以後自動で +1）
    int num;        // 個別口座番号
    String name;    // 口座名義
    int depAmo;     // 預金残高
    int password;   // パスワード（4桁）

    // コンストラクタ：口座を作成し、口座番号を割り当て
    Bank(String n, int d, int p) {
        this.num = number++;
        this.name = n;
        this.depAmo = d;
        this.password = p;
    }

    // 入金処理メソッド
    void depProc(int amount) {
        System.out.println();
        this.depAmo += amount;
        System.out.println("---------入金処理完了---------");
    }

    // 出金処理メソッド
    void WithdraProc(int amount) {
        System.out.println();
        this.depAmo -= amount;
        System.out.println("---------出金処理完了---------");
    }

    // 預金残高を表示するメソッド
    void DepBala() {
        System.out.println();
        System.out.println("預金残高：" + this.depAmo);
    }

    // 口座情報を表示するメソッド
    void showInfo() {
        System.out.println();
        System.out.println("口座番号：" + this.num);
        System.out.println("　名前　：" + this.name);
        System.out.println("　預金額：" + this.depAmo);
        System.out.println("パスワード：" + this.password);
    }

    // 指定された口座番号が存在するか検索（存在すればインデックスを返す）
    static int findAccount(Bank[] account, int num) {
        for (int i = 0; i < account.length; i++) {
            if (account[i] != null && num == account[i].num) {
                return i;
            }
        }
        return 99999; // 見つからなかった場合のエラーコード
    }

    // パスワード認証を行うメソッド（合うまで繰り返す）
    static void checkPassword(Bank[] account, int index) {
        Scanner s = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.print("パスワードを入力=>");
            int password = s.nextInt();
            if (password == account[index].password) {
                check = false;
            } else {
                System.out.println("パスワード入力エラー、再入力してください。");
            }
        }
    }
}
