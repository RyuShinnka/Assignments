public class ensyu07_7 {

    // 文字をn回繰り返して表示するメソッド
    static void putChars(char C, int n) {
        for(int i = 0; i < n;i++){
        	System.out.print(C);
        }
    }

    // '*'文字をn回繰り返して表示するメソッド
    static void putStars(int n) {
        putChars('*', n);
    }

    public static void main(String[] args) {
         int height = 9;// 三角形の高さ
         
        // 直角三角形を表示
         for(int i= 1; i <= height;i++) {
        	 putStars(i);
        	 System.out.println();
         }
    }
}