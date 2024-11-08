public class List4_M04 {
	public static int getAbsoluteValue(int value) {
        // 値が負であれば正に変換する
        if (value < 0) {
            value = -value;
        }
        return value;
    }

    public static void main(String[] args) {
    	int num = -39;
    	System.out.println(num+"の絶対値は："+getAbsoluteValue(num));
    }
}
