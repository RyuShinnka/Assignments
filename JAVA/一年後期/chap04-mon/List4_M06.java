public class List4_M06 {
	public static int getAbsoluteValue(int value) {
        // 値が負であれば正に変換する
        if (value < 0) {
            value = -value;
        }
        return value;
    }
	public static boolean isSameAbsoluteValue(int i, int j) {
		return getAbsoluteValue(i) == getAbsoluteValue(j);
    }

    public static void main(String[] args) {
    	int i = 3;
    	int j = -3;
    	System.out.println(i+" の絶対値と "+j+" の絶対値は等しいですか?=>"+isSameAbsoluteValue(i,j));
    }
}
