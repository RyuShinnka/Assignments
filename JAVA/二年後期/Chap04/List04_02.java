class DataSet1{
	int [] data = new int [1000];
}
public class List04_02 {
	public static void main(String[] args) {
		System.out.println("空きメモリサイズ："+Runtime.getRuntime().freeMemory());
		DataSet1[] data = new DataSet1[10000];
		for(int i=0;i<10000;i++) {
			data[i] = new DataSet1();
			data[i] = null;
			if(i % 100 == 99) {
				System.out.println("生成済みインスタンス数："+(i+1)+ "空きメモリサイズ："+Runtime.getRuntime().freeMemory());
			}  
		}
	}
}
