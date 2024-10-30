
public class arugo_05_7 {
	public static void main(String[] args) {
        int num1 = 1000;
        int num2 = 45;
        int s = 0;
        int amr = num1;
        
        while (amr >= num2) {
            amr -= num2;
            s++;
        }
        
        System.out.println("商: " + s);
        System.out.println("余り: " + amr);
    }
}
