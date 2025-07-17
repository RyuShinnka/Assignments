import java.util.Scanner;
public class ensyu04_07 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("表示する記号の個数を入力 => ");
        int num = sc.nextInt();

        // * と + を交互に表示
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print("＊");
            } else {
                System.out.print("＋");
            }
        }
        // 最後に改行
        System.out.println();
        sc.close();
	}

}	
