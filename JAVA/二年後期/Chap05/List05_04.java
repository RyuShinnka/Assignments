import java.util.HashMap;
public class List05_04 {
	public static void main(String[] args) {
//		キーと値がともにString型のマップオブジェクトを生成します
		HashMap<String, String> map = new HashMap<String, String>();
		
//		キーと値のペアを追加します
		map.put("first name", "太郎");
		map.put("last name", "山田");
		map.put("address", "茨城県つくば市　999-99-99");
		map.put("tel", "029-000-0000");
		
		System.out.println(map.entrySet());// 格納されているキーと値のペアを出力します
		System.out.println(map.values());// 格納されている値を出力します
		System.out.println(map.keySet());// 格納されているキーを出力します
		
//		キーに対応する値を出力しまう
		System.out.println(map.get("first name"));
		System.out.println(map.get("last name"));
		System.out.println(map.get("address"));
		System.out.println(map.get("tel"));
		System.out.println(map.get("email"));// emailというキーのオブジェクトは存在しません
	}
}
