// 構成要素型がint型の配列（構成要素数は５：newによって本体を生成）
//配列名：Ａｒｒａｙ１「5]
//Ａｒｒａｙ１「1]に37を代入
//Ａｒｒａｙ１「2]に51を代入
//Ａｒｒａｙ１「4]にＡｒｒａｙ[１]×２を代入
//
//配列Ａｒｒａｙの全要素を表示

public class Array01_1 {
	public static void main(String[] args) {
        int[] Array1 = new int[5];
        
        // Array1[1]に37を代入
        Array1[1] = 37;
        
        // Array1[2]に51を代入
        Array1[2] = 51;
        
        // Array1[4]にArray1[1]×2を代入
        Array1[4] = Array1[1] * 2;
        
        // 配列Array1の全要素を表示
        for (int i = 0; i < Array1.length; i++) {
            System.out.println("Array1[" + i + "] = " + Array1[i]);
        }
    }
}
