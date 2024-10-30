
public class arugo_05_1 {
	public static void main(String[] args) {
        int sum = 0;
        int start = 1;
        int end = 50;
        int count=0;
        double avg;
        
        // 合計を計算
        for (int i = start; i <= end; i++) {
            sum += i;
            count += 1;
        }
        	
        // 平均を計算
        avg = (double)sum / count;
        
        // 合計と平均を表示
        System.out.println("1から50までの合計: " + sum);
        System.out.println("1から50までの平均: " + avg);
    }
}
