class DataSet{
	int [] data = new int [100];
}
public class List04_01 {
	public static void main(String[] args) {
		System.out.println("空きメモリサイズ："+Runtime.getRuntime().freeMemory());
		DataSet[] data = new DataSet[10000];
		for(int i=0;i<10000;i++) {
			data[i] = new DataSet();
			if((i+1) % 100 == 0) {
				System.out.println("生成済みインスタンス数："+(i+1)+ "空きメモリサイズ："+Runtime.getRuntime().freeMemory());
			}  
		}
	}
}
