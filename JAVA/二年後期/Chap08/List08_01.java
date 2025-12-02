import javax.swing.JFrame;
public class List08_01 {
	public static void main(String args[]) {
//		JFrameクラスのインスタンスを作成します
		JFrame frame = new JFrame();
//		右上の[ｘ]ボタンでアプリケーションが終了するようにします
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		フレームのサイズを指定します
		frame.setSize(300, 200);
//		フレームを表示します
		frame.setVisible(true);
	}
}
