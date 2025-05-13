import java.util.Scanner;

public class ClassMethode02_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Bank[] account = new Bank[20]; // 最大20人分の口座を保持
        int regNum = 5; // 登録人数（初期で5人）

        // 初期登録済み口座（5件）
        account[0] = new Bank("sato", 5000, 1111);
        account[1] = new Bank("suzuki", 8000, 2222);
        account[2] = new Bank("tanaka", 12000, 3333);
        account[3] = new Bank("takahashi", 3000, 4444);
        account[4] = new Bank("itou", 10000, 5555);

        // メインメニュー処理ループ
        boolean loop = true;
        while (loop) {
            System.out.println("\n【処理メニュー】");
            System.out.println("1：新規登録　2：入金処理　3：出金処理　4：預金残高表示　その他：終了");
            System.out.print("処理番号を入力=>");
            int menu = s.nextInt();

            switch (menu) {
                case 1: // 新規登録
                    System.out.print("名前を入力=>");
                    String name = s.next();
                    System.out.print("預金額を入力=>");
                    int dep = s.nextInt();
                    System.out.print("パスワード（4桁）を入力=>");
                    int pass = s.nextInt();
                    account[regNum] = new Bank(name, dep, pass);
                    System.out.println("✅ 新規登録完了。口座番号：" + account[regNum].num);
                    regNum++;
                    break;

                case 2: // 入金処理
                    System.out.print("口座番号を入力=>");
                    int num2 = s.nextInt();
                    int b2 = Bank.findAccount(account, num2);
                    if (b2 != 99999) {
                        Bank.checkPassword(account, b2);
                        System.out.print("入金額を入力=>");
                        int amount = s.nextInt();
                        account[b2].depProc(amount);
                    } else {
                        System.out.println("❌ 口座が見つかりません。❌");
                    }
                    break;

                case 3: // 出金処理
                    System.out.print("口座番号を入力=>");
                    int num3 = s.nextInt();
                    int b3 = Bank.findAccount(account, num3);
                    if (b3 != 99999) {
                        Bank.checkPassword(account, b3);
                        System.out.print("出金額を入力=>");
                        int amount = s.nextInt();
                        account[b3].WithdraProc(amount);
                    } else {
                        System.out.println("❌ 口座が見つかりません。❌");
                    }
                    break;

                case 4: // 預金残高表示
                    System.out.print("口座番号を入力=>");
                    int num4 = s.nextInt();
                    int b4 = Bank.findAccount(account, num4);
                    if (b4 != 99999) {
                        Bank.checkPassword(account, b4);
                        account[b4].DepBala();
                    } else {
                        System.out.println("❌ 口座が見つかりません。❌");
                    }
                    break;

                default: // その他（終了）
                    System.out.println("🛑 🛑🛑プログラムを終了します。🛑🛑🛑");
                    loop = false;
                    break;
            }
        }

        // 最終的に登録された全員の口座情報を一覧表示
        System.out.println();
        System.out.println("---------登録者全員の表示START---------");
        for (int i = 0; i < account.length; i++) {
            if (account[i] != null) {
                account[i].showInfo();
            }
        }
        System.out.println("---------登録者全員の表示END---------");

        s.close(); // Scannerを閉じる
    }
}
