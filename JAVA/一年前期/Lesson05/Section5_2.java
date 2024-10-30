//10から１００までの整数の範囲から３の倍数のみを合計する
//合計が100を超えた時の整数と合計を表示する


public class Section5_2 {
    public static void main(String[] args) {
        int sum = 0;

        // 10から100までの3の倍数を合計
        for (int i = 10; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
          //合計が100を超えた時の整数と合計を表示する
            if(sum>100) {
            	System.out.println("整数: " + i + "合計:" + sum);
            	break;
        }
        }// 合計を表示
        System.out.println("10から100までの3の倍数の合計: " + sum);
    }
}


