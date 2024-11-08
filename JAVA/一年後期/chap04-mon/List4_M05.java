public class List4_M05 {
	public static double getAverage(double a ,double b, double c) {
        return (a + b + c) / 3 ;
    }

    public static void main(String[] args) {
    	double result = getAverage(3.0,1.0,3.9);
    	System.out.println("平均値は："+result);
    }
}
