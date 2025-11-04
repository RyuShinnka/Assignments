package main_life;
import java.util.Scanner;

import class_life.Shops;

public class chap_pack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // 店舗数の入力
        System.out.print("店舗数を入力=>");
        int num = s.nextInt();
        
        // 店舗情報を格納する配列
        Shops[] shop = new Shops[num];
        
        // 各店舗のデータ入力
        for(int i = 0; i < shop.length; i++) {
            System.out.println("======店舗" + (i + 1) + "のデータを入力してください======");
            System.out.print("店舗" + (i + 1) + "の店番を入力＝＞");
            int shop_id = s.nextInt();
            System.out.print("店舗" + (i + 1) + "の店名を入力＝＞");
            String shop_name = s.next();
            System.out.print("店舗" + (i + 1) + "の売上額を入力＝＞");
            double uriage = s.nextDouble();
            System.out.print("店舗" + (i + 1) + "の目標額を入力＝＞");
            double mokuhyo = s.nextDouble();

            // Shopsオブジェクト作成と達成率計算
            shop[i] = new Shops(shop_id, shop_name, uriage, mokuhyo);
            shop[i].calc(); // 達成率計算
        }

        // 各店舗のデータ表示と評価
        for(int i = 0; i < shop.length; i++) {
            shop[i].display();  // 店舗情報の表示
            shop[i].hyouka();   // 評価の表示
        }

        s.close(); // スキャナーのクローズ
    }
}
