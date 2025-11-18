import java.io.File;
public class List07_11 {
	public static void main(String[] args) {
		File dir1 = new File("testA");
		File dir2 = new File("testA/testB/testC");
//		実行パスtestAという名前のフォルダを作ります
		if(dir1.mkdir()) {
			System.out.println(dir1+ "を作成しました");
		}else {
			System.out.println(dir1+ "の作成に失敗しました");
		}
//	　実行パスにtestA￥testB￥testCという階層のフォルダを一度に作ります
		if(dir2.mkdirs()) {
			System.out.println(dir2 +"を作成しました");
		}else {
			System.out.println(dir2+ "の作成に失敗しました");
		}
		
		String[] fileList = dir1.list();
		for(String s: fileList) {
			System.out.println(s);
		}
		System.out.println("");
	}
}
